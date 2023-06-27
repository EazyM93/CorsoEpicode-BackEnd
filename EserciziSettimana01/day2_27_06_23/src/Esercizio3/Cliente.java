package Esercizio3;

public class Cliente {

	private String codiceCliente;
	private String nome;
	private String cognome;
	private String mail;
	private String dataIscrizione;
	
	Cliente(String _codiceCliente, String _nome, String _cognome, String _mail, String _dataIscrizione){
		this.codiceCliente = _codiceCliente;
		this.nome = _nome;
		this.cognome = _cognome;
		this.mail = _mail;
		this.dataIscrizione = _dataIscrizione;
	}
	
	public void mostraCliente() {
		System.out.println("DATI CLIENTE");
		System.out.printf("Nome: %s %s \n", this.nome, this.cognome );
		System.out.printf("Codice: %s \n", this.codiceCliente );
		System.out.println();
	}
	
}