package EjemplosU2;
import java.util.ArrayList;
import java.util.Collections;
public class Ejemplo2_3 {

	public static void main(String[] args) {
		
		ArrayList<Double> cal=new ArrayList<Double>();
		ArrayList array=new ArrayList();
		double aux=0;
		
		
array.add("pedro");
array.add(22513300200L);
array.add('M');
array.add(2);
array.add(true);
		
//promediar los valores del arraylist numerico el resultado lo van a ingresar en el array object despues de el numero de control y mandan a imprimir 

	cal.add(8.5);
	cal.add(7.9);
	cal.add(7.0);
	cal.add(6.3);
	cal.add(10.0);
	cal.add(9.0);
		System.out.println(cal.toString());
	
		
	//for(Tipo de valores variable de control:nombre de la estructura)	
		for(Object i:array)  //for ich
			System.out.println(i);
		
		Collections.sort(cal);
		System.out.println(cal.toString());
		
		Collections.reverse(cal);
		System.out.println(cal.toString());
		
		//investigar como organizar elementos de un arraylist por un atributo en particular (manipulando un atributo)
		
		for (Double x : cal)
		     aux=aux+x;    
		     aux=aux/cal.size();
		     System.out.println("Promedio:"+aux);
		     array.add(2,aux);
		     
		     //crear package de TareaU2
		     //el Array object lo van a convertir en un array de tipo clase base
		     //capturar desde el teclado y vamos a insertar promedios en el atributo correspondiente 
		 
	}

}
