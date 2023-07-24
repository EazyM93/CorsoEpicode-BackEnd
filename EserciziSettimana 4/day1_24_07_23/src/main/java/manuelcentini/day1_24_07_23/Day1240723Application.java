package manuelcentini.day1_24_07_23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = { "day1_24_07_23.manuelcentini.day1_24_07_23", "day1_24_07_23.beans" })
public class Day1240723Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1240723Application.class, args);
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Day1240723Application.class);
		
		System.out.println("----------------------------------------PIZZE");
		System.out.println(ctx.getBean("getMargherita").toString());
		System.out.println();
		System.out.println(ctx.getBean("getHawaiian").toString());
		System.out.println();
		System.out.println(ctx.getBean("getSalami").toString());
		System.out.println();
		
		System.out.println("----------------------------------------TOPPING");
		System.out.println(ctx.getBean("getTomato").toString());
		System.out.println();
		System.out.println(ctx.getBean("getCheese").toString());
		System.out.println();
		System.out.println(ctx.getBean("getHam").toString());
		System.out.println();
		System.out.println(ctx.getBean("getPineapple").toString());
		System.out.println();
		System.out.println(ctx.getBean("getSal").toString());
		System.out.println();
		

		ctx.close();
		
	}

}
   