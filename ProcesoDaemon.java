public class ProcesoDaemon extends Proceso{
    
    public ProcesoDaemon(){
        super("Daemon", 2);
    }

    @Override
    public String ejecutar() {
        return "E";
    }
}