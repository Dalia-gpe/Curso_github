package EjemplosU2;
import java.util.ArrayList;
public class Ejemplo2_2 {

	public static void main(String[] args) {
		
		ArrayList <Almacen> a=new ArrayList<Almacen> ();
		
		Almacen a1=new Almacen();
		Almacen a2=new Almacen("camara");
		Almacen a4=new Almacen("Telefono","cisco","2000",3);
		int aux;
		
		a.add(a1);
		a.add(a2);
		a.add(new Almacen ("Timbre"));
		a.add(2,a4);  //posicion y valor (index y value) 
		
		for (int i=0; i< a.size(); i++) {
			{System.out.println(a.get(i).toString());
			}
		aux = Integer.parseInt(a.get(i).getPrecio())*a.get(i).getCantidad();
		System.out.println("Aux="+i);
			}
		int index=a.indexOf(a4) ;
			
		a.remove(index);
		
		if(a.contains(a4))
		{ System.out.println("No se encuentra el valor");
	//imprime el valor del objeto
		System.out.println(a.get(index).toString());
		}
		else 
		System.out.println("Se encontro el valor");
	
		a.clear();
		
	if (!a.isEmpty())
	 System.out.println("contiene informacion");
	else 
		System.out.println("No contiene informacion");
	

	
	}

	
}
