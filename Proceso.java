public abstract class Proceso {
    private String nombre;
    private int PID;

    public Proceso(String nombre, int PID) {
        this.nombre = nombre;
        this.PID = PID;
    }

    public abstract String ejecutar();

    public String getNombre() {
        return nombre;
    }

    public int getPID() {
        return PID;
    }
}