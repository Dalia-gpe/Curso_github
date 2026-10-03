package TareaU1;
import java.util.Scanner;
public class Tarea1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Pelicula peli=new Pelicula();
		
		System.out.println("Ingresa los datos de la pelicula");
		System.out.println("");
		System.out.println("Titulo de la pelicula: ");
		peli.setTitulo(sc.nextLine());
		System.out.println("Genero de la pelicula:");
		peli.setGenero(sc.nextLine());
		System.out.println("Duracion de la pelicula: ");
		peli.setDuracion(sc.nextInt());
		System.out.println("Clasificacion de la pelicula (AA, A, B, B15, C) : ");
		sc.nextLine();
		peli.setClasificacion(sc.nextLine());
		
		sc.close();
		System.out.println("");
		System.out.println("-DATOS DE SU PELICULA-");
		System.out.println("");
		System.out.println("Titulo:"+peli.getTitulo());
		System.out.println("Genero:"+peli.getGenero());
		System.out.println("Duracion:"+peli.getDuracion()+"minutos");
		System.out.println("Clasificacion:"+peli.getClasificacion());
		
	}

}
