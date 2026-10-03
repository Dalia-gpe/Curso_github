package EjemplosU1;

public class Ejemplo1_4 {

	public static void main(String[] args)  throws Throwable {
		// TODO Auto-generated method stub
		
		
   Membresia m1=new Membresia("cityclub","Eduardo Villegas",12345,"indivudual",2027,8,31);
   Membresia m2=new Membresia("Costco","Andrea Juarez",3456);
   Membresia m3=new Membresia();
   
   m3.setNombre("Juan perez");
   m3.setEmpresa("Samsclub");
   m3.setId(56789);
   
   System.out.println(m1.toString());
   System.out.println(m1.toString());
   
   System.gc();
   m1.finalize();
   m2.finalize();
   m2.finalize();


	}

}
