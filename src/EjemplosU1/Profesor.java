package EjemplosU1;

public class Profesor {
    private String nombre;
    private int noempleado;
    private String carrera;
    

	public Profesor(String nombre, int noempleado, String carrera) {
		super();
		this.nombre = nombre;
		this.noempleado = noempleado;
		this.carrera = carrera;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNoempleado() {
		return noempleado;
	}


	public void setNoempleado(int noempleado) {
		this.noempleado = noempleado;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}



	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", noempleado=" + noempleado + ", carrera=" + carrera + "]";
	}



}
