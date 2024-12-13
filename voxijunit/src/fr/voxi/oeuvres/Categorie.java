package fr.voxi.oeuvres;
import java.util.* ;

public class Categorie {
	
	private int numero ;
	private String libelle ;
	private Oeuvre oeuvre ;
	
	public Categorie(int numero, String libelle) {
		this.numero = numero;
		this.libelle = libelle;
	}

	ArrayList<Oeuvre> listeOeuvreCategorie = new ArrayList<>() ;
	
	public boolean addOeuvre(Oeuvre oeuvre){
		if(listeOeuvreCategorie.contains(oeuvre) == false){
			listeOeuvreCategorie.add(oeuvre);
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean suppOeuvre(Oeuvre oeuvre){
		if(listeOeuvreCategorie.contains(oeuvre)){
			listeOeuvreCategorie.remove(oeuvre) ;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	@Override
	public String toString() {
		return "Categorie [numero=" + numero + ", libelle=" + libelle + ", listeOeuvreCategorie= "
				+ listeOeuvreCategorie + "]";
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
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}