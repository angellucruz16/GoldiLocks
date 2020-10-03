package modelo;
import java.util.ArrayList;

import processing.core.PApplet;
import vista.MainMenu;

public class Escena extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Escena.class.getName());

	} // MAIN


	String [] arrayWords;
	ArrayList <String>  listWords;

	public void settings () {


	}	//SETTINGS

	public void setup (String palabra) {

		arrayWords = loadStrings ("../resources/Texto.txt");
		listWords = new ArrayList <String> ();

		String[] lines = loadStrings ("Texto.txt");
		String [] newLines = new String [lines.length];
		for (int i = 0; i < lines.length; i++) {

			String currentWord = lines [i];
			if (currentWord == palabra)
			{
				currentWord = lines [i].toUpperCase();
			}
			newLines [i] = currentWord;
		}
	}

	saveStrings ("../resources/Texto2.txt", newLines);

}//SETUP


}//draw

} //ESCENA
}

