import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
    
        System.out.println("Bienvenido al sistema");
        while(opcion != 5){

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar proceso");
        System.out.println("2. Ejecutar proceso");
        System.out.println("3. Ejecutar todos los procesos");
        System.out.println("4. Ver lista de procesos");
        System.out.println("5. Salir");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de proceso (CPU, IO, Daemon):");
                    String tipo = scanner.nextLine();
                    System.out.println("Ingrese el nombre del proceso:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el PID del proceso:");
                    String PID = scanner.nextLine();
                    System.out.println("Ingrese la accion del proceso:");
                    String accion = scanner.nextLine();
                    controlador.agregarProceso(controlador.crearProceso(tipo, nombre, PID, accion));
                    break;
                case 2:
                    System.out.println("Ingrese el PID del proceso a ejecutar:");
                    PID = scanner.nextLine();
                    controlador.ejecutarProceso(PID);
                    break;
                case 3:
                    controlador.ejecutarProcesos();
                    break;
                case 4:
                    System.out.println("Lista de procesos:");
                    for (Proceso p : controlador.getProcesos()) {
                        System.out.println("Nombre: " + p.getNombre() + ", PID: " + p.getPID() + ", Accion: " + p.getAccion());
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println("Gracias por usar el sistema");
    }
}