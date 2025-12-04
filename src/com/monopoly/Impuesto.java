package com.monopoly;

public class Impuesto extends Casilla {
	
	private int cantidad;

	public Impuesto(String nombre, int cantidad) {
		super(nombre);
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public void accion(Jugador jugador) {
		if (jugador.getDinero() >= this.cantidad) {
			System.out.println("Hay que participar en los gastos comunes, gracias !");
			System.out.println("Te quito " + this.cantidad + ".");
			jugador.setDinero(jugador.getDinero() - cantidad);
		} else {
			System.out.println("Qué mal, no tienes bastante para pagarme ! Pues te quito lo que te queda");
			jugador.setDinero(0);
		}
	}
	
	

}
