package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	
	private ArrayList<Carta> naipe;
	
	
	//getters and setters
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	
	//metodos
	public void generarNaipe() {
		
		String[] palos = {"T","CN","CR","D"};
		String[] valores = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(String palo: palos) {
			for(String valor: valores){
				
				Carta carta = new Carta();
				carta.setPalo(palo);
				carta.setValor(valor);
				
				naipe.add(carta);
			}
		}
	}
	 public void imprimirNaipe() {
		 for(Carta c : naipe) {
			 c.imprimir();
		 }
	 }
	
	

}
