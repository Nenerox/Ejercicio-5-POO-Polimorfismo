public class ProcesoDaemon extends Proceso{
    
    public ProcesoDaemon(String nombre, String PID, String accion) {
        super(nombre, PID, accion);
    }

    @Override
    public String ejecutar(String PID, String nombre, String accion) {
        return "Ejecutando Proceso Daemon "+ nombre + ":" + accion;
    }
}