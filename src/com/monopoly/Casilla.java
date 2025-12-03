package com.monopoly;

public abstract class Casilla {
	
	// Atributos
	private String nombre;
	
	public abstract void accion(Jugador jugador);

	public Casilla(String nombre) {
		this.nombre = nombre;
	}

	public Casilla() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//
//	public String getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}

	@Override
	public String toString() {
		return "Casilla [nombre=" + nombre + "]";
	}
	
	
	
}
