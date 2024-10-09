package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
    public Prodotto( String nome, String marca, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = 1.22;
    }
	
	public int getCodice() {
        Random random = new Random();
        // genera numero casuale tra 0 e decide l'utente
        codice = random.nextInt(10000);
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca() {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo * iva;
	}
	public void setPrezzo() {
		this.prezzo = prezzo*iva;
	}
	

}
