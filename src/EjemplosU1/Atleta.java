package EjemplosU1;

public class Atleta {

	private String nombre;
	private String disciplina;
	private boolean status; //si el atleta entrna x tiempo
	private double tiempo; //activo su status es true o false si no esta activo
	
	
	// todo metodo que sea boolean es (is)
	
	public boolean isStatus() {
		return this.status;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public double getTiempo() {
		return tiempo;
	}


	public void setTiempo(double tiempo) {
		//combiertan el tiempo en minutos 
		if (tiempo>0) {
		this.tiempo = tiempo*60;
		this.status=true;
		}else
		    {this.tiempo=0;
	    	 this.status=false;
		    }
	        }

	public void setStatus(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		if (status)
			System.out.println("usuario activo");
		else
			System.out.println("usuario inactivo");
			
			
		return "nombre=" + nombre + ", disciplina=" + disciplina + ", tiempo=" + tiempo + "minutos="+"status del usuario";
		
		

		

	
	
	
		
	}
	
	
	
	
	
}
