package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		// inizializzazione scanner 
		Scanner scanner = new Scanner(System.in);
		
		// creazione array principale
		Set<String> parole = new HashSet<String>();
		
		// creazione array per i duplicati
		List<String> duplicati = new ArrayList<String>();
 		
		System.out.print("Numero di elementi da inserire: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		// ciclo per aggiungere gli elementi
		for(int i = 0; i < num; i++) {
			
			System.out.printf("Inserisci elemento %d : ", (i + 1));
			String parola = scanner.nextLine();
			
			// verifica se esiste già il valore ed eventualmente lo mette nei duplicati
			if(!parole.add(parola)) duplicati.add(parola);
			
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
