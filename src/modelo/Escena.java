package modelo;

import processing.core.PApplet;

public class Escena extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Escena.class.getName());

	} // MAIN

	public void settings () {


	}	//SETTINGS

	public void setup (String palabra) {

		if (palabra!=null) {

			String[] lines = loadStrings ("../resources/Texto.txt");

			if (lines!=null) {

				String [] newLines = new String [lines.length];
				for (int i = 0; i < lines.length; i++) {

					String currentWord = lines [i];
					if (currentWord == palabra)
					{
						currentWord = lines [i].toUpperCase();
					}
					newLines [i] = currentWord;
				}
				saveStrings ("../resources/Texto.txt", newLines);
			}
		}
	}
}//SETUP



