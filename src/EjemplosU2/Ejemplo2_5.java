package EjemplosU2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Ejemplo2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Switch> sw=new ArrayList<Switch>();
		String salida="";
		int puerto=0;
		String marca =JOptionPane.showInputDialog("Ingresa la marca del switch: ");
		
		int capacidad= Integer.parseInt(JOptionPane.showInputDialog("Capacidad del switch de 24 a 48:  "));
		while (capacidad !=24 && capacidad!=48) {
			capacidad = Integer.parseInt(JOptionPane.showInputDialog("error ingresa 24 o 48 puertos: "));
		
		}
		int serie= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la serie del switch: "));
		
		do {	
String p=JOptionPane.showInputDialog(null,"Selecciona el puerto a conectar: ");
			
if (p != null && !p.equals("") && !p.equals(" ")) {
	puerto = Integer.parseInt(p);
	
	if (puerto > 0 && puerto <= capacidad) {
		boolean ocupado = false;
		for (int i = 0; i < sw.size(); i++) {
			if (sw.get(i).getPuerto() == puerto) {
				ocupado = true;
				break;
					}
           }
					if(!ocupado) {
						sw.add(new Switch(marca,capacidad,serie,puerto));
						JOptionPane.showMessageDialog(null,"Se agrego el puerto...");
					}else {
						JOptionPane.showMessageDialog(null, "Pueto ocupado....");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Puerto fuera de rango...");
			}
}else {
	JOptionPane.showMessageDialog(null, "No ingresaste nada...");
}
			
				salida=JOptionPane.showInputDialog("Deseas continuar ? ");
		}while(salida.equalsIgnoreCase("s"));
		
		String resultado = "MARCA: " + marca + "\nSERIE: " + serie + "\nCAPACIDAD: " + capacidad + "\nPUERTOS CONECTADOS:\n";
		
		Iterator<Switch> it = sw.iterator();
		while (it.hasNext()) {
			resultado = resultado + "Puerto: " + it.next().getPuerto();
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
//IMPRIMIR LA INFORMACION FUERA DEL CICLO
	//utilizar iterator para recorrer la estructura
		//validar que el switch solo pueda ser de 24 o 48 puertos (variable local)
		//validar que en la ejecucion del ciclo no permita que la ventana quede vacia sin espacio
		

}
