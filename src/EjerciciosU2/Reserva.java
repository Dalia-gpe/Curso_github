package EjerciciosU2;

public class Reserva {

	private String nombre;
	private String materia;
	private String carrera;
	private String apartado;
	
	public Reserva(String nombre, String materia, String carrera, String apartado) {
		super();
		this.nombre = nombre;
		this.materia = materia;
		this.carrera = carrera;
		this.apartado = apartado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getApartado() {
		return apartado;
	}

	public void setApartado(String apartado) {
		this.apartado = apartado;
	}

	@Override
	public String toString() {
		return "Reserva [nombre=" + nombre + ", materia=" + materia + ", carrera=" + carrera + ", apartado=" + apartado
				+ "]";
	}	
	
	
	
}
