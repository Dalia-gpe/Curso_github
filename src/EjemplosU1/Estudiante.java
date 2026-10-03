package EjemplosU1;

public class Estudiante {
    private String nombre;
    private String Matricula;
    private String Carrera;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getCarrera() {
		return Carrera;
	}
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", Matricula=" + Matricula + ", Carrera=" + Carrera + "]";
	}

    
    
}
