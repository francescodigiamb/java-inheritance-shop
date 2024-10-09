package org.lessons.java.inheritance.shop;

public class Televisori extends Prodotto {
	
	private double dimensioni;
	private boolean smart;

	public Televisori (String nome, String marca, double prezzo, boolean smart) {
		super(nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;
		
	}
	
	public double getDimensioni () {
		return dimensioni;
	}
	public void setDimensioni () {
		this.dimensioni = dimensioni;
	}
	
	
}
