package day1_26_06_23;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		// Esercizio 4
		Scanner scanEsercizio4 = new Scanner(System.in);

		System.out.print("Inserisci il primo lato del rettangolo: ");
		double latoUno = Double.parseDouble(scanEsercizio4.nextLine());

		System.out.print("Inserisci il primo lato del rettangolo: ");
		double latoDue = Double.parseDouble(scanEsercizio4.nextLine());

		System.out.println("Perimetro del rettangolo: " + perimetro(latoUno, latoDue));

		System.out.print("Inserisci il numero intero da verificare: ");
		int numeroVerifica = Integer.parseInt(scanEsercizio4.nextLine());

		System.out.println("Il numero inserito risulta (0-pari / 1-dispari): " + pariDispari(numeroVerifica));

		System.out.print("Inserisci il primo lato del triangolo: ");
		double latoTriangolo1 = Double.parseDouble(scanEsercizio4.nextLine());

		System.out.print("Inserisci il secondo lato del triangolo: ");
		double latoTriangolo2 = Double.parseDouble(scanEsercizio4.nextLine());

		System.out.print("Inserisci il terzo lato del triangolo: ");
		double latoTriangolo3 = Double.parseDouble(scanEsercizio4.nextLine());

		System.out.print("L'area del triangolo è : " + areaTriangolo(latoTriangolo1, latoTriangolo2, latoTriangolo3));

		scanEsercizio4.close();

	}

	public static double perimetro(double x, double y) {
		return x * 2 + y * 2;
	}

	public static int pariDispari(int number) {
		return (number % 2 == 0) ? 0 : 1;
	}

	public static double areaTriangolo(double l1, double l2, double l3) {
		double p = l1 + l2 + l3;
		return Math.sqrt(p * (p * l1) * (p * l2) * (p * l3));
	}

}
