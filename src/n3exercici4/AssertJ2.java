package n3exercici4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;

public class AssertJ2 {

	public static void main(String[] args) {
		ArrayList<Object> llista = createList();
		

	}
	public static ArrayList<Object> createList(){
		ArrayList<Object> llista = new ArrayList<Object>();
		String str = "Pau";
		int num = 2;
		char lletra = 'c';
		double div = 5.4;
		long any = 1987;
		llista.add(str);
		llista.add(num);
		llista.add(lletra);
		llista.add(div);
		return llista;
	}


}
