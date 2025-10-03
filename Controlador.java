import java.util.ArrayList;
public class Controlador {
    private ArrayList<Proceso> procesos = new ArrayList<>();

//método para crear procesos
    public Proceso crearProceso(String tipo, String nombre, String PID, String accion){
        Proceso p = null;
        switch(tipo){
            case "CPU":
                p = new ProcesoCPU(nombre, PID, accion);
                break;
            case "IO":
                p = new ProcesoIO(nombre, PID, accion);
                break;
            case "Daemon":
                p = new ProcesoDaemon(nombre, PID, accion);
                break;
        }
        return p;
    }
//método para agregar procesos a la lista
    public void agregarProceso(Proceso p){
        procesos.add(p);
    }
//metodo para ejecutar todos los procesos
    public void ejecutarProcesos(){
        for (Object elem : procesos) {
            Proceso p = (Proceso) elem;
            System.out.println(p.ejecutar(p.getPID(), p.getNombre(), p.getAccion()));
        }
    }
//metodo para ejecutar un proceso específico por su PID
    public void ejecutarProceso(String PID){
        for (Object elem : procesos) {
            Proceso p = (Proceso) elem;
            if(p.getPID().equals(PID)){
                System.out.println(p.ejecutar(p.getPID(), p.getNombre(), p.getAccion()));
            }
        }
    }
//getter
    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }
}