package Esercizio3;

import java.util.Scanner;

public class esercizio3_main {

	public static void main(String[] args) {
		
		String inputStr;
		String flag = ":q";
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserire la stringa (:q - esci dal ciclo)");
			inputStr = scanner.nextLine();
			if(!inputStr.equals(flag)) {
				System.out.println(String.join(",", inputStr.split(""))); 
			}
			
		}while(!inputStr.equals(flag));
		
		scanner.close();
		
		System.out.println();
		System.out.println("Programma chiuso!");
	}
	
}
