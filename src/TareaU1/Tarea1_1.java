package TareaU1;

public class Tarea1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Revista Revista1=new Revista();
		Revista Revista2=new Revista();

		Revista1.nombre="Inteligencia Artificial";
		Revista1.precio= 60.50;
		Revista1.categoria="Ciencia";
		Revista1.editorial="National Geographic";
		
		Revista2.nombre="Seamos uno";
		Revista2.precio= 80.90;
		Revista2.categoria="Moda";
		Revista2.editorial="Vogue";
		
		
		System.out.println(Revista1==Revista2);
		Revista1.imprimir();
		System.out.println("Revista1:"+ Revista1.mostrar());
		System.out.println("");
		Revista2.imprimir();
		System.out.println("Revist2:"+ Revista2.mostrar());
		
		
	}

}
