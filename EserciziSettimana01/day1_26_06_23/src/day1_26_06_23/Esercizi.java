package day1_26_06_23;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizi {

	public static void main(String[] args) {

		// Esercizi #1 - Preso dalla cartella fornita dopo aver
		System.out.println("This is my first Epicode Java Project!");

		// Esercizio #2 
		int numeroUno = 10;
		int numeroDue = 15;

		System.out.printf("Il prodotto di %d e %d è : %d \n", numeroUno, numeroDue, moltiplica(numeroUno, numeroDue));

		String stringaUno = "Il numero intero è : ";
		System.out.println(concatena(stringaUno, numeroUno));
		
		String arrStr[] = {"Cane", "Gatto", "Topo", "Fungo", "Sugo"};
		String stringaDue = "Artem";
	
		System.out.println(inserisciInArray(arrStr, stringaDue));

		// Esercizio #3
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Inserisci prima frase da concatenare!");
		String primaStr = scanUser.nextLine();
		System.out.println("Inserisci prima frase da concatenare!");
		String secondaStr = scanUser.nextLine();
		System.out.println("Inserisci prima frase da concatenare!");
		String terzaStr = scanUser.nextLine();

		concatUser(primaStr, secondaStr, terzaStr);

		// Esercizio 4
		System.out.print("Inserisci il primo lato del rettangolo: ");
		double latoUno = Double.parseDouble(scanUser.nextLine());

		System.out.print("Inserisci il primo lato del rettangolo: ");
		double latoDue = Double.parseDouble(scanUser.nextLine());

		System.out.println("Perimetro del rettangolo: " + perimetro(latoUno, latoDue));

		System.out.print("Inserisci il numero intero da verificare: ");
		int numeroVerifica = Integer.parseInt(scanUser.nextLine());

		System.out.println("Il numero inserito risulta (0-pari / 1-dispari): " + pariDispari(numeroVerifica));

		System.out.print("Inserisci il primo lato del triangolo: ");
		double latoTriangolo1 = Integer.parseInt(scanUser.nextLine());

		System.out.print("Inserisci il secondo lato del triangolo: ");
		double latoTriangolo2 = Integer.parseInt(scanUser.nextLine());

		System.out.print("Inserisci il terzo lato del triangolo: ");
		double latoTriangolo3 = Integer.parseInt(scanUser.nextLine());

		System.out.print("L'area del triangolo è : " + areaTriangolo(latoTriangolo1, latoTriangolo2, latoTriangolo3));

		scanUser.close();

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

	public static void concatUser(String str1, String str2, String str3) {

		System.out.println(str1 + " " + str2 + " " + str3);
		System.out.println(str3 + " " + str2 + " " + str1);

	}

	public static double perimetro(double x, double y) {
		return x * 2 + y * 2;
	}

	public static int pariDispari(int number) {
		return (number % 2 == 0) ? 0 : 1;
	}
	
	public static double areaTriangolo(double l1, double l2, double l3) {
		double p = l1 + l2 + l3;
		double a = Math.sqrt(p * (p * l1) * (p * l2) * (p * l3));
		return a;
	}
	

}
