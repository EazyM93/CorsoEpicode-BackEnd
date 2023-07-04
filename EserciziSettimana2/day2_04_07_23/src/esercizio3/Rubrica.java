package esercizio3;

import java.util.HashMap;
import java.util.Scanner;

public class Rubrica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> contatti = new HashMap<String, String>();
		
		aggiungi(contatti, scanner);
		aggiungi(contatti, scanner);
		aggiungi(contatti, scanner);
		
		System.out.println(contatti);
		
		rimuovi(contatti, scanner);
		
		System.out.println(contatti);
		
		ricercaNumero(contatti, scanner);
		
		ricercaPersona(contatti, scanner);
		
		stampaTutti(contatti);
		
		scanner.close();
		
		
	}
	
	public static void aggiungi(HashMap<String, String> cont, Scanner scanner) {
				
		System.out.print("Nome contatto da aggiungere: ");
		String user = scanner.nextLine();
		System.out.print("Numero: ");
		String numero = scanner.nextLine();
		cont.put(user, numero);
		
	}
	
	public static void rimuovi(HashMap<String, String> cont, Scanner scanner) {
				
		System.out.print("Nome contatto da eliminare: ");
		String user = scanner.nextLine();
		
		cont.remove(user);
		
	
	}
	
	public static void ricercaNumero(HashMap<String, String> cont, Scanner scanner) {
		
		System.out.print("Numero contatto da visualizzare: ");
		String numero = scanner.nextLine();
		
		cont.forEach((key, value) -> {	
			if(value == numero) System.out.println("Nome del numero " + value + " : " + key);
		});		
	}
	
	public static void ricercaPersona(HashMap<String, String> cont, Scanner scanner) {
		
		System.out.print("Visualizza numero di : ");
		String str = scanner.nextLine();
		
		System.out.println("Numero: " + cont.get(str));
	}
	
	public static void stampaTutti(HashMap<String, String> cont) {
		
		System.out.println("ELENCO CONTATTI");
		cont.forEach((key, value) -> System.out.printf("- %s : %s\n", key, value));
		
	}
}
