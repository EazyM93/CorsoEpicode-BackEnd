package day1_01_08_23.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {

	private int id_user;
	private String username;
	private String nomeCompleto;
	private String email;
	
}
