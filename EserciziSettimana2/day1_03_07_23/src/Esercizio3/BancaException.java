package Esercizio3;

public class BancaException extends Exception{

	BancaException(String message){
		super(message); 
	}
	
	public String toString(){
		return getMessage();
	}
}
