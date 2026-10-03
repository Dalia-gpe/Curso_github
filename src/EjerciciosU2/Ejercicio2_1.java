package EjerciciosU2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String salas[]= {"Sala A","Sala B","Sala C"};
	ArrayList <String> areas = new ArrayList <String>(Arrays.asList(salas));	
	ArrayList <Reserva> r=new ArrayList<Reserva>();
	
	int opcionM= 0;
	
	do {
        System.out.println("MENU DE APARTADOS");
        System.out.println("1. Registrar apartado");
        System.out.println("2. Modificar apartado");
        System.out.println("3. Organizar información por nombre");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
        opcionM = sc.nextInt();
        sc.nextLine();
	
        switch (opcionM) {

		case 1:

			System.out.println("\nSalas disponibles:");

			for (int i = 0; i < areas.size(); i++) {
				System.out.println((i + 1) + ". " + areas.get(i));
			}

			System.out.println("Elige la sala:");
			int sala = sc.nextInt();

			System.out.println("Horario de servicio 7 a 21 hrs");
			int hora;

			do {
				hora = sc.nextInt();
			} while (hora < 7 || hora > 21);
			
			sc.nextLine();

			String cadena = "Valor de la sala: " + areas.get(sala - 1)
					+ " horario: " + hora;

			boolean ocupada = false;

			for (int i = 0; i < r.size(); i++) {

				if (r.get(i).getApartado().equalsIgnoreCase(cadena)) {
					ocupada = true;
					break;
				}
			}

			if (!ocupada) {

				System.out.println("Nombre del profesor:");
				String nombre = sc.next();

				System.out.println("Nombre de la materia:");
				String materia = sc.next();

				System.out.println("Nombre de la carrera:");
				String carrera = sc.next();

				Reserva re = new Reserva(nombre, carrera, materia, cadena);

				r.add(re);

				System.out.println("Se realizo el apartado");

			} else {
				System.out.println("No se puede reservar porque la sala ya esta ocupada.");
			}

			break;

		case 2:

			if (r.size() == 0) {
				System.out.println("No hay reservas para modificar");
			} else {
				System.out.println("\nReservas:");
				for (int i = 0; i < r.size(); i++) {
					System.out.println((i + 1) + ". " + r.get(i));
				}

				System.out.println("Elige la reserva que quieres modificar:");
				int modificar = sc.nextInt();
				sc.nextLine();

				if (modificar >= 1 && modificar <= r.size()) {

					System.out.println("Nuevo nombre:");
					String nombre = sc.next();

					System.out.println("Nueva materia:");
					String materia = sc.next();

					System.out.println("Nueva carrera:");
					String carrera = sc.next();

					r.get(modificar - 1).setNombre(nombre);
					r.get(modificar - 1).setMateria(materia);
					r.get(modificar - 1).setCarrera(carrera);

					System.out.println("Reserva modificada");

				} else {
					System.out.println("Opcion no valida");
				}
			}

			break;

		case 3:

			if (r.size() == 0) {
				System.out.println("No hay reservas para organizar");
			} else {

				r.sort(Comparator.comparing(Reserva::getNombre));

				System.out.println("\nReservas organizadas por nombre:");

				for (int i = 0; i < r.size(); i++) {
					System.out.println(r.get(i));
				}
			}

			break;

		case 4:
			System.out.println("Programa terminado");
			break;

		default:
			System.out.println("Opcion no valida");
		}

	} while (opcionM != 4);

	sc.close();


	}
        
}