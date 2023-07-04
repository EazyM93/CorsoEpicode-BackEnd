package esercizio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<String> parole = new HashSet<String>();
		List<String> duplicati = new ArrayList<String>();
 		
		System.out.print("Numero di elementi da inserire: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < num; i++) {
			
			System.out.printf("Inserisci elemento %d : ", (i + 1));
			String parola = scanner.nextLine();
			if(!parole.add(parola)) parole.add(parola);
			else duplicati.add(parola);
			
		}
		
		System.out.println();
		System.out.print("Elementi duplicati:");
		for(String duplicato: duplicati) System.out.printf(" " + duplicato); 
		System.out.println();
		System.out.println();
		System.out.printf("Numero di parole distinte: %d\n", parole.size());
		for(String parola: parole) System.out.printf("- %s\n", parola);
		
		
		
		scanner.close();
	}

}
