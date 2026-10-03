package EjemplosU2;
import java.util.Scanner;
public class Ejemplo2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Almacen[]a=new Almacen [4];
		
		a[0]=new Almacen();
		a[1]=new Almacen("router"); 
		a[2]=new Almacen("No break","Koblenz","3000",7);
		
		System.out.println("Que producto es:");
		String nombre=sc.nextLine();
		
		System.out.println("Cual es la marca:");
		String marca=sc.nextLine();
		
		System.out.println("Cual es el precio:");
		String precio=sc.nextLine();
		
		System.out.println("Cual es la cantidad:");
		int cantidad=sc.nextInt();

		a[3]=new Almacen (nombre,marca,precio,cantidad);
  
		for(int i=0; i<=3; i++) { 
			System.out.println(a[i].toString());
			
			//enviar a pantalla el monto total de la inversion en dispositivos que hay en almacen 
			int p0 = (a[0].getPrecio() != null) ?Integer.parseInt(a[0].getPrecio()) : 0;
			int p1 = (a[1].getPrecio() != null) ?Integer.parseInt(a[1].getPrecio()) : 0;
			int p2 = Integer.parseInt(a[2].getPrecio());
			int p3 = Integer.parseInt(a[3].getPrecio());

			int totalInversion = (p0 * a[0].getCantidad())+(p1 * a[1].getCantidad()) + (p2 * a[2].getCantidad()) + (p3 * a[3].getCantidad());

			System.out.println("Monto total de la inversión: $" + totalInversion);
			
	}

	}
}
