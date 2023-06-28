package Esercizio1;

public class esercizio1_main {

	public static void main(String[] args) {
		
		System.out.println("Numero Caratteri (pari = true / dispari = false)");
		System.out.println();
		
		// controllo prima stringa
		String strOne = "Ciao, sono Manuel";
		System.out.println("La stringa - " + strOne + " - è: " + stringPariDispari(strOne));
		
		// controllo seconda stringa
		String strTwo = "Ciao, sono Luca!";
		System.out.println("La stringa - " + strTwo + " - è: " + stringPariDispari(strTwo));
		
		System.out.println();
		
		System.out.println("Anno bisestile");
		System.out.println();
		
		// controllo prima stringa
		int yearOne = 2013;
		System.out.println("L'anno " + yearOne + " è: " + annoBisestile(yearOne));
		
		// controllo seconda stringa
		int yearTwo = 2024;
		System.out.println("L'anno " + yearTwo + " è: " + annoBisestile(yearTwo));
		
	}
	
	public static boolean stringPariDispari(String str) {
		
		if(str.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
		//return (str.length() % 2 == 0);
		
	}
	
	public static boolean annoBisestile(int year) {
		
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}else if(year % 100 == 0 && year % 400 == 0) {
			return true;
		}else {
			return false;
		}
		
		//return (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0);
	}
	
}
