package EjemplosU2;

public class Switch {

	private String marca;
	private int capacidad;
	private int serie;
	private int puerto;
	
	
	public Switch(String marca, int capacidad, int serie, int puerto) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.serie = serie;
		this.puerto = puerto;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getPuerto() {
		return puerto;
	}
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}


	@Override
	public String toString() {
		return "Switcb [marca=" + marca + ", capacidad=" + capacidad + ", serie=" + serie + ", puerto=" + puerto + "]";
	}


	
	
	

}