package Esercizio1;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserire lato 1 del primo rettangolo: ");
		double lato1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Inserire lato 2 del primo rettangolo: ");
		double lato2 = Double.parseDouble(scanner.nextLine());
		
		Rettangolo rettUno = new Rettangolo(lato1, lato2);
		
		stampaRettangolo(rettUno);
		System.out.println();
		
		System.out.print("Inserire lato 1 del secondo rettangolo: ");
		double lato3 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Inserire lato 2 del secondo rettangolo: ");
		double lato4 = Double.parseDouble(scanner.nextLine());
		
		Rettangolo rettDue = new Rettangolo(lato3, lato4);
		
		System.out.println();
		stampaDueRettangoli(rettUno, rettDue);
		
		scanner.close();
		
	}
	
	public static void stampaRettangolo(Rettangolo rett) {
		System.out.println("Perimetro rettangolo: " + rett.p);
		System.out.println("Area rettangolo: " + rett.a);
	}
	
	public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
		System.out.println("Perimetro rettangolo uno: " + rett1.p);
		System.out.println("Area rettangolo due: " + rett1.a);
		System.out.println("Perimetro rettangolo due: " + rett2.p);
		System.out.println("Area rettangolo due: " + rett2.a);
		System.out.println();
		System.out.println("Somma Perimetri: " + (rett1.p + rett2.p));
		System.out.println("Area Perimetri: " + (rett1.a + rett2.a));
	}
}