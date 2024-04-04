import java.util.ArrayList;

public class Depozit {

	private ArrayList<Produs> produse;
	
	public Depozit() {
        this.produse = new ArrayList<>();
	}
	public void adaugaProdus(Produs produs) {
	    for (Produs x: produse) {
	        if (x.getCod().equals(produs.getCod())) {
	            x.setCantitate(produs.getCantitate());
	            return; 
	        }
	    }
	    produse.add(produs);
	}
  public void afiseazaInventar() {
	    for (Produs y : produse) {
	         System.out.println("Cod: " + y.getCod() + ", Nume: " + y.getNume() + ", Pret: " + y.getPretDeBaza() + ", Cantitate: " + y.getCantitate());
	        }
	    }
}
