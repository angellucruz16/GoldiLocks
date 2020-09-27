
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
	
	// GAME IMAGES
	PImage BASE;
	PImage D_CLOSEDWINDOW;
	PImage D_OPENWINDOW;
	PImage S_CLOSEDWINDOW;
	PImage S_OPENWINDOW;
	PImage DEER ;
	
	PImage EMPTYSOUP;
	PImage GL1;
	PImage GL2;
	PImage GL3;
	PImage PARALLAX1;
	PImage WINDMILL;
	
	PImage S_PHOTOS;
	PImage S_SOUP1;
	PImage S_SOUP2;
	PImage S_SOUP3;
	PImage S_SOUPS;
	
	int state;

	public static void main(String[] args) {
		
		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);
	}


	public void settings () {
		size (2304/2,1440/2);
		state = 6;
	}

	public void setup () {
		
		MENU = loadImage ("images/MENU.png");
		STORY = loadImage ("images/STORY.png");
		INTRO = loadImage ("images/INTRO.png");
		INTRO1 = loadImage ("images/INTRO1.png");
		INTRO2 = loadImage ("images/INTRO2.png");
		GAME = loadImage ("images/GAME.png");
		
		//LOAD IMAGES GAME
		
		BASE = loadImage ("images/BASE.png");
		D_CLOSEDWINDOW  = loadImage ("images/D-CLOSEDWINDOW.png");
		D_OPENWINDOW  = loadImage ("images/D-OPENWINDOW.png");
		S_CLOSEDWINDOW  = loadImage ("images/S-CLOSEDWINDOW.png");
		S_OPENWINDOW  = loadImage ("images/S-OPENWINDOW.png");
		DEER   = loadImage ("images/DEER.png");
		
		EMPTYSOUP  = loadImage ("images/EMPTYSOUP.png");
		GL1  = loadImage ("images/GL1.png");
		GL2  = loadImage ("images/GL2.png");
		GL3  = loadImage ("images/GL3.png");
		PARALLAX1  = loadImage ("images/PARALLAX1.png");
		WINDMILL  = loadImage ("images/WINDMILL.png");
		
		S_PHOTOS  = loadImage ("images/S-PHOTOS.png");
		S_SOUP1  = loadImage ("images/S-SOUP1.png");
		S_SOUP2  = loadImage ("images/S-SOUP2.png");
		S_SOUP3  = loadImage ("images/S-SOUP2.png");
		S_SOUPS  = loadImage ("images/S-SOUPS.png");
		
	}

	public void draw () {
		
		switch (state) {
		
		case 1: 
		image (MENU, 0,0, 2304/2,1440/2);
		break;
		
		case 2:
			image (STORY, 0,0, 2304/2,1440/2);
			break;
			
			
		case 3:	
			image (INTRO, 0,0, 2304/2,1440/2);
		break;
		
		case 4:
			image (INTRO1, 0,0, 2304/2,1440/2);
			break;
			
		case 5:
			image (INTRO2, 0,0, 2304/2,1440/2);
			break;
		
		case 6:
			
			 
			  float fgX=map(mouseX,0,width,0,-200);
			  image(PARALLAX1,fgX+300,0,2304/2,1440/2);
			  
			  float bgX=map(mouseX,0,width,0,-100);
			  image(DEER,bgX+250,0,2304/2,1440/2);
			  
			  image (BASE,0,0,2304/2,1440/2);
			  
			  image (D_OPENWINDOW,0,0,2304/2,1440/2);
			  
			break;
		}
		

	}
	
	public void mousePressed () {
		println (mouseX, mouseY);
		switch (state) {
		
		case 1:
			if (mouseX > 714 && mouseX < 714 + 557
				&& mouseY > 481 && mouseY < 481 + 106)
				state = 2;
			if (mouseX > 40 && mouseX < 40 + 171
					&& mouseY > 41 && mouseY < 41 + 106)
				exit();
			break;
		
		case 2:
		
		if (mouseX > 752 && mouseX < 752 + 557
				&& mouseY > 601 && mouseY < 601 + 106)
				state = 3;
		if (mouseX > 40 && mouseX < 40 + 171
				&& mouseY > 41 && mouseY < 41 + 106)
			state = 1;
		 break;
		 
		case 3:
			if (mouseX > 723 && mouseX < 723 + 557
					&& mouseY > 414 && mouseY < 414 + 106)
					state = 4;
			if (mouseX > 40 && mouseX < 40 + 171
					&& mouseY > 41 && mouseY < 41 + 106)
				state = 2;
			break;
			
		case 4:
			if (mouseX > 674 && mouseX < 674 + 557
					&& mouseY > 601 && mouseY < 601 + 106)
					state = 5;
			if (mouseX > 40 && mouseX < 40 + 171
					&& mouseY > 41 && mouseY < 41 + 106)
				state = 3;
			break;
			
		case 5:
			if (mouseX > 674 && mouseX < 674 + 557
					&& mouseY > 601 && mouseY < 601 + 106)
					state = 6;
			if (mouseX > 40 && mouseX < 40 + 171
					&& mouseY > 41 && mouseY < 41 + 106)
				state = 4;
			break;
			
		case 6:
			
		}
		
		
	}
}