
public class Produs {

	private String cod;
	private String nume;
	private double pretDeBaza;
	private int cantitate;
	
	public Produs(String cod, String nume, double pretDeBaza, int cantitate) {
		this.cod = cod;
		this.nume = nume;
		this.pretDeBaza = pretDeBaza;
		this.cantitate = cantitate;
	}

	public String getCod() {
		return cod;
	}

	public String getNume() {
		return nume;
	}

	public double getPretDeBaza() {
		return pretDeBaza;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	
	
}
