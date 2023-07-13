package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartitaDiCalcio extends Evento{

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int golCasa;
	private int golOspite;
	
	
}
