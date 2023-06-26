package day1_26_06_23;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		
		// Esercizio #3
		Scanner scanEsercizio3 = new Scanner(System.in);
		System.out.println("Inserisci prima frase da concatenare!");
		String primaStr = scanEsercizio3.nextLine();
		System.out.println("Inserisci prima frase da concatenare!");
		String secondaStr = scanEsercizio3.nextLine();
		System.out.println("Inserisci prima frase da concatenare!");
		String terzaStr = scanEsercizio3.nextLine();

		concatUser(primaStr, secondaStr, terzaStr);

		scanEsercizio3.close();
	}

	public static void concatUser(String str1, String str2, String str3) {

		System.out.println(str1 + " " + str2 + " " + str3);
		System.out.println(str3 + " " + str2 + " " + str1);

	}

}
