public abstract class Proceso {
    protected String nombre;
    protected String PID;
    protected String accion;
//constructor
    public Proceso(String nombre, String PID, String accion) {
        this.nombre = nombre;
        this.PID = PID;
        this.accion = accion;
    }
//método abstracto
    public abstract String ejecutar(String PID, String nombre, String accion);

//getters
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