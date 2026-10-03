package EjemplosU1;
import java.util.Scanner;
public class Ejemplo1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		Atleta a1=new Atleta();
		System.out.println("Ingresa el nombre=");
		a1.setNombre(sc.nextLine());
		System.out.println("Que disciplina entrena");
		a1.setDisciplina(sc.next());
		System.out.println("Registra las horas de entrenamiento");
		a1.setTiempo(sc.nextDouble());
		System.out.println("Status del usauario");
		
		
		System.out.println(a1.toString());
		
		sc.close();
	}

}
