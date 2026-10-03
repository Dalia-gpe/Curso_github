package EjerciciosU1;
import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //registrar al paciente adicionalmente puede elejir n servivios 
		//facturar(mpnto total
		//imprimir los datos del paciente, numero de servicios y el total
		
		Paciente p=null;
		Servicios s=new Servicios();
		
		System.out.print("Ingrese el nombre del paciente: ");
        p.setNombre(sc.nextLine());

        System.out.print("Ingrese la edad: ");
        p.setEdad(sc.nextInt());

        System.out.print("Ingrese el genero (M/F): ");
        p.setGenero(sc.next().charAt(0));

 
        double montoTotal = 0;


        System.out.print("\n¿Cuántos servicios desea solicitar el paciente?: ");
        int cantidadServicios = sc.nextInt();

     
        for (int i = 1; i <= cantidadServicios; i++) {
            System.out.println("\n Selección de servicio " + i + " de " + cantidadServicios + " -");
            System.out.println("1) Biometría hemática - 300");
            System.out.println("2) Ultrasonido - 200");
            System.out.println("3) Consulta médica - $50");
            System.out.print("Escoja el número del tipo de servicio: ");
            
            int opcion = sc.nextInt();

     
            switch (opcion) {
                case 1:
                    montoTotal = montoTotal + 300;
                    System.out.println("-> Agregado: Biometría hemática (300)");
                    break;

                case 2:
                    montoTotal = montoTotal + 200;
                    System.out.println("-> Agregado: Ultrasonido (200)");
                    break;

                case 3:
                    montoTotal = montoTotal + 50;
                    System.out.println("-> Agregado: Consulta médica (50)");
                    break;

                default:
                    System.out.println("-> Opción no válida. No se sumará ningún servicio.");
                    break;
            }
        }

 
        System.out.println("        FACTURA DEL PACIENTE      ");
        System.out.println("");
        System.out.println("Nombre del paciente : " + p.getNombre());
        System.out.println("Edad                : " + p.getEdad());
        System.out.println("Género              : " + p.getGenero());
        System.out.println("Servicios elegidos  : " + cantidadServicios);
        System.out.println("Monto total a pagar : $" + montoTotal);
       

        sc.close();
    }
}