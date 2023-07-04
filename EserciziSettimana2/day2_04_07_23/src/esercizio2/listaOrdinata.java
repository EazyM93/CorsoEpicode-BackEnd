package esercizio2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listaOrdinata {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
 		
		System.out.print("Numero di elementi da generare: ");
		int num = Integer.parseInt(scanner.nextLine());

		for(int i = 0; i < num; i++) {
			numbers.add((int)(Math.random() * 100));
		}
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		System.out.println(reSort(numbers));
		
		pariDispari(numbers, true);
		System.out.println();
		pariDispari(numbers, false);
		
	}

	public static List<Integer> reSort(List<Integer> lista) {
		
		List<Integer> newList = new ArrayList<Integer>();
		
		newList.addAll(lista);
		Collections.reverse(lista);
		newList.addAll(lista);
		Collections.sort(lista);
		
		return newList;
		
	}
	
	public static void pariDispari(List<Integer> list, boolean x) {
		
		if(x == true) {
			System.out.print("Numeri pari :");
			for(int valore: list) if(valore % 2 == 0) System.out.print(" " + valore);
		}
		
		if(x == false){
			System.out.print("Numeri dispari :");
			for(int valore: list) if(valore % 2 != 0) System.out.print(" " + valore);
		}
		
	}
}
