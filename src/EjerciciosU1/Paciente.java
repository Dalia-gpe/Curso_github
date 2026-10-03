package EjerciciosU1;

public class Paciente {

	private String nombre;
	private int edad;
	private char genero;
	public Paciente(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
}
