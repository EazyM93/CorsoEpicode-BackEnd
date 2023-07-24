package beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entities.Pizza;
import entities.Topping;

@Configuration
public class BeansConfiguration {

	@Bean("margherita")
	Pizza getMargherita() {
		
	}
	
	
	
	@Bean("hawaiana")
	Pizza getHawaiian() {
		
	}
	
	@Bean("salame")
	Pizza getSalami() {
	
	}
	
}
