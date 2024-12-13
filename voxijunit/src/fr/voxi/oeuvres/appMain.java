package fr.voxi.oeuvres;

public class appMain {

	public static void main(String[] args) {
		
		Oeuvre o1 = new Oeuvre(1, "ActionMan") ;
		Oeuvre o2 = new Oeuvre(2, "Peur") ;
		Oeuvre o3 = new Oeuvre(3, "WOW") ;
		
		Categorie test1 = new Categorie(1, "Action") ;
		Categorie test2 = new Categorie(2, "Horreur") ;
		test1.addOeuvre(o3) ;
		test2.addOeuvre(o2) ;
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		test2.suppOeuvre(o2) ;
		System.out.println(test2.toString());
		
	}

}
