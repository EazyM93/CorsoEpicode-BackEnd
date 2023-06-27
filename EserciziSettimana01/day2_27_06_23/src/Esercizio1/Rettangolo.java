package Esercizio1;

public class Rettangolo {

	public double lato1;
	public double lato2;
	public double p;
	public double a;
	
	Rettangolo(double _lato1, double _lato2){
		this.lato1 = _lato1;
		this.lato2 = _lato2;
		this.p = perimetro(_lato1, _lato2);
		this.a = area(_lato1, _lato2);
	}
	
	private double perimetro(double l1,double l2) {
		return (l1 + l2) * 2;
	}
	
	private double area(double l1,double l2) {
		return l1 * l2;
	}
	
}
