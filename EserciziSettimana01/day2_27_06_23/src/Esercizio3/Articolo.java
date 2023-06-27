package Esercizio3;

public class Articolo {

	private String codiceArticolo;
	public String descrizioneArticolo;
	public double prezzoArticolo;
	public int pezziMagazzino;
	
	Articolo(String _codiceArticolo, String _descrizioneArticolo, double _prezzoArticolo, int _pezziMagazzino){
		this.codiceArticolo = _codiceArticolo;
		this.descrizioneArticolo = _descrizioneArticolo;
		this.prezzoArticolo = _prezzoArticolo;
		this.pezziMagazzino = _pezziMagazzino;
	}
	
	
}
