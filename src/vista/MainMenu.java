
package vista;

//import java.lang.reflect.Array;
//import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
public class MainMenu extends PApplet {	
	
	PImage MENU;
	PImage STORY;
	PImage INTRO;
	PImage INTRO1;
	PImage INTRO2;
	PImage GAME;
	int state;

	public static void main(String[] args) {
		
		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);
	}


	public void settings () {
		size (2304/2,1440/2);
		state = 1;
	}

	public void setup () {
		
		MENU = loadImage ("images/MENU.png");
		STORY = loadImage ("images/STORY.png");
		INTRO = loadImage ("images/INTRO.png");
		INTRO1 = loadImage ("images/INTRO1.png");
		INTRO2 = loadImage ("images/INTRO2.png");
		GAME = loadImage ("images/GAME.png");
		
		
	}

	public void draw () {
		
		switch (state) {
		
		case 1: 
		image (MENU, 0,0, 2304/2,1440/2);
		break;
		
		
		
		
		
		}
		

	}
	
	
}