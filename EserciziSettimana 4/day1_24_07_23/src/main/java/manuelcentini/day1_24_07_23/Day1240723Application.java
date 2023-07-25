package manuelcentini.day1_24_07_23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Day1240723Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1240723Application.class, args);
		
		
		GestioneMenu stampaM = new GestioneMenu();
		stampaM.stampaMenu();
		System.out.println();
		stampaM.testTopping();
		
		System.out.println();
		GestioneOrdini stampaO = new GestioneOrdini();
		stampaO.stampaOrdine();
	}

}
   