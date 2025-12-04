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
	
	@Override
	public String toString() {
		String content = "";
		for (int i = 0; i < this.casillas.size(); i++) {
			Casilla casilla = this.casillas.get(i); 
			
			if (i == 0) {
				content += "╔══════════════════════════╗\n";
			} else {				
				content += "╠══════════════════════════╣\n";
			}
			// display name
			
			content += Tools.ponEspacios(casilla.getNombre(), 25);
			
			// display type and info
			if (casilla instanceof Propriedad) {
				content += Tools.ponEspacios("Propriedad", 25);
				if (((Propriedad) casilla).getDuenyo() != null) {
					String duenyo = ((Propriedad) casilla).getDuenyo().getNombre();
					content += Tools.ponEspacios(("Dueño : " + duenyo), 25);
				} else {
					content += Tools.ponEspacios("Libre", 25);
					String oferta = "Precio: " + ((Propriedad) casilla).getPrecio();
					content += Tools.ponEspacios(oferta, 25);
				}
			} else {
				content += Tools.ponEspacios("Impuesto", 25);
				content += Tools.ponEspacios("A pagar !!!", 25);
				String impuesto = "Nos debes " + ((Impuesto) casilla).getCantidad();
				content += Tools.ponEspacios(impuesto, 25);
			}
			
			if (i == this.casillas.size()-1) {
				content += "╚══════════════════════════╝\n";
			}
		}
		
		return content;
	}
}
