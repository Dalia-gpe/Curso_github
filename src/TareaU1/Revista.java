package TareaU1;

public class Revista {
	
	
	String nombre;
	Double precio;
	String categoria;
	String editorial;
	
	public void imprimir() {
	    System.out.println("DATOS DE LA REVISTA");
	    System.out.println("Nombre="+this.nombre);
	    System.out.println("Precio="+this.precio);
	    System.out.println("Categoria"+this.categoria);
	    System.out.println("Editorial="+this.editorial);

	}
	
	public String mostrar()   {
	      String cadena="";
	      cadena="DATOS DE LA REVISTA\n"+"Nombre="+this.nombre+
	    		  "\nPrecio="+this.precio+"\nCategoria="+this.categoria+
	    		  "\nEditorial="+this.editorial;
	    		return cadena;
	}
	    
}
