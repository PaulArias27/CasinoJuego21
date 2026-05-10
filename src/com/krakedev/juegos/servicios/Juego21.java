package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	private Dealer dealer;
	
	
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	
	
	
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
	}
	
	public void cargarValores() {
		for(Carta c : dealer.getNaipe()) {
			String valor = c.getValor();
			
			if(valor.equals("A")) {
				c.setValorJuego(11);
			}else if(valor.equals("J") || valor.equals("Q") || valor.equals("K")){
				c.setValorJuego(10);
			}else {
				c.setValorJuego(Integer.parseInt(valor));
			}
			
		}
	}
	
	public void agregarJugador(Jugador jugador) {
		
		jugadores.add(jugador);
	}
	
	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}
	
	public void repartirRonda() {
		for(Jugador j : jugadores) {
			repartirCarta(j);
		}
		
	}
	
	public void  calcularTotal() {
		
		for(Jugador j: jugadores) {
			int suma = 0;
			
			for (Carta c : j.getCartas()) {
				suma += c.getValorJuego();
			}
			j.setPuntajeCartas(suma);
		}
	}
	
	 public ArrayList<Jugador> validarGanador() {

	        ArrayList<Jugador> ganadores = new ArrayList<>();

	        for (Jugador j : jugadores) {
	            if (j.getPuntajeCartas() == 21) {
	                ganadores.add(j);
	            }
	        }

	        return ganadores;
	    }

	    public ArrayList<Jugador> jugar() {

	        ArrayList<Jugador> ganadores = null;

	        for (int i = 0; i < 3; i++) {

	            repartirRonda();
	            ganadores = validarGanador();

	            if (ganadores.size() > 0) {
	                break;
	            }
	        }

	        return ganadores;
	    }
	
	
}
