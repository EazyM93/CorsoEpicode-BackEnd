package day1_26_06_23;

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
	
		for (String x : inserisciInArray(arrStr, stringaDue)) {
			System.out.println(x);
		}
		
	}
	
	public static int moltiplica(int x, int y) {
		return x * y;
	}

	public static String concatena(String str, int x) {
		return str + x;
	}

	public static String[] inserisciInArray(String[] arr, String str) {

		String newArr[] = new String[6];

		for (int i = 0; i <= arr.length; i++) {

			if (i == 2) {
				newArr[i] = str;
			} else if (i < 2) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i - 1];
			}

		}

		return newArr;
	}
}
