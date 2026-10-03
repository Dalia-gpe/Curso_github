package EjemplosU1;
import java.util.Scanner;
public class Ejemplo1_5 {

    public static void main(String[]arg){
    	Scanner sc=new Scanner(System.in);
    Estudiante e=new Estudiante();
    Profesor p=null;
    Tutoria t=null;
    boolean status;
    String materia;
    int n;
    String cadena="";
    int pago=0;
    
    e.setNombre("sisi");
    e.setMatricula("225333302");
    e.setCarrera("isc");
    
    System.out.println("Ingresa el nombre del profesor");
    String nombre=sc.nextLine();
    
    System.out.println("Ingrese el numero de la matricula");
    int id=sc.nextInt();
    
    System.out.println("Carrera adscrita al profesor");
    String carrera=sc.nextLine();
    
    p=new Profesor(nombre,id,carrera);
    sc.next();
    if(e.getCarrera().equalsIgnoreCase(p.getCarrera()))
    	status=true;
    	else
    		status=false;
    
    if(status)
    {
    	System.out.println("cuantas maeterias requieres o necesitas:");
    	n=sc.nextInt();
    	for(int i = 1; 1<=n; i++) {

    	System.out.println("Ingresa la materia=");
    	materia=sc.nextLine();
    	cadena=materia+","+materia;
    	pago=pago+50;
    	}
    }else 
    	
    	materia="Tutoria no valida...";
    //en caso de darse la tutoria solicitar al estudiante la materia en caso de que no se de enviar un mensaje
    	   	
    materia = cadena+", pago="+String.valueOf(pago);
    
    
    t=new Tutoria(e,p,materia,status);
    
    System.out.println(t.toString());
    
    sc.close();
 }
}
