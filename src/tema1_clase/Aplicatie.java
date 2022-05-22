package tema1_clase;

import java.lang.reflect.Array;

public class Aplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CEVA LAA");
		
		Produs p1 = new Produs("Mar", 10, "Furnizor", 5, Categorie.Electrocasnice, "FRuct");
		Produs p2 = new Produs("Para", 11, "Furnizor2", 5, Categorie.Electrocasnice, "Altceva");
		Cont c = new Cont("123", 100.5F, true, "2510", "111");
		Cont c2 = new Cont("111", 1000.5F, true, "2510", "112");
		Produs[] produse = new Produs[10];
		
		Client cl = new Client("nume", "prenume", 55, produse, c);
		cl.aduagareProdus(p1);
		cl.aduagareProdus(p1);
		cl.aduagareProdus(p2);
		cl.stergereProdus(p1);
		
		cl.afisareClient();
		
		System.out.println("nr prod " + cl.getNrProduse(p1));
		
		
		ItemCatalog ic = new ItemCatalog(10, p1);
		ItemCatalog ic2 = new ItemCatalog(20, p2);
		
//		Emag emag = new Emag("Emag", 10, c2, 
	}

}
