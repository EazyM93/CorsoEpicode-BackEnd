package manuelcentini.day1_24_07_23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class Day1240723Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1240723Application.class, args);
		
		// esercizio 1
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Day1240723Application.class);
		
		System.out.println(ctx.getBean("getHW"));
		
		ctx.close();
		
	}

}
