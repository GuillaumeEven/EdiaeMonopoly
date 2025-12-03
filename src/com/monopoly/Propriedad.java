package com.monopoly;

import java.util.Scanner;

public class Propriedad extends Casilla {
	
	private int precio;
	private int alquiler;
	private Jugador duenyo;
	private Scanner sc;
	
	public Propriedad(int precio, int alquiler) {
		this.precio = precio;
		this.alquiler = alquiler;
	}

	@Override
	public void accion(Jugador jugador) {
		System.out.println("Te quedas en:");
		this.toString();
		if (this.duenyo == null) {
			System.out.println("Te interesa este bien ?");
			System.out.println("Tecla 1 si quieres, cualquier otra cosa si no");
			if (sc.next() == "1") {
				System.out.println("Ok, a firmar el papeleo !");
				jugador.comprarPropriedad(this);
			}
		} else if (this.duenyo == jugador) {
			System.out.println("Home sweet home !");
		} else {
			System.out.println("Uch ! Tienes que pagarle " + this.getAlquiler() + " a " + this.duenyo.getNombre());
			jugador.pagarAlquiler(this, this.duenyo);
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(int alquiler) {
		this.alquiler = alquiler;
	}

	public Jugador getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(Jugador duenyo) {
		this.duenyo = duenyo;
	}
}
