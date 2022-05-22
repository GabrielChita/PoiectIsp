package tema1_clase;

import java.lang.reflect.Array;

public class Aplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Produs p1 = new Produs("Mar", 10, "Furnizor", 5, Categorie.Electrocasnice, "FRuct");
		Produs p2 = new Produs("Para", 11, "Furnizor2", 5, Categorie.Electrocasnice, "Altceva");
		Cont c = new Cont("123", 100.5F, true, "1025", "111");
		Cont c2 = new Cont("111", 1000.5F, true, "1034", "112");
		Produs[] produse = new Produs[10];
		Produs[] produse2 = new Produs[10];
		
		Client cli = new Client("nume", "prenume", 55, produse, c);
		cli.aduagareProdus(p1);
		cli.aduagareProdus(p1);
		cli.aduagareProdus(p2);
		cli.stergereProdus(p1);
		
//		cli.afisareClient();
		
		Client client2 = new Client("nume2", "prenume2", 15, produse2, c);
//		client2.afisareClient();
		
		
		ItemCatalog ic = new ItemCatalog(10, p1);
		ItemCatalog ic2 = new ItemCatalog(20, p2);
		
		ItemCatalog[] catalog = new ItemCatalog[]{ic, ic2};
		Client[] clienti = new Client[]{cli, client2};
		
		Emag emag = new Emag("Emag", 10, c2, catalog, clienti);
		//emag.afisareInventar();
		
		cli.finalizareComanda();
		emag.procesareComenzi();
		
	}

}
