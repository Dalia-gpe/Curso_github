package EjerciciosU2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		Iterator<Integer> it=a.iterator();

		int aux=0;
		int  metros;
		
		for(int i=0; i<=6; i++) {
			
			System.out.println("Cuantos metros:");
			metros=sc.nextInt();
			a.add(metros);
		} System.out.println(a.toString());
			
		it = a.iterator();
	
		while (it.hasNext()) {
			int i=it.next();
			aux+=i;
			
		}
		
		int kms=aux/1000;
		int m=aux%1000;
		
		System.out.println("Total de kilometros recorridos "+kms+" km con "+m+"m");
		
		
		//crear un arraylist donde registre en metros por teclado
		//6 recorridos que realiza un vehiculo mandar a pantalla 
		//calcular la cantidad de kms y metros reocrrido utilizando iterator y mandar a imprimir la info
		
	}

}
