package entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Libro extends Lettura{

	private String autore;
	private Genere genere;
	
	
}
	
	
	
	
	
