// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema1_clase;

/************************************************************/
/**
 * 
 */
public class Emag extends ECommerce {
	/**
	 * 
	 */
	public Cont cont;
	/**
	 * 
	 */
	public ItemCatalog[] itemCatalog;
	/**
	 * 
	 */
	public Client[] clienti;

	/**
	 * 
	 * @param produs 
	 */
	
	
	
	
	public int isDisponibil(Produs produs) {
		for(int i = 0; i < itemCatalog.length; i++ ) 
			if(itemCatalog[i].getProdus().getNume_produs().equalsIgnoreCase(produs.getNume_produs()))
				return itemCatalog[i].getCantitate();
		
		return 0;
	}
	
	public Emag(String nume, int numarAngajati, Cont cont, ItemCatalog[] itemCatalog, Client[] clienti) {
		super(nume, numarAngajati);
		this.cont = cont;
		this.itemCatalog = itemCatalog;
		this.clienti = clienti;
	}
	

	public Cont getCont() {
		return cont;
	}

	public void setCont(Cont cont) {
		this.cont = cont;
	}

	public ItemCatalog[] getItemCatalog() {
		return itemCatalog;
	}

	public void setItemCatalog(ItemCatalog[] itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	public Client[] getClienti() {
		return clienti;
	}

	public void setClienti(Client[] clienti) {
		this.clienti = clienti;
	}

	public int cantitateProdus(Produs produs) {
		for(int i = 0 ; i < itemCatalog.length ; i++)
			if(itemCatalog[i].getProdus().getNume_produs().equalsIgnoreCase(produs.getNume_produs())) {
				return itemCatalog[i].getCantitate();
			}
		return 0;
	}

	/**
	 * 
	 */
	public void afisareInventar() {
		System.out.println("Produsele din inventar:");
		for(int i = 0 ; i < itemCatalog.length; i++)
			itemCatalog[i].afisareItemCatalog();
	}

	/**
	 * 
	 */
	public void afisareVenit() {
		float total = 0;
		for(int i = 0 ; i < clienti.length; i++)
			if(clienti[i].isReadyCheckout() && clienti[i].isDoneCheckout()) {
				total += clienti[i].totalPlata();
			}
		System.out.println("Venitul Emag-ului: " + total);
	}

	/**
	 * 
	 * @param client 
	 */
	public void anulareComandaClient(Client client) {
		System.out.println("Comanda clientului " + client.getNume() + " " + client.getPrenume() + " a fost anulata");
		client.setReadyCheckout(false);
	}

	/**
	 * 
	 * @param client 
	 */
	public void restituieBani(Client client) {
		if(client.isDoneCheckout()) {
			this.cont.retragere(client.totalPlata());
			client.cont.adaugare(client.totalPlata());
		} else {
			System.out.println("Comanda clientului nu a fost inca procesata! Suma nu poate fi restituita");
		}
	}
	
	public void plataClient(Client client) {
		client.cont.retragere(client.totalPlata());
		this.cont.adaugare(client.totalPlata());
		generareFactura(client);
	}

	/**
	 * 
	 * @param client 
	 */
	
	public void generareFactura(Client client) {
		System.out.println("Client: ");
		client.afisareClient();
		System.out.println("Produse: ");
		client.afisareProduse();
		System.out.println("Total Plata: " + client.totalPlata());
	}
	
	public void procesareComenzi() {
		for(int i = 0 ; i < clienti.length; i++)
			if(clienti[i].isReadyCheckout() && !clienti[i].isDoneCheckout()) {
				int flagCantitate = 1;
				for(int j = 0 ; j < clienti[i].getProdus().length ; j++) {
					if(clienti[i].getNrProduse(clienti[i].getProdus()[j]) > cantitateProdus(clienti[i].getProdus()[j])) {
						flagCantitate = 0;
						break;
					}
				if(flagCantitate == 1) {
					clienti[i].setDoneCheckout(true);
					plataClient(clienti[i]);
				}
	
				}
				if(flagCantitate == 0)
					anulareComandaClient(clienti[i]);
				
					
			}
			
		
	}
}