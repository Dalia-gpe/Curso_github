package EjemplosU2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Ejemplo2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> a=new ArrayList<Integer>();
	
		a.add(2);//0
		a.add(4);//1
		a.add(6);//2
		a.add(8);//3
		a.add(10);//4
		a.add(12);//5
		a.add(14);//6
		
		System.out.println(a.toString());
		Iterator<Integer> it=a.iterator();
		
	while (it.hasNext()) {
		int i=it.next();
		if(i<=6)
			it.remove();
	}
	System.out.println(a.toString());	
	
	}
	

}
