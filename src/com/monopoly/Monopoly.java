package com.monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello monopoly !");
		
		// inicializar tablero
		Tablero tablero = initTablero();
		// inicializar dado
		Dado dado = new Dado();
		
		// Display tablero
		System.out.println(tablero.toString());
		
		System.out.println("Cuantos jogadores sois ?");
		int numeroJugadores = sc.nextInt();
		System.out.println("Genial, sois " + numeroJugadores + " jugadores.");

		sc.close();
	}
	
	public static Tablero initTablero() {
		ArrayList<Casilla> casillas = new ArrayList<Casilla>();

		casillas.add(new Propriedad("Champs-Élysées", 400, 50));
		casillas.add(new Propriedad("Montmartre", 280, 35));
		casillas.add(new Propriedad("Le Marais", 300, 38));
		casillas.add(new Propriedad("Saint-Germain-des-Prés", 350, 45));
		casillas.add(new Impuesto("Taxe de Luxe", 100));
		casillas.add(new Propriedad("Quartier Latin", 260, 32));
		casillas.add(new Propriedad("Opéra", 320, 40));
		casillas.add(new Propriedad("Place de la Bastille", 240, 30));
		casillas.add(new Propriedad("Place de la République", 220, 28));
		casillas.add(new Propriedad("Place de la Concorde", 380, 48));
		casillas.add(new Impuesto("Impôt Foncier", 75));
		casillas.add(new Propriedad("Trocadéro", 340, 42));
		casillas.add(new Propriedad("Pigalle", 200, 25));
		casillas.add(new Propriedad("Belleville", 180, 22));
		casillas.add(new Propriedad("Canal Saint-Martin", 250, 31));
		casillas.add(new Propriedad("Les Invalides", 310, 39));
		casillas.add(new Impuesto("Contribution Urbaine", 50));
		casillas.add(new Propriedad("Panthéon", 290, 36));
		casillas.add(new Propriedad("Jardin du Luxembourg", 330, 41));
		casillas.add(new Propriedad("La Madeleine", 360, 46));
		casillas.add(new Propriedad("Place Vendôme", 420, 52));
		casillas.add(new Propriedad("Rue de Rivoli", 370, 47));
		casillas.add(new Impuesto("Taxe d'Habitation", 60));
		casillas.add(new Propriedad("Grands Boulevards", 270, 34));
		
		Tablero tablero = new Tablero(casillas);
		
		return tablero;
	}
	
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        
        while (choix != 4) {
            afficherMenu();
            choix = scanner.nextInt();
            traiterChoix(choix);
        }
        scanner.close();
    }
    
    static void afficherMenu() {
        System.out.println("\n╔════════════════════╗");
        System.out.println("║      MENU         ║");
        System.out.println("╠════════════════════╣");
        System.out.println("║ 1. Option 1       ║");
        System.out.println("║ 2. Option 2       ║");
        System.out.println("║ 3. Option 3       ║");
        System.out.println("║ 4. Quitter        ║");
        System.out.println("╚════════════════════╝");
        System.out.print("Votre choix : ");
    }
    
    static void traiterChoix(int choix) {
        switch (choix) {
            case 1:
                System.out.println("→ Option 1 sélectionnée");
                break;
            case 2:
                System.out.println("→ Option 2 sélectionnée");
                break;
            case 3:
                System.out.println("→ Option 3 sélectionnée");
                break;
            case 4:
                System.out.println("→ Au revoir !");
                break;
            default:
                System.out.println("✖ Choix invalide !");
        }
    }
}
