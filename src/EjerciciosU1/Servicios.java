package EjerciciosU1;

public class Servicios {

	private String servicio;
	private double costo;
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return "Servicios [servicio=" + servicio + ", costo=" + costo + "]";
	}
	
}
