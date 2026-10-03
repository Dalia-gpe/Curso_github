package PracticasU1;
import java.time.LocalDate;
public class Medicamento {

	private String nombre;
	private LocalDate fechacaducidad;
	private int cmedicamento;
	private String almacenamiento;
	private int cantidad;
	
	public Medicamento (String nombre, int año, int mes, int dia, int cmedicamento, String almacenamiento, int cantidad) {
		this.nombre=nombre;
		this.cmedicamento=cmedicamento;
		this.almacenamiento=almacenamiento;
		this.cantidad=cantidad;
		setFechacaducidad(año, mes, dia);
        
	}
	//falta de mediamento....
	//mediamento caducado...
	
	public Medicamento (int cmedicamento, String almacenamiento) {
		this.nombre=nombre; 
		this.cmedicamento=cmedicamento;
		this.almacenamiento=almacenamiento;
		this.cantidad=0;
	}

	
	public String getNombre() {
		return nombre;

		}

		public void setNombre(String nombre) {
		this.nombre = nombre;
		}

		public LocalDate getFechacaducidad() {
		return fechacaducidad;
		}

		public void setFechacaducidad(int año,int mes, int dia) {
		if (año >= 2026) {
		 if (año > 2026) {
		 this.fechacaducidad = LocalDate.of(año, mes, dia);
		}  else {
		 if (mes >= 9) {
		  this.fechacaducidad = LocalDate.of(año, mes, dia);
		}   else {
		System.out.println("el mes ya pasó");
		}
		}
		} else {
		System.out.println("el año ingresado ya venció.");
		}
		}

		public int getCmedicamento() {
		return cmedicamento;
		}

		public void setCmedicamento(int cmedicamento) {
		this.cmedicamento = cmedicamento;
		}

		public String getAlmacenaniemto() {
		return almacenamiento;
		}

		public void setAlmacenaniemto(String almacenaniemto) {
		this.almacenamiento = almacenaniemto;
		} 

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad > 0) {
	        this.cantidad = cantidad;
	        System.out.println("Hay medicamento");
	    } else {
	        System.out.println("No hay medicamentos");
	    }
	}
	
	public boolean faltaMedicamento() {
        if (this.cantidad <= this.cmedicamento) {
            return true;
        } else {
            return false;
        }
    }

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", fechacaducidad=" + fechacaducidad + ", cmedicamento=" + cmedicamento
				+ ", almacenamiento=" + almacenamiento + ", cantidad=" + cantidad + "]";
	}

	
	
}