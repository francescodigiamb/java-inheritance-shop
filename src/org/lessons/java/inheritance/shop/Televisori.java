package org.lessons.java.inheritance.shop;

public class Televisori extends Prodotto {
	
	private String dimensioni;
	private boolean smart;

	public Televisori (String nome, String marca, double prezzo, String dimensioni, boolean smart) {
		super(nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;
		
	}
	
	public String getDimensioni () {
		return dimensioni;
	}
	
	public boolean getSmart () {
		return smart;
	}

	
	
}
