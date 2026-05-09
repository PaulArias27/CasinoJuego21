package com.krakedev.juegos.test;
import com.krakedev.juegos.servicios.Dealer;

public class TestCosntructorDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dealer dealer = new Dealer();
		dealer.imprimirNaipe();
		System.out.println("Total de cartas: " + dealer.getNaipe().size());
	}

}
