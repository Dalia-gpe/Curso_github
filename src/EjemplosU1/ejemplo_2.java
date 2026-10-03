package EjemplosU1;
import java.util.Scanner;
public class ejemplo_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Inscripcion alumno=new Inscripcion();
		
		
			System.out.print("ingresa tu nombre:");
			alumno.setNombre(sc.nextLine());
			System.out.print("ingresa tu matricula:");
			alumno.setMatricula(sc.nextInt());
			System.out.print("ingresa tu edad:");
			
	//sc.next(); se coloca cuando se salta esta parte y aplica para limpiar el buffer
			
			alumno.setEdad(sc.nextInt());
			System.out.print("ingresa el nivel a inscribir:");
			alumno.setNivel(sc.next());
			
			
			System.out.println("");
			System.out.println("--DATOS DE ESTUDIANTE--");
			System.out.println("");
			System.out.println("nombre:"+alumno.getNombre());
			System.out.println("matricula:"+alumno.getMatricula());
			System.out.println("edad:"+alumno.getEdad());
			System.out.println("nivel:"+alumno.getNivel());
			System.out.println("cagetoria:"+alumno.getCategoria());
			

	}

}
