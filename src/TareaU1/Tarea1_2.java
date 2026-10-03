package TareaU1;
import java.util.Scanner;
public class Tarea1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrdenPizzeria pizza=new OrdenPizzeria();

		System.out.print("ingresa el sabor de la pizza:");
		pizza.setSabor(sc.nextLine());
		System.out.print("ingresa el tamaño de la pizza:");
		pizza.setTamaño(sc.next());
		System.out.print("ingresa el precio de la pizza:");
		pizza.setPrecio(sc.nextInt());
		sc.nextLine();
		System.out.print("ingresa de que seran las orillas:");
		pizza.setOrilla(sc.nextLine());
		
		System.out.println("");
		System.out.println("--PIZZA--");
		System.out.println("");
		System.out.println("Sabor:"+pizza.getSabor());
		System.out.println("Tamaño:"+pizza.getTamaño());
		System.out.println("Precio:"+pizza.getPrecio());
		System.out.println("Tipo de orilla:"+pizza.getOrilla());
		
	
		
	}

}
