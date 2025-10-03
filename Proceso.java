public abstract class Proceso {
    private String nombre;
    private String PID;
    private String accion;

    public Proceso(String nombre, String PID, String accion) {
        this.nombre = nombre;
        this.PID = PID;
        this.accion = accion;
    }

    public abstract String ejecutar(String PID, String nombre, String accion);

    public String getNombre() {
        return nombre;
    }

    public String getPID() {
        return PID;
    }

    public String getAccion() {
        return accion;
    }
}