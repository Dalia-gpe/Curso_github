package TareaU1;

public class OrdenPizzeria {


	   private String sabor;
	   private String tamaño;
	   private int precio;
	   private String orilla;
	   
	    public String getSabor() {
		   return this.sabor;   
	   }
	   
	    public String getTamaño() {
		   return this.tamaño;
	   }
	   
	    public int getPrecio() {
		   return this.precio;
	   }
	      
	     public String getOrilla() {
	    	 return this.orilla;
	     }
	   
	    public void setSabor(String sabor) {
		   this.sabor=sabor;
	   }
	   
	    public void setTamaño(String tamaño ) {
		   this.tamaño=tamaño;
	   }
	   
	    public void setPrecio(int precio) {
		   this.precio=precio;
	   }
	    
	    public void setOrilla(String orilla) {
	    	this.orilla=orilla;
	    }	
	
	
}
