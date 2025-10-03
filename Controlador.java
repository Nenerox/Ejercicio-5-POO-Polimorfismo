import java.util.ArrayList;
public class Controlador {
    private ArrayList<Proceso> procesos = new ArrayList<>();

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

    public void agregarProceso(Proceso p){
        procesos.add(p);
    }

    public void ejecutarProcesos(){
        for (Object elem : procesos) {
            Proceso p = (Proceso) elem;
            System.out.println(p.ejecutar(p.getPID(), p.getNombre(), p.getAccion()));
        }
    }

    public void ejecutarProceso(String PID){
        for (Object elem : procesos) {
            Proceso p = (Proceso) elem;
            if(p.getPID().equals(PID)){
                System.out.println(p.ejecutar(p.getPID(), p.getNombre(), p.getAccion()));
            }
        }
    }
    
    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }
}