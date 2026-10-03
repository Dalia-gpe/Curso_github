package EjemplosU2;

public class Almacen {
	
	private String nombre;
	private String marca;
	private String precio;
	private int cantidad;
	
public Almacen () {  
	this.nombre="Switch";
	this.marca="huawei";
	this.precio="2000";
	this.cantidad=5;

	}
public Almacen(String nombre) { 
	this.nombre=nombre;
	this.marca="tapo";
	this.precio="800";
	this.cantidad=10;
}

public Almacen(String nombre, String marca, String precio, int cantidad) {
	this.nombre = nombre;
	this.marca = marca;
	this.precio = precio;
	this.cantidad = cantidad;
	
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getPrecio() {
	return precio;
}
public void setPrecio(String precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

@Override
public String toString() {
	return "Almacen [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + "]";

}
	

}
