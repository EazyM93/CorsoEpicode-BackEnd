package esercizio1;

public class App {

	public static void main(String[] args) {
		
		Simboli thr1 = new Simboli("*");
		Simboli thr2 = new Simboli("#");
		
		thr1.start();
		try {
			thr1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		thr2.start();
	}

}
