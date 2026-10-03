package EjemplosU2;
import java.util.Scanner;
public class Ejemplo2_6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	Directorio d=new Directorio();
	
	//TAREA
	//crean un menu que se ejecute n veces
	//altas, bajas, cambios y modificaciones
	//para opcion cambios genere la busqueda y posteriormente modifique los datos
	//del archivo
	//mostrar imprime todos los archivos del directorio
	
int opcion;
do {
	System.out.println("\n-Menu");
    System.out.println("1-Altas");
    System.out.println("2-Bajas");
    System.out.println("3-Cambios");
    System.out.println("4-Mostrar");
    System.out.println("5-Salir");
    System.out.print("Selecciona una opcion: ");
    opcion = sc.nextInt();

    switch (opcion) {
    case 1:
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Formato: ");
        String formato = sc.nextLine();

        System.out.print("Peso en KB: ");
        int pesokb = sc.nextInt();

        System.out.print("Año: ");
       int  año = sc.nextInt();

        Archivo a = new Archivo(nombre, formato, pesokb, año);
        d.agregar(a);

        System.out.println("Archivo agregado...");
        break;

    case 2:
        System.out.print("Año del archivo a eliminar: ");
        año = sc.nextInt();

        d.eliminar(año);
        break;

    case 3:
        System.out.print("Año del archivo a modificar: ");
        año = sc.nextInt();

        d.modificar(año, sc);
        break;

    case 4:
        d.mostrar();
        break;

    case 5:
        System.out.println("Saliendo del programa...");
        break;

    default:
        System.out.println("Opcion no valida");
}

} while (opcion != 5);

sc.close();
}
}
 