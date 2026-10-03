package EjemplosU1;
import java.time.LocalDate;
public class Membresia {
 
private String empresa;	
private String nombre;
private int id;
private String tipo;
private LocalDate vigencia;


public Membresia(String empresa, String nombre, int id, String tipo, int año, int mes, int dia) {
  	this.empresa=empresa;
  	this.nombre=nombre;
  	this.id=id;
  	this.tipo=tipo;
  	this.vigencia=LocalDate.of(año,mes,dia); 
}//contructo

  public Membresia(String empresa,String nombre, int id) {
     this.empresa=empresa;
     this.nombre=nombre;
     this.id=id;
  }
  
  public Membresia() {
	  
  }

public String getEmpresa() {
	return empresa;
}

public void setEmpresa(String empresa) {
	this.empresa = empresa;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public LocalDate getVigencia() {
	return vigencia;
}

public void setVigencia(int año,int mes, int dia) {
	this.vigencia = LocalDate.of( año, mes, dia);
}

@Override
public String toString() {
	return "Membresia [empresa=" + empresa + ", nombre=" + nombre + ", id=" + id + ", tipo=" + tipo + ", vigencia="
			+ vigencia + "]";
  }

  //metodo destructor

 protected void finalize()  throws Throwable {
	 System.err.println("Liberando la memoria...");
	 
 }


}//clase
