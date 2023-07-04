package esercizio2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class listaOrdinata {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		TreeSet<Integer> numbers = new TreeSet<Integer>();
 		
		System.out.print("Numero di elementi da generare: ");
		int num = Integer.parseInt(scanner.nextLine());

		for(int i = 0; i < num; i++) {
			numbers.add((int)(Math.random() * 100));
		}
		
		System.out.println(numbers);
		
		System.out.println(reSort(numbers));
		
	}

	public static List<Integer> reSort(TreeSet<Integer> lista) {
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.addAll(lista);
		newList.addAll(lista.descendingSet());
		
		return newList;
		
	}
	
//	public static void pariDispari(TreeSet<Integer>, boolean x) {
//		
//	}
}
