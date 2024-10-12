package org.lessons.java.inheritance.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean wireless;

	public Cuffie (String nome, String marca, double prezzo, boolean wireless) {
		super (nome, marca, prezzo);
		this.wireless = wireless;
	}
	
	public String getColore () {
		return colore;
	}
	public void setColore (String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}
    @Override
    public String toString() {
        return "Cuffie: " + getNome() + " Marca: " + getMarca() + ", Prezzo: " + getPrezzo() + "€";
    }
}
