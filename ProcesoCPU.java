public class ProcesoCPU extends Proceso{
   
    public ProcesoCPU(){
        super("ProcesoCPU", 1);
    }

    @Override
    public String ejecutar() {
        return "E";
    }
}