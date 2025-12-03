package com.monopoly;

import java.util.Scanner;

public class Monopoly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello monopoly !");
		System.out.println("Cuantos jogadores sois ?");
		int numeroJugadores = sc.nextInt();
		System.out.println("Genial, sois " + numeroJugadores + " jugadores.");
		// inicializar tablero
		// inicializar dado
		while (numeroJugador)
	}
	
	public Tablero initTablero() {
		 // Création des propriétés - Rues de Paris
	     Propriedad champs_elysees = new Propriedad(400, 50);
	     champs_elysees.setNombre("Champs-Élysées");
	     
	     Propriedad montmartre = new Propriedad(280, 35);
	     montmartre.setNombre("Montmartre");
	     
	     Propriedad marais = new Propriedad(300, 38);
	     marais.setNombre("Le Marais");
	     
	     Propriedad saint_germain = new Propriedad(350, 45);
	     saint_germain.setNombre("Saint-Germain-des-Prés");
	     
	     Propriedad quartier_latin = new Propriedad(260, 32);
	     quartier_latin.setNombre("Quartier Latin");
	     
	     Propriedad opera = new Propriedad(320, 40);
	     opera.setNombre("Opéra");
	     
	     Propriedad bastille = new Propriedad(240, 30);
	     bastille.setNombre("Place de la Bastille");
	     
	     Propriedad republique = new Propriedad(220, 28);
	     republique.setNombre("Place de la République");
	     
	     Propriedad concorde = new Propriedad(380, 48);
	     concorde.setNombre("Place de la Concorde");
	     
	     Propriedad trocadero = new Propriedad(340, 42);
	     trocadero.setNombre("Trocadéro");
	     
	     Propriedad pigalle = new Propriedad(200, 25);
	     pigalle.setNombre("Pigalle");
	     
	     Propriedad belleville = new Propriedad(180, 22);
	     belleville.setNombre("Belleville");
	     
	     Propriedad canal_saint_martin = new Propriedad(250, 31);
	     canal_saint_martin.setNombre("Canal Saint-Martin");
	     
	     Propriedad invalides = new Propriedad(310, 39);
	     invalides.setNombre("Les Invalides");
	     
	     Propriedad pantheon = new Propriedad(290, 36);
	     pantheon.setNombre("Panthéon");
	     
	     Propriedad luxembourg = new Propriedad(330, 41);
	     luxembourg.setNombre("Jardin du Luxembourg");
	     
	     Propriedad madeleine = new Propriedad(360, 46);
	     madeleine.setNombre("La Madeleine");
	     
	     Propriedad vendome = new Propriedad(420, 52);
	     vendome.setNombre("Place Vendôme");
	     
	     Propriedad rivoli = new Propriedad(370, 47);
	     rivoli.setNombre("Rue de Rivoli");
	     
	     Propriedad grands_boulevards = new Propriedad(270, 34);
	     grands_boulevards.setNombre("Grands Boulevards");
	     
	     // Création des impôts
	     Impuesto taxe_luxe = new Impuesto("Taxe de Luxe", 100);
	     Impuesto impot_foncier = new Impuesto("Impôt Foncier", 75);
	     Impuesto contribution_urbaine = new Impuesto("Contribution Urbaine", 50);
	     Impuesto taxe_habitation = new Impuesto("Taxe d'Habitation", 60);
	     Impuesto impot_revenus = new Impuesto("Impôt sur les Revenus", 150);
	}
}
