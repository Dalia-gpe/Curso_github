package TareaU1;

public class Tarea1_4 {

	public static void main(String[] args) throws Throwable {
	
		Libro m1 = new Libro("Principio de peter", "Laurence Johnston Peter", 431.71, 158);
		Libro m2 = new Libro("Por trece razones", "Jay Asher", 310);
		Libro m3 = new Libro("El principito", "Antoine de Saint-Exupéry", 33.00, 96);
	
		 
        m3.setTitulo("El principito");
        m3.setAutor("Antoine de Saint-Exupéry"); 
        m3.setPrecio(33.00);
        m3.setPaginas(96);
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    
        System.gc();

        m1.finalize();
        m2.finalize();
        m3.finalize();




	}

}
