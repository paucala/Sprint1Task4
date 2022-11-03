package n3exercici6;

import java.util.Scanner;

public class AssertJ4 {
	
	static Scanner entry = new Scanner(System.in);

	public static void main(String[] args) {
		String[] cotxes = {"Seat", "Toyota", "Renault", "Volkswagen", "LandRover", "BMW"};
		System.out.println("Introdueix el numero de cotxes que vols mostrar");
		int x = entry.nextInt();
		entry.nextLine();
		searchIndex(cotxes, x);

	}
	public static void searchIndex(String[] cotxes, int x) {
		
			for (int i = 0; i < x; i++) {
				System.out.println(cotxes[i]);
			}
			
			
	}

}
