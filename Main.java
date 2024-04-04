
public class Main {

	public static void main(String[] args) {
		
       Depozit d = new Depozit();

       Produs p1 = new Produs("100", "Pom", 55.9, 500);
       Produs p2 = new Compensat("589", "Lapte Praf", 30, 100, 0.7);
       
       d.adaugaProdus(p1);
       d.adaugaProdus(p2);
       
       d.afiseazaInventar();
	}

}
