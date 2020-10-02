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

	public void setup () {

		arrayWords = loadStrings ("../resources/Texto.txt");
		listWords = new ArrayList <String> ();


		for (int i = 0; i < arrayWords.length; i++) {
			String [] tempArray = arrayWords [i].split(" ");		
			for (int j = 0; j < tempArray.length; j++) {
				listWords.add(tempArray[j].trim());
			}
		}

		//println (arrayWords [i]);

	} //SETUP

	public void draw () {
		for (int i = 0; i < listWords.size (); i++) {
			
				if (listWords.get(i).equals("family")) {
					//something
					
				} else if (listWords.get(i).equals("big")) {
					
				} else if (listWords.get(i).equals("medium")) {
					
				} else if (listWords.get(i).equals("small")) {
					
				} else if (listWords.get(i).equals("window")) {
					
				} else if (listWords.get(i).equals("windmill")) {
					
				}
				
				
				
				
		} //FOR
		
		
		
		for (String element : listWords) {
			if (element.equals("family")) {	
				println("familia");
			}

		







			}//draw

		} //ESCENA
	}

