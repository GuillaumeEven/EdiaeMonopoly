package com.monopoly;

public class Tools {
	
	public static String ponEspacios(String txt, int len) {
		String content = "";
		content += "║ " + txt;
		int numeroEspacios = len - txt.length();
		for (int i = 0; i < numeroEspacios; i++) {
			content += " ";
		}
		content += "║\n";
		return content;
	}

}
