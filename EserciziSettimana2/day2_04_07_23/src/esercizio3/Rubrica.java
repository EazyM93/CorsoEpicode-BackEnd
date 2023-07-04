package esercizio3;

import java.util.HashMap;
import java.util.Scanner;

public class Rubrica {

	public static void main(String[] args) {
		
		HashMap<String, String> contatti = new HashMap<String, String>();
		
		aggiungi(contatti);
		
		System.out.println(contatti.get("Manuel"));
		
		
	}
	
	public static void aggiungi(HashMap<String, String> cont) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome contatto da aggiungere: ");
		String user = scanner.nextLine();
		System.out.print("Numero: ");
		String number = scanner.nextLine();
		cont.put(user, number);
		
		scanner.close();
	}
	
	public static void delete(HashMap<String, String> cont) {
		
	}

}
