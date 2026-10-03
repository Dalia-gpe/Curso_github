package EjemplosU2;

public class Archivo {

	private String nombre;
	private String formato;
	private int pesokb;
	private int año;
	
	public Archivo(String nombre, String formato, int pesokb, int año) {
		super();
		this.nombre = nombre;
		this.formato = formato;
		this.pesokb = pesokb;
		this.año = año;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getPesokb() {
		return pesokb;
	}

	public void setPesokb(int pesokb) {
		this.pesokb = pesokb;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", formato=" + formato + ", pesokb=" + pesokb + ", año=" + año + "]";
	}
	
	
	
}
