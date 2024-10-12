package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Smartphone extends Prodotto{

	private String codiceIMEI;
	private int memoria;
	
	public Smartphone (String nome, String marca, double prezzo) {
		super(nome, marca, prezzo);
		this.codiceIMEI = getCodiceIMEI();
		this.memoria = getMemoria();
	}
	
	public String getCodiceIMEI () {
        Random IMEI = new Random();
        StringBuilder code = new StringBuilder();

        // Con un ciclo for mi genero 16 cifre casuali
        for (int i = 0; i < 16; i++) {
            int cifra = IMEI.nextInt(10);  // Numero casuale tra 0 e 9
            code.append(cifra);
        }

        // Imposta il codice generato
        this.codiceIMEI = code.toString();
        return codiceIMEI;
	}
	
	public int getMemoria () {
		return memoria;
	}
	public void setMemoria (int memoria) {
		this.memoria = memoria;
	}
	
}
