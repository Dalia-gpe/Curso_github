package EjemplosU1;

public class Inscripcion {

	 private String nombre;
	   private int matricula;
	   private int edad;
	   private String nivel;
	   private String categoria;
	   
	   public String getNombre() {
		   return this.nombre;   
	   }
	   
	   public int getMatricula() {
		   return this.matricula;
	   }
	   
	   public int getEdad() {
		   return this.edad;
	   }
	   
	   public String getNivel() {
		   return this.nivel;
	   }
	   
	   public String getCategoria() {
		   return this.categoria;
	   }
	   
	   public void setNombre(String nombre) {
		   this.nombre=nombre.toUpperCase(); //toUpperCase coloca en mayusculas  //
	   }
	   
	   public void setMatricula(int matricula) {
		   this.matricula=matricula;
	   }
	   
	   public void setEdad(int edad) {
		   if(edad<0)
			   this.edad=0;
		   else
		     this.edad=edad;
	   }
	   
	   public void setNivel(String nivel) {
		   this.nivel=nivel;
		   if(nivel.equalsIgnoreCase("primaria"))
			   this.categoria="Educacion elemental";
		   else
			   if(nivel.equalsIgnoreCase("secundaria"))
				   this.categoria="Educacion basica";
			   else
				   if(nivel.equalsIgnoreCase("preparatoria"))
				   		this.categoria="Media superior";
				   else
					   if(nivel.equalsIgnoreCase("universidad"))
						   this.categoria="Nivel superior";
					   else 
						   this.categoria="Categoria no reconocida";
			  
	   }
	   
	   public void setCategoria(String categoria) {
		   this.categoria=categoria;
	   }

	
}
