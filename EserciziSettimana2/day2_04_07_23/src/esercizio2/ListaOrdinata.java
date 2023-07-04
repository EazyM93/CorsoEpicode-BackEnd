package esercizio2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaOrdinata {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Numero di elementi da generare: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		List<Integer> numbers = new ArrayList<Integer>(populate(num));
				
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		System.out.println(reSort(numbers));
		
		pariDispari(numbers, true);
		System.out.println();
		pariDispari(numbers, false);
		
		scanner.close();
		
	}
	
	public static List<Integer> populate(int n){
		
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) temp.add((int)(Math.random() * 100));
		
		return temp;
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
		
		if(x) {
			System.out.print("Numeri in posizione pari :");
			int i = 0;
			for(int valore: list) {
				if((i + 1) % 2 == 0) System.out.print(" " + valore);
				i++;
			}
		}else{
			System.out.print("Numeri in posizione dispari :");
			int i = 0;
			for(int valore: list) {
				if((i + 1) % 2 != 0) System.out.print(" " + valore);
				i++;;
			}
			
		}
		
	}
}
