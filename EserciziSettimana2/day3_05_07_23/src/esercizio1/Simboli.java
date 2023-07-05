package esercizio1;

public class Simboli extends Thread{

	String simbolo;
	
	Simboli(String simb){
		this.simbolo = simb;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(simbolo);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
