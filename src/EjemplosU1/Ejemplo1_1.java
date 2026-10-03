package EjemplosU1;

public class Ejemplo1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tv Control1=new tv();
		tv Control2=new tv();
		
		Control1.color="Negro";
		Control1.marca="LG";
		Control1.tamaño=55;
		Control1.tipo="4K";
		
		Control2.color="verde";
		Control2.marca="Samsung";
		Control2.tamaño=40;
		Control2.tipo="2K";
		
		Control1=Control2;
		System.out.println(Control1==Control2);
		Control1.imprimir();
		//System.out.println(Control1.mostrar());
		System.out.println("");
		Control2.imprimir();
		//System.out.println(Control2.mostrar());
		
		
	}

}
