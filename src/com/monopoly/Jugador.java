package com.monopoly;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private int dinero;
	private int posicion;
	private ArrayList<Propriedad> propriedades;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.dinero = 10000;
		this.posicion = 0;
		this.propriedades = new ArrayList<>();
	}
	
	public Jugador() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public ArrayList<Propriedad> getPropriedades() {
		return propriedades;
	}
	public void setPropriedades(ArrayList<Propriedad> propriedades) {
		this.propriedades = propriedades;
	}
	
	public void mover (int pasos, int tamanyoTablero) {
		this.posicion += pasos;
		if (this.posicion >= tamanyoTablero) {
			this.posicion -= tamanyoTablero; 
		}
	}
	
	public void comprarPropriedad(Propriedad propriedad) {
		if (this.dinero >= propriedad.getPrecio()) {
			this.propriedades.add(propriedad);
			this.dinero -= propriedad.getPrecio();
			propriedad.setDuenyo(this);
		} else {
			System.out.println("Que te crees, no tienes dinero para algo tan chulo !");
		}
	}
	
	public void pagarAlquiler(Propriedad propriedad, Jugador duenyo) {
		if (this.dinero >= propriedad.getAlquiler()) {
			this.dinero -= propriedad.getAlquiler();
		} else {
			this.dinero = 0;
			System.out.println("Ya no te queda nada.");
		}
	}
	
	@Override
	public String toString() {
		String content = "╔════════════════╗\n";
		content += Tools.ponEspacios(getNombre(), 15);
		content += Tools.ponEspacios(("Dinero: " + getDinero()), dinero);
		for (Propriedad propriedad: this.propriedades) {
			content += propriedad.toString();
		}
		return content;
	}
	
	public String propriedadesToString() {
		String propriedades = "";
		for (Propriedad propriedad:this.propriedades) {
			propriedades += propriedad.toString();
		}
		
		return propriedades;
	}

	
}
