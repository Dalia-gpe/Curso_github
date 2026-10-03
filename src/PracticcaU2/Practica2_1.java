package PracticcaU2;
import java.util.Scanner;

import java.util.ArrayList;
public class Practica2_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		ArrayList<Registro> lis=new ArrayList<Registro>();
		boolean continuar=true;
		
		while (continuar) {
			System.out.println("tipo de vehiculo: ");
			System.out.println("1. Camion ($100)");
			System.out.println("2. Pick up ($80)");
            System.out.println("3. Auto o SUV ($60)");
            System.out.println("4. Motocicleta ($40)");
            System.out.print("Ingrese una opcion (1-5): ");
            
            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                
                String tipo = "";
                int cuota = 0;
                
                switch (opcion) {
                case 1:
                	tipo = "camion";
                	cuota =100;
                	break;
                case 2:
                    tipo = "Pick up";
                    cuota = 80;
                    break;
                case 3:
                    tipo = "Auto o SUV";
                    cuota = 60;
                    break;
                case 4:
                    tipo = "Motocicleta";
                    cuota = 40;
                    break;
                case 5:
                    continuar = false;
                    continue;
                default:
                    System.out.println("Opcion no valida.");
                    continue;
                }
                    System.out.print("Ingrese el ID del registro: ");
                    int id = sc.nextInt();
                    
              
                Registro reg = new Registro(tipo, cuota, cuota, id);
                lis.add(reg);

                System.out.println("-> Registrado: " + tipo + " ($" + cuota + ")");

            } else {
                System.out.println("Por favor ingrese un numero valido.");
                sc.next();
            }
        }

        int totalDinero = 0;

        System.out.println("REPORTE FINAL DE LA CASETA");

        for (Registro r : lis) {
            totalDinero += r.getCuota();
        }

        System.out.println(" Total de vehiculos registrados: " + lis.size());
        System.out.println(" Total recaudado en la caseta:  $" + totalDinero + " MXN");
        sc.close();
    }
}
	//Realizar un programa donde se resigistren los vehiculos q transmiten por la caseta de cobro Tampico-Veracruz
		//considere que los vehiculos pagan una cuota cada que cruzan por la caseta de acuerdo al tamaño del vehiculo.
		//camion = 100
		//pick up=80
		//Auto o SUV=60
		//motocicleta=40
