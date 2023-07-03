package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCasuale {

	public static void main(String[] args) {
		
		// random number generator
		Random randNum = new Random();
		
		// array 
		int numbers[] = new int[5];
		
		// populate array
		for (int i = 0; i < numbers.length; i++) numbers[i] = randNum.nextInt(10) + 1;
		
		// user input and array value change
		Scanner scanner = new Scanner(System.in);
		
		int index = 0;
		
		do {
			
			try {
				
				// select position
				System.out.println("Seleziona posizione da modificare ( da 1 a 5 / digita 0 per chiudere il programma)");
				System.out.printf((index == 0) ? "Array iniziale: " + Arrays.toString(numbers) : "Array corrente: " + Arrays.toString(numbers));
				System.out.println();
				index = Integer.parseInt(scanner.nextLine());
			
				// insert number
				if(index !=0) {
					System.out.print("Valore da inserire: ");
					int newNum = Integer.parseInt(scanner.nextLine());
					numbers[index - 1] = newNum;
					System.out.println();
					System.out.println("--------------------------");
					System.out.println();
				}
				
			}catch(ArrayIndexOutOfBoundsException err) {
				
				System.out.println();
				System.err.println("Input non valido! Hai inserito un numero di dimensioni " + ((index < 0) ? "inferiore" : "maggiore") + " alle dimensioni dell'array!");
				System.err.println("Inserire nuovo valore.");
				System.out.println();
				System.out.println("--------------------------");
				System.out.println();
			}
			
			
				
		}while(index != 0);
		
		System.out.println("Programma interroto!!!");
		
	}
	
}
