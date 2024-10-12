package org.lessons.java.inheritance.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		//sfrutto la classe arraylist per creare una lista dinamica
		ArrayList <Prodotto> carrello = new ArrayList<>(); 
		
		Scanner scan = new Scanner(System.in); 
		
		boolean continua = true;
		// ciclo la domanda fin quando l'utente vuole aggiungere prodotti nel carrello
        while (continua) {
        	System.out.println("Seleziona il prodotto da inserire nel carrello: \n"
        			+ "- 1 per Smartphone \n"
        			+ "- 2 per Televisiori \n"
        			+ "- 3 per cuffie \n");
        	int scelta = scan.nextInt();
        	scan.nextLine();
        	Prodotto list = null;

		
		switch (scelta) {
		case 1 : {
			Smartphone iphone = new Smartphone ("Iphone 16 pro", "Apple", 1299);
			System.out.println("Hai scelto un: " + iphone );
			carrello.add(iphone);
			break;
		}
		case 2 : {
			Televisori tv = new Televisori ("SmartTV ","Hisense", 490, "40 pollici", true );
			System.out.println("Hai scelto uno: " + tv );
			carrello.add(tv);
			break;
		}
		case 3 : {
			Cuffie cuffie = new Cuffie ("AirPods", "Apple", 130, true);
			System.out.println("Hai scelto un paio di : " + cuffie );
			carrello.add(cuffie);
			break;
		}
		// imposto un default, serve nel momento in cui si sbaglia la selezione
        default:
            System.out.println("Scelta non valida. Nessun elemento selezionato!");
            break;
		}
		// faccio decidere all'utente se vuole continuare ad aggiungere prodotti
        System.out.println("Vuoi aggiungere un altro prodotto? (si/no):");
        String risposta = scan.nextLine();
        if (!risposta.equalsIgnoreCase("si")) {
            continua = false;
        }
    }
		
        System.out.println("\nRiepilogo del carrello:");
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto); 
        }
	}

		
}
