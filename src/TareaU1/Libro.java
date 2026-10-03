package TareaU1;
import java.time.LocalDate;
public class Libro {

	private String titulo;
	private String autor;
	private double precio;
	private int paginas;
	
	 public Libro(String titulo,String autor, double precio, int paginas) {
		    this.titulo=titulo;
	    	this.autor=autor;
	    	this.precio=precio;
	    	this.paginas=paginas;
	 }
	
	 public Libro(String titulo,String autor,double precio) {
	    	this.titulo=titulo;
	    	this.autor=autor;
	    	this.precio=precio;
	 }

	 public String getTitulo() {
		 return titulo;
	 }

	 public void setTitulo(String titulo) {
		 this.titulo = titulo;
	 }

	 public String getAutor() {
		 return autor;
	 }

	 public void setAutor(String autor) {
		 this.autor = autor;
	 }

	 public double getPrecio() {
		 return precio;
	 }

	 public void setPrecio(double precio) {
		 if (precio < 0) {
	            System.out.println("El precio tiene que ser mayor de 0;");
	            this.precio = 0.0;
	        } else {
	            this.precio = precio; 
	 }
	 } 
	 public int getPaginas() {
		 return paginas;
	 }

	 public void setPaginas(int paginas) {
		 if (paginas <= 0) {
	            System.out.println(" El numero de paginas debe ser mayor a 0");
	            this.paginas = 1;
	        } else {
	            this.paginas = paginas;
	        }
	 }
	
	 public void mostrarInformacion() {
	        System.out.print("DATOS DEL LIBRO");
	        System.out.println("Titulo: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Precio:" + precio);
	        System.out.println("Numero de paginas: " + paginas);
	        System.out.println();
	    }

	 @Override
	 public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", paginas=" + paginas + "]";
	 }

	 protected void finalize () throws Throwable {
			System.err.println("Liberando la memoria... "); 
	 } 
}
