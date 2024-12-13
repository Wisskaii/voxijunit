package fr.voxi.oeuvres;

public class Oeuvre {
	
	private int numero ;
	private String titre ;
	
	public Oeuvre(int numero, String titre) {
		this.numero = numero;
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
}
