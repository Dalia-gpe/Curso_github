package EjemplosU1;

public class Tutoria {
    private Estudiante estudiante;
    private Profesor profesor;
    private String materia;
    private boolean status;

    
	public Tutoria(Estudiante estudiante, Profesor profesor, String materia, boolean status) {
		super();
		this.estudiante = estudiante;
		this.profesor = profesor;
		this.materia = materia;
		this.status = status;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tutoria [estudiante=" + estudiante + ", profesor=" + profesor + ", materia=" + materia + ", status="
				+ status + "]";
	}

   

}
