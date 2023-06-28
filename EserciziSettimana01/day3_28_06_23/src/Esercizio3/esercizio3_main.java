package Esercizio3;

import java.util.Scanner;

public class esercizio3_main {

	public static void main(String[] args) {
		
		String inputStr;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserire la stringa (:q - esci dal ciclo)");
			inputStr = scanner.nextLine();
			if(!inputStr.equals(":q")) {
				System.out.println(String.join(",", inputStr.split(""))); 
			}
			System.out.println();
			
		}while(!inputStr.equals(":q"));
		
		scanner.close();
		
		System.out.println();
		System.out.println("Programma chiuso!");
	}
	
}
