public class ProcesoCPU extends Proceso{
   
    public ProcesoCPU(String nombre, String PID, String accion) {
        super(nombre, PID, accion);
    }

    @Override
    public String ejecutar(String PID, String nombre, String accion) {
        return "Ejecutando Proceso CPU "+ nombre + ":" + accion;
    }
}