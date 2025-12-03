package com.monopoly;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Casilla> casillas;

	public Tablero(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}

	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}

	public void setCasillas(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}
	
	public void mostrarTablero() {
		for (Casilla casilla:this.casillas) {
			casilla.toString();
		}
	}
}
