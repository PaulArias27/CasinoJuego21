package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dealer dealer = new Dealer();

	        int maximo = 10;

	        boolean encontroCero = false;
	        boolean encontroMaximo = false;
	        boolean fueraDeRango = false;

	        for (int i = 0; i < 100; i++) {

	            int numero = dealer.generarAleatorio(maximo);

	            System.out.println(numero);

	            // Verificar que no se pase del máximo
	            if (numero < 0 || numero > maximo) {
	                fueraDeRango = true;
	            }

	            // Verificar si aparece 0
	            if (numero == 0) {
	                encontroCero = true;
	            }

	            // Verificar si aparece el máximo
	            if (numero == maximo) {
	                encontroMaximo = true;
	            }
	        }

	        System.out.println("¿Se pasó del rango? " + fueraDeRango);
	        System.out.println("¿Apareció 0? " + encontroCero);
	        System.out.println("¿Apareció el máximo? " + encontroMaximo);
	    }


}
