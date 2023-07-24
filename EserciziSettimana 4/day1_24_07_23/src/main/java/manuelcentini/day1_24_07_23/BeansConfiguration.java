package manuelcentini.day1_24_07_23;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

	@Bean
	String getHW() {
		return "Hello World";
	}
	
}
