package com.monopoly;

import java.util.Random;

public class Dado {

	private int tirada;
	private Random r;
	
	public Dado() {
		this.tirada = 0;
		this.r = new Random();
	}

	public int getTirada() {
		return tirada;
	}

	public void setTirada(int tirada) {
		this.tirada = tirada;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}
	
	public int tirar() {
		this.tirada = r.nextInt(6) + 1;
		return this.tirada;
	}
	
	
}
