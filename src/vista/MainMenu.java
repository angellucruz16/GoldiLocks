
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
	PImage GOLDILOCKS;

	// GAME IMAGES
	PImage BASE;
	PImage D_CLOSEDWINDOW;
	PImage D_OPENWINDOW;
	PImage S_CLOSEDWINDOW;
	PImage S_OPENWINDOW;
	PImage DEER ;

	PImage EMPTYSOUP;
	PImage PARALLAX1;
	PImage WINDMILL;

	PImage S_PHOTOS;
	PImage S_SOUP1;
	PImage S_SOUP2;
	PImage S_SOUP3;
	PImage WINDOW;
	PImage SOUP1CHAT;



	int state;
	boolean big;
	boolean medium;
	boolean small;
	int segundos;
	boolean soupchat1;

	public static void main(String[] args) {

		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);
	}


	public void settings () {
		size (1328,830);
		state = 6;
	}

	public void setup () {
		big = false;
		medium = false;
		small = false;
		segundos =0;

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

		PARALLAX1  = loadImage ("images/PARALLAX1.png");
		WINDMILL  = loadImage ("images/WINDMILL.png");

		S_PHOTOS  = loadImage ("images/S-PHOTOS.png");
		S_SOUP1  = loadImage ("images/S-SOUP1.png");
		S_SOUP2  = loadImage ("images/S-SOUP2.png");
		S_SOUP3  = loadImage ("images/S-SOUP2.png");


		WINDOW = loadImage ("images/WINDOW.png");
		GOLDILOCKS =loadImage ("images/GOLDILOCKS.png");
		SOUP1CHAT = loadImage ("images/SOUP1CHAT.png");

	}

	public void draw () {

		switch (state) {

		case 1: 
			image (MENU, 0,0);
			break;

		case 2:
			image (STORY, 0,0);
			break;


		case 3:	
			image (INTRO, 0,0);
			break;

		case 4:
			image (INTRO1, 0,0);
			break;

		case 5:
			image (INTRO2, 0,0);
			break;

		case 6:


			//PARALLAX EFECT
			float fgX=map(mouseX,0,width,0,-100);
			image(PARALLAX1,fgX+300,0,2304/2,1440/2);

			float bgX=map(mouseX,0,width,0,-50);
			image(DEER,bgX+250,0,2304/2,1440/2);

			image (BASE,0,0);
			image (GAME,0,0);
			image (WINDOW,0,0);
			image (GOLDILOCKS, 0,0);
			image (WINDMILL,0,0);

			hover(); //MÉTODO PARA MOSTRAR SELECCIONES
			//image (SOUP1CHAT,0,0);
			renderChats();

			break;
		}


	}

	public void mousePressed () {
		println (mouseX, mouseY);
		switch (state) {

		case 1:
			if (mouseX > 824 && mouseX < 824 + 322
					&& mouseY > 553 && mouseY < 553 + 60)
				state = 2;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60)
				exit();
			break;

		case 2:

			if (mouseX > 868 && mouseX < 868 + 322
					&& mouseY > 693 && mouseY < 693 + 60)
				state = 3;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60)
				state = 1;
			break;

		case 3:
			if (mouseX > 834 && mouseX < 834 + 322
					&& mouseY > 477 && mouseY < 477 + 60)
				state = 4;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60)
				state = 2;
			break;

		case 4:
			if (mouseX > 777 && mouseX < 777 + 322
					&& mouseY > 692 && mouseY < 692 + 60)
				state = 5;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60)
				state = 3;
			break;

		case 5:
			if (mouseX > 777 && mouseX < 777 + 322
					&& mouseY > 692 && mouseY < 692 + 60)
				state = 6;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60)
				state = 4;
			break;

		case 6:

			if (mouseX > 47 && mouseX < 47 + 97    			//SALIR DEL JUEGO
					&& mouseY > 47 && mouseY < 47 + 60) {
				exit ();
			} 

			if (big == false &&  mouseX > 388 && mouseX < 388 + 123
					&& mouseY > 506 && mouseY < 506 + 98) {


				big = true;

			}

			if 	(mouseX > 569 && mouseX < 569 + 118 //CLICK EN SOPA 2
					&& mouseY > 534 && mouseY < 534 + 81) {
				medium = true;
			}

			if (mouseX > 717 && mouseX < 717 + 78		//CLICK EN SOPA 3
					&& mouseY > 552 && mouseY < 552 + 51) {
				small = true;
			}	

			//if (mouseX > 496 && mouseX < 496 + 39  //CLICL EN MOLINO
			//	&& mouseY > 331 && mouseY < 331 + 9	)



			break;

		} //SWITCH



	} //MOUSEPRESSED

	public void hover () {

		if (big==false && medium == false && small == false //PRIMERA SOPA SELECTION
				&& mouseX > 388 && mouseX < 388 + 123
				&& mouseY > 506 && mouseY < 506 + 98) {
			image (S_SOUP1, 0,0);

		}	
		if (big==true && medium == false && small == false  //SEGUNDA SOPA SELECTION
				&& mouseX > 569 && mouseX < 569 + 118
				&& mouseY > 534 && mouseY < 534 + 81) {
			image (S_SOUP2,0,0);
		}	
		if (big==true && medium == true && small == false  //SEGUNDA SOPA SELECTION
				&& mouseX > 717 && mouseX < 717 + 78
				&& mouseY > 552 && mouseY < 552 + 51) {
			image (S_SOUP3,0,0);
		} 
	} //HOVER


	public void renderChats () {

		PImage currentChat= null ;
		println(big);
		if (big == true && medium == false && small == false) {
			currentChat = SOUP1CHAT;


		}
		if (currentChat != null) {

			image (currentChat,0,0); //SOPA1 CHAT
			noLoop ();
			delay(3000);
			loop ();

		}
	} //RENDERCHATS

} //MAINMENU