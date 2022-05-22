// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema1_clase;

/************************************************************/
/**
 * 
 */
public class Produs {
	/**
	 * 
	 */
	private String nume_produs;
	/**
	 * 
	 */
	private float pret;
	/** 
	 * 
	 */
	private String furnizor;
	/**
	 * 
	 */
	private float rating;
	/**
	 * 
	 */
	private Categorie categorie;
	/**
	 * 
	 */
	private String descriere;

	/**
	 * 
	 */
	public void afisareProdus() {
		System.out.println("Produs [nume_produs=" + nume_produs + ", pret=" + pret + ", furnizor=" + furnizor + ", rating=" + rating
				+ ", categorie=" + categorie + ", descriere=" + descriere + "]");
	}

	/**
	 * 
	 * @param procent 
	 */
	public void diminuarePret(float procent) {
		pret = pret - pret * procent;
	}

	/**
	 * 
	 * @param procent 
	 */
	public void cresterePret(float procent) {
		pret = pret + pret * procent;
	}
	
	public Produs(String nume_produs, float pret, String furnizor, float rating, Categorie categorie,
			String descriere) {
		super();
		this.nume_produs = nume_produs;
		this.pret = pret;
		this.furnizor = furnizor;
		this.rating = rating;
		this.categorie = categorie;
		this.descriere = descriere;
	}
	
	

	public String getNume_produs() {
		return nume_produs;
	}

	public void setNume_produs(String nume_produs) {
		this.nume_produs = nume_produs;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public String getFurnizor() {
		return furnizor;
	}

	public void setFurnizor(String furnizor) {
		this.furnizor = furnizor;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	
	
}
