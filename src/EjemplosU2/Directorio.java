package EjemplosU2;
import java.util.ArrayList;
import java.util.Scanner;

public class Directorio {

    ArrayList<Archivo> dir;

    public Directorio() {
        dir = new ArrayList<Archivo>();
    }

    public void agregar(Archivo obj) {
        dir.add(obj);
    }

    public void eliminar(int año) {
        boolean encontrado = false;

        for (int i = 0; i < dir.size(); i++) {
            if (dir.get(i).getAño() == año) {
                dir.remove(i);
                encontrado = true;
                break;
            }
        }

        if (encontrado)
            System.out.println("Archivo eliminado...");
        else
            System.out.println("Archivo no encontrado");
    }

    public void modificar(int año, Scanner sc) {
        boolean encontrado = false;

        for (Archivo o : dir) {
            if (o.getAño() == año) {
                encontrado = true;

                sc.nextLine();

                System.out.println("Archivo encontrado");
                System.out.println(o.toString());

                System.out.print("Nuevo nombre: ");
                o.setNombre(sc.nextLine());

                System.out.print("Nuevo formato: ");
                o.setFormato(sc.nextLine());

                System.out.print("Nuevo peso en KB: ");
                o.setPesokb(sc.nextInt());

                System.out.print("Nuevo año: ");
                o.setAño(sc.nextInt());

                System.out.println("Archivo modificado...");
                break;
            }
        }

        if (!encontrado)
            System.out.println("Archivo no encontrado");
    }

    public void mostrar() {
        if (!dir.isEmpty()) {
            for (Archivo o : dir) {
                System.out.println(o.toString());
            }
        } else {
            System.out.println("No hay archivos en el directorio");
        }
    }
}

