package entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "catalogo")
@Getter
@Setter
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lettura {

	@Id
	@GeneratedValue
	private UUID id;
	
	private long isbn;
	private String titolo;
	private int anno;
	private int pagine;
	
	public Lettura() {}
	
	@Override
	public String toString() {
		return "Lettura [isbn=" + isbn + ", titolo=" + titolo + ", anno=" + anno + ", pagine=" + pagine + "]";
	}
	
	
	
}
