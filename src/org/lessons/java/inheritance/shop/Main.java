package org.lessons.java.inheritance.shop;

public class Main {

	public static void main(String[] args) {
		//Proviamo la tv
		Televisori tv = new Televisori ("TV 40 pollici ","Hisense", 490, true );
		
		System.out.println("La Tv selezionata è: " + tv.getNome() + tv.getMarca());
		System.out.println("Il suo codice è: " + tv.getCodice());
		System.out.println("Il suo prezzo è: " + tv.getPrezzo());
		
		System.out.println();
		
		//Proviamo lo smartphone
		Smartphone iphone = new Smartphone ("Iphone 16 pro", "Apple", 1299);
	
		System.out.println("Lo Smartphone selezionato è: " + iphone.getNome() + "-" + iphone.getMarca());
		System.out.println("Il suo codice prodotto è: " + iphone.getCodice());
		System.out.println("Il suo prezzo è: " + iphone.getPrezzo());
		System.out.println("Il suo codice IMEI è: " + iphone.getCodiceIMEI());
		
		System.out.println();
		
		//Proviamo le cuffie
		Cuffie cuffie = new Cuffie ("AirPods", "Apple", 130, "bianco", true);
		
		System.out.println("Le Cuffie selezionate sono: " + cuffie.getNome() + "-" + cuffie.getMarca());
		System.out.println("Il loro prezzo è di: " + cuffie.getPrezzo());
		System.out.println("Il loro colore è: " + cuffie.getColore());
		
	
	
	}
	
	
}
