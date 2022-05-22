package tema1_clase;

import java.lang.reflect.Array;

public class Aplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categorie cat1 = new Categorie("Electrocasnice");
		Categorie cat2 = new Categorie("Mancare");
		
		Furnizor f1 = new Furnizor("Furnizor1");
		Furnizor f2 = new Furnizor("Furnizor2");
		
		Produs p1 = new Produs("Mar", 10, f1, 5, cat1, "FRuct");
		Produs p2 = new Produs("Para", 11, f1, 5, cat1, "Altceva");
		Produs p3 = new Produs("Sparanghel", 11, f2, 5, cat2, "Altceva");
		
		Cont c = new Cont("123", 100.5F, true, "1025", "111");
		Cont c_client2 = new Cont("124", 100.5F, true, "1025", "111");
		Cont c2 = new Cont("111", 1000.5F, true, "1034", "112");
		Produs[] produse = new Produs[15];
		Produs[] produse2 = new Produs[10];
		
		Client cli = new Client("nume", "prenume", 55, produse, c);
		cli.aduagareProdus(p1);
		cli.aduagareProdus(p1);
		cli.aduagareProdus(p2);
		cli.stergereProdus(p1);
		
//		cli.afisareClient();
		
		Client client2 = new Client("nume2", "prenume2", 15, produse2, c_client2);
//		client2.afisareClient();
		client2.aduagareProdus(p2);
		client2.aduagareProdus(p2);
		client2.aduagareProdus(p2);
		client2.aduagareProdus(p2);
		client2.aduagareProdus(p1);
		client2.aduagareProdus(p1);
		client2.aduagareProdus(p1);
		
		
		
		ItemCatalog ic = new ItemCatalog(3, p1);
		ItemCatalog ic2 = new ItemCatalog(20, p2);
		
		ItemCatalog[] catalog = new ItemCatalog[20];
		catalog[0] = ic;
		catalog[1] = ic2;
		Client[] clienti = new Client[]{cli, client2};
		
		Emag emag = new Emag("Emag", 10, c2, catalog, clienti);
		
		System.out.println();
		emag.afisareInventar();
		System.out.println();
		cli.finalizareComanda();
		client2.finalizareComanda();
		emag.procesareComenzi();
		System.out.println();
		emag.afisareInventar();
		
		
		System.out.println();
		emag.afisareVenit();
		
		emag.addItemCatalog(p3, 23);
		
		emag.afisareInventar();
	}

}
