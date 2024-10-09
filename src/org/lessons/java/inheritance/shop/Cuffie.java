package org.lessons.java.inheritance.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean wireless;

	public Cuffie (String nome, String marca, double prezzo, String colore, boolean wireless) {
		super (nome, marca, prezzo);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	public String getColore () {
		return colore;
	}
	public void setColore () {
		this.colore = colore;
	}
}
