package PracticasU1;

public class Practica1_1 {

	public static void main(String[] args) {
	
		Medicamento m1 = new Medicamento("Paracetamol", 2027, 5, 10, 5, "estante", 20);
        System.out.println(m1);
        System.out.println("¿Falta?: " + m1.faltaMedicamento());

     // medicamento vencido
        Medicamento m2 = new Medicamento("Ibuprofeno", 2024, 1, 1, 5, "frio", 10);
        System.out.println(m2);

     //medicamento agotado
        Medicamento m3 = new Medicamento("Amoxicilina", 2028, 8, 15, 10, "estante", 2);
        System.out.println(m3);
        System.out.println("¿Falta?: " + m3.faltaMedicamento());
		

	}

}