package Esercizio2;

import java.util.Scanner;

public class Fuel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int flag = 0;
		
		do {
			
			try {
				
				System.out.print("Inserire in numero di km percorsi: ");
				double km = Double.parseDouble(scanner.nextLine());
				
				System.out.println();
				
				System.out.print("Inserire litri di carburante consumati: ");
				double fuelConsumed = Double.parseDouble(scanner.nextLine());
				
				System.out.println();
				
//				if(fuelConsumed == 0) throw new ArithmeticException();
				
				if(km / fuelConsumed == Double.POSITIVE_INFINITY || km / fuelConsumed == Double.NEGATIVE_INFINITY) throw new ArithmeticException();
				
				System.out.println("I km/litro risultano essere: " + (km / fuelConsumed));
				
				
				
				System.out.println();
				
			}catch(ArithmeticException err) {
				
				System.err.println("Non puoi dividere per zero, calcolo annullato!");
				System.out.println();
				
			};
			
			System.out.println("---------------------------");
			
			System.out.print("Eseguire nuova operazione? ( 0 = no / 1 = yes ) ");
			flag = Integer.parseInt(scanner.nextLine());
			
			System.out.println("---------------------------");
			
			System.out.println();
			
		}while(flag != 0);
		
		System.out.println("Programma interroto!!!");
	}
	
}
