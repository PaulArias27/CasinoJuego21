package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class testJuego21 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {

            System.out.println("===== PARTIDA " + (i+1) + " =====");

            Juego21 juego = new Juego21();

            Jugador j1 = new Jugador();
            j1.setNickname("Jugador1");

            Jugador j2 = new Jugador();
            j2.setNickname("Jugador2");

            Jugador j3 = new Jugador();
            j3.setNickname("Jugador3");

            juego.agregarJugador(j1);
            juego.agregarJugador(j2);
            juego.agregarJugador(j3);

            juego.inicializar();

            ArrayList<?> ganadores = juego.jugar();

            if (ganadores != null && !ganadores.isEmpty()) {
                System.out.println("Hay ganador(es)");
                break;
            }
        }
	}

}
