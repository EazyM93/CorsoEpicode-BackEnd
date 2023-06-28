package Esercizio4;

import java.util.Scanner;

public class esercizio4_main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserire il numero intero per il conto alla rovescia: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		for(int i = num; i >= 0; i--) {
			System.out.println(i);
		}
		
		scanner.close();
		
	}
	
}
