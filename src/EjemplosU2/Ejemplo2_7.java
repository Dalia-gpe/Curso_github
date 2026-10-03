package EjemplosU2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
public class Ejemplo2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Publicacion> post=new ArrayList<Publicacion>();
		
		Publicacion p1=new Publicacion ("video","facebook",35,12);
		Publicacion p2=new Publicacion ("foto","twitter",5,2);
		Publicacion p3=new Publicacion ("gif","Whasap",22,20);
		
		post.add(p1);
		post.add(p2);
		post.add(p3);
		
		for (Publicacion i:post)
		System.out.println(i.toString());
		
    System.out.println("Datos ordenados por likes");
    //Collection.sort(p);
		post.sort(Comparator.comparing(Publicacion::getLikes));
		//Collection.sort(p,Comparator.comparing(Publicaciones::getLikes));
		   System.out.println("Organizado por likes: " + post);
		   
		   Iterator<Publicacion> it=post.iterator();
		   	while (it.hasNext()) {
		   		Publicacion pub = it.next(); 
	            if (pub.getLikes() < 4) {
	            	
	            }
	                it.remove();
	                
	//eliminar los objetos que tengan menos de 4 publicaciones
		   //utilizando iterator
	                System.out.println("\n--- DESPUES DE ELIMINAR (MENOS DE 4 LIKES) ---");
	                for (Publicacion i : post) {
	                    System.out.println(i.toString());
		
	}

	}
	}
}

