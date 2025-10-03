public class ProcesoIO extends Proceso{

    public ProcesoIO(String nombre, String PID, String accion) {
        super(nombre, PID, accion);
    }

    @Override
    public String ejecutar(String PID, String nombre, String accion) {
        return "Ejecutando Proceso IO "+ nombre + ":" + accion;
    }
}