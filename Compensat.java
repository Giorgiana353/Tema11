
public class Compensat extends Produs {
	
     private double coeficient;

	public Compensat(String cod, String nume, double pretDeBaza, int cantitate, double coeficient) {
		super(cod, nume, pretDeBaza, cantitate);
		this.coeficient = coeficient;
	}

	public double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}
     
	public double pretFinal() {
		return getPretDeBaza() * coeficient;
	}
}
