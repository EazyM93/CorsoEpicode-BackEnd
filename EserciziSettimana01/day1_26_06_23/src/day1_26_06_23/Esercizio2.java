package day1_26_06_23;

import java.util.Arrays;

public class Esercizio2 {
	public static void main(String[] args) {
		
		// Esercizio #2 
		int numeroUno = 10;
		int numeroDue = 15;

		System.out.printf("Il prodotto di %d e %d è : %d \n", numeroUno, numeroDue, moltiplica(numeroUno, numeroDue));

		String stringaUno = "Il numero intero è : ";
		System.out.println(concatena(stringaUno, numeroUno));
		
		String arrStr[] = {"Cane", "Gatto", "Topo", "Fungo", "Sugo"};
		String stringaDue = "Artem";
	
		System.out.println(inserisciInArray(arrStr, stringaDue));
		
	}
	
	public static int moltiplica(int x, int y) {
		return x * y;
	}

	public static String concatena(String str, int x) {
		return str + x;
	}

	public static String inserisciInArray(String[] arr, String str) {

		String newArr[] = new String[6];

		newArr[0] = arr[0];
		newArr[1] = arr[1];
		newArr[2] = arr[2];
		newArr[3] = str;
		newArr[4] = arr[3];
		newArr[5] = arr[4];

		return Arrays.toString(newArr);
	}
}
