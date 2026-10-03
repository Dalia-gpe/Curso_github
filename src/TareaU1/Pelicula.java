package TareaU1;

public class Pelicula {

	private String titulo;
	private String genero;
	private int duracion;
	private String clasificacion;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		if (duracion>0) {
		this.duracion = duracion;
		}else {
			System.out.print("Debe durar mas de 0 minutos");
		}
				
		
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		if (clasificacion.equalsIgnoreCase("AA")) {
            this.clasificacion = clasificacion.toUpperCase();
		}else {
            if (clasificacion.equalsIgnoreCase("A")) {
                this.clasificacion = clasificacion.toUpperCase();
            } else {
                if (clasificacion.equalsIgnoreCase("B")) {
                    this.clasificacion = clasificacion.toUpperCase();
                } else {
                    if (clasificacion.equalsIgnoreCase("B15")) {
                        this.clasificacion = clasificacion.toUpperCase();
                    } else {
                        if (clasificacion.equalsIgnoreCase("C")) {
                            this.clasificacion = clasificacion.toUpperCase();
                        } else {
                        	System.out.println("Clasificacion no valida");
                        }
                       } 
                      }
                     }
                    }
	          	}
	

}
