package com.monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello monopoly !");
		System.out.println("Cuantos jogadores sois ?");
		int numeroJugadores = sc.nextInt();
		System.out.println("Genial, sois " + numeroJugadores + " jugadores.");
		
		// inicializar tablero
		Tablero tablero = initTablero();
		tablero.mostrarTablero();
		// inicializar dado
	}
	
	public static Tablero initTablero() {
		ArrayList<Casilla> casillas = new ArrayList<Casilla>();

		Propriedad champs_elysees = new Propriedad(400, 50);
		champs_elysees.setNombre("Champs-Élysées");
		casillas.add(champs_elysees);
		Propriedad montmartre = new Propriedad(280, 35);
		montmartre.setNombre("Montmartre");
		casillas.add(montmartre);
		Propriedad marais = new Propriedad(300, 38);
		marais.setNombre("Le Marais");
		casillas.add(montmartre);
		Propriedad saint_germain = new Propriedad(350, 45);
		saint_germain.setNombre("Saint-Germain-des-Prés");
		casillas.add(saint_germain);
		Impuesto taxe_luxe = new Impuesto("Taxe de Luxe", 100);
		casillas.add(taxe_luxe);
		Propriedad quartier_latin = new Propriedad(260, 32);
		quartier_latin.setNombre("Quartier Latin");
		casillas.add(quartier_latin);
		Propriedad opera = new Propriedad(320, 40);
		opera.setNombre("Opéra");
		casillas.add(opera);
		Propriedad bastille = new Propriedad(240, 30);
		bastille.setNombre("Place de la Bastille");
		casillas.add(bastille);
		Propriedad republique = new Propriedad(220, 28);
		republique.setNombre("Place de la République");
		casillas.add(republique);
		Propriedad concorde = new Propriedad(380, 48);
		concorde.setNombre("Place de la Concorde");
		casillas.add(concorde);
		Impuesto impot_foncier = new Impuesto("Impôt Foncier", 75);
		casillas.add(impot_foncier);
		Propriedad trocadero = new Propriedad(340, 42);
		trocadero.setNombre("Trocadéro");
		casillas.add(trocadero);
		Propriedad pigalle = new Propriedad(200, 25);
		pigalle.setNombre("Pigalle");
		casillas.add(pigalle);
		Propriedad belleville = new Propriedad(180, 22);
		belleville.setNombre("Belleville");
		casillas.add(belleville);
		Propriedad canal_saint_martin = new Propriedad(250, 31);
		canal_saint_martin.setNombre("Canal Saint-Martin");
		casillas.add(belleville);
		Propriedad invalides = new Propriedad(310, 39);
		invalides.setNombre("Les Invalides");
		casillas.add(invalides);
		Impuesto contribution_urbaine = new Impuesto("Contribution Urbaine", 50);
		casillas.add(contribution_urbaine);
		Propriedad pantheon = new Propriedad(290, 36);
		pantheon.setNombre("Panthéon");
		casillas.add(pantheon);
		Propriedad luxembourg = new Propriedad(330, 41);
		luxembourg.setNombre("Jardin du Luxembourg");
		casillas.add(luxembourg);
		Propriedad madeleine = new Propriedad(360, 46);
		madeleine.setNombre("La Madeleine");
		casillas.add(madeleine);
		Propriedad vendome = new Propriedad(420, 52);
		vendome.setNombre("Place Vendôme");
		casillas.add(vendome);
		Propriedad rivoli = new Propriedad(370, 47);
		rivoli.setNombre("Rue de Rivoli");
		casillas.add(vendome);
		Impuesto taxe_habitation = new Impuesto("Taxe d'Habitation", 60);
		casillas.add(taxe_habitation);
		Propriedad grands_boulevards = new Propriedad(270, 34);
		grands_boulevards.setNombre("Grands Boulevards");
		casillas.add(grands_boulevards);
		
		// Création des impôts

		
		
//		
//		Impuesto impot_revenus = new Impuesto("Impôt sur les Revenus", 150);
//		casillas.add(impot_revenus);
		
		Tablero tablero = new Tablero(casillas);
		
		return tablero;
	}
}
