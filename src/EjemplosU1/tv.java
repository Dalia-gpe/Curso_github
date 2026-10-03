package EjemplosU1;

public class tv {

	String marca;
	int tamaño;
	String tipo;
	String color;
	
	public void imprimir() {
	    System.out.println("---DATOS DE LA TV---");
	    System.out.println("Marca="+this.marca);
	    System.out.println("Tamaño="+this.tamaño);
	    System.out.println("Tipo="+this.tipo);
	    System.out.println("Color="+this.color);

	}
	
	public String mostrar()   {
	      String cadena="";
	      cadena="---DATOS DE LA TV---\n"+"Marca="+this.marca+
	    		  "\nTamaño="+this.tamaño+"\nColor="+this.color+
	    		  "\nTipo="+this.tipo;
	    		return cadena;
	}
	      
	
}
