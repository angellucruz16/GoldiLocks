//GOLDILOCKS - ANGÉLICA LUCÍA CRUZ

package vista;
//import java.lang.reflect.Array;
//import java.util.ArrayList;

import processing.core.PApplet;
import modelo.Escena;
import processing.core.PImage;
public class MainMenu extends PApplet {	

	// MENU IMAGES
	PImage MENU;
	PImage STORY;
	PImage INTRO;
	PImage INTRO1;
	PImage INTRO2;
	PImage GAME;

	// GAME IMAGES

	//WINDOW
	PImage BASE;
	PImage WINDOW;

	//BACKGROUND PARALLAX	
	PImage PARALLAX1;
	PImage DEER;


	// SOUPS
	PImage EMPTYSOUP;
	PImage S_PHOTOS;
	PImage S_SOUP1;
	PImage S_SOUP2;
	PImage S_SOUP3;


	// SOUP CHATS
	PImage SOUP1CHAT;
	PImage SOUP1CHAT2;
	PImage SOUP2CHAT;
	PImage SOUP3CHAT;
	PImage SOUP3CHAT2;

	// GOLDILOCKS
	PImage GOLDILOCKS;
	PImage GOLDILOCKS2;
	PImage GOLDILOCKS3;
	PImage WINDMILL;
	
	//FAMILY BEAR
	PImage SELECTEDFAMILY;
	PImage FAMILYCHAT;
	
	
	//VARIABLES
	int state;
	boolean big;
	boolean medium;
	boolean small;
	int segundos;
	boolean soupchat1;
	boolean soupchat2;
	boolean soupchat3;
	boolean soupchat4;
	int clickcounter;
	int clickcounter2;
	int clickcounter3;
	int clickcounter4;

	boolean spinwindmill;
	float angle = 0;
	
	Escena palabra;
	
	//WINDOW
	
	boolean stillwindow;
	boolean overboard;
	int newX;
	int newY;
	

	public static void main(String[] args) {

		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN


	public void settings () {
		size (1328,830);
		state = 6 ;                                   //NO OLVIDAR CAMBIAR EL STATE 

	} // SETTINGS

	public void setup () {


		//LOAD IMAGES 

		//MENU
		MENU = loadImage ("images/MENU.png");
		STORY = loadImage ("images/STORY.png");
		INTRO = loadImage ("images/INTRO.png");
		INTRO1 = loadImage ("images/INTRO1.png");
		INTRO2 = loadImage ("images/INTRO2.png");

		//GAME
		BASE = loadImage ("images/BASE.png");
		GAME = loadImage ("images/GAME.png");

		//WINDOW
		
		WINDOW = loadImage ("images/WINDOW.png");

		//BACKGROUND
		DEER   = loadImage ("images/DEER.png");
		PARALLAX1  = loadImage ("images/PARALLAX1.png");

		//SOUPS
		EMPTYSOUP  = loadImage ("images/EMPTYSOUP.png");
		S_PHOTOS  = loadImage ("images/S-PHOTOS.png");
		S_SOUP1  = loadImage ("images/S-SOUP1.png");
		S_SOUP2  = loadImage ("images/S-SOUP2.png");
		S_SOUP3  = loadImage ("images/S-SOUP3.png");

		// SOUP CHATS
		SOUP1CHAT = loadImage ("images/SOUP1CHAT.png");
		SOUP1CHAT2 = loadImage ("images/SOUP1CHAT2.png");
		SOUP2CHAT = loadImage ("images/SOUP2CHAT.png");
		SOUP3CHAT = loadImage ("images/SOUP3CHAT.png");
		SOUP3CHAT2 = loadImage ("images/SOUP3CHAT2.png");

		//GOLDILOCKS
		WINDMILL  = loadImage ("images/WINDMILL.png");	
		GOLDILOCKS = loadImage ("images/GOLDILOCKS.png");
		GOLDILOCKS2 = loadImage ("images/GOLDILOCKS2.png");
		GOLDILOCKS3 = loadImage ("images/GOLDILOCKS3.png");
		
		//BEAR FAMILY
		FAMILYCHAT = loadImage ("images/FAMILYCHAT.png");
		SELECTEDFAMILY = loadImage ("images/SELECTEDFAMILY.png");
		
		// INITIALIZE
		big = false;
		medium = false;
		small = false;
		segundos =0;
		clickcounter= 0; //BIG SOUP
		clickcounter2 = 0; //SMALL SOUP
		clickcounter3 = 0; //WINDMILL 
		clickcounter4 = 0; //FAMILY

		spinwindmill = false;
		
		
		
		//WINDOW
		overboard = false;
		stillwindow = true;
				
	} //SETUP

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
			//

			image (GOLDILOCKS, 0,0);

			

			hover(); // MOSTRAR SELECCIONES

			renderChats(); //MOSTRAR DIALOGOS

			renderGoldilocks ();
			renderEmptySoup ();
			spinWindmill();

			pushMatrix();
			popMatrix();
			
			//WINDOW
			
			mouseMoved ();
			mouseReleased ();
			
			break;
		} // SWITCH


	} // DRAW

	public void mousePressed () {

		println (mouseX, mouseY);

		switch (state) {

		case 1:
			if (mouseX > 824 && mouseX < 824 + 322
					&& mouseY > 553 && mouseY < 553 + 60) // CONTINUE
				state = 2;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60) //EXIT
				exit();
			break;

		case 2:

			if (mouseX > 868 && mouseX < 868 + 322
					&& mouseY > 693 && mouseY < 693 + 60) //CONTINUE
				state = 3;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60) // BACK
				state = 1;
			break;

		case 3:
			if (mouseX > 834 && mouseX < 834 + 322
					&& mouseY > 477 && mouseY < 477 + 60) //CONTINUE
				state = 4;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60) // BACK
				state = 2;
			break;

		case 4:
			if (mouseX > 777 && mouseX < 777 + 322
					&& mouseY > 692 && mouseY < 692 + 60) //CONTINUE
				state = 5;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60) // BACK
				state = 3;
			break;

		case 5:
			
			if (mouseX > 777 && mouseX < 777 + 322
					&& mouseY > 692 && mouseY < 692 + 60) //CONTINUE
				state = 6;
			if (mouseX > 47 && mouseX < 47 + 97
					&& mouseY > 47 && mouseY < 47 + 60) //BACK
				state = 4;
			break;

		case 6:


			if (mouseX > 47 && mouseX < 47 + 97    			//EXIT
					&& mouseY > 47 && mouseY < 47 + 60) {
				exit ();
			} 




			//CLICKCOUNTERS

			if ( mouseX > 388 && mouseX < 388 + 123 
					&& mouseY > 506 && mouseY < 506 + 98) { //CLICK COUNTER SOPA 1
				clickcounter ++;
			} //counter 1 

			if ( mouseX > 717 && mouseX < 717 + 78		
					&& mouseY > 552 && mouseY < 552 + 51) { //CLICK COUNTER SOPA 2
				clickcounter2 ++;
			} //counter 2

			if (mouseX > 487 && mouseX < 487 + 56  	//CLICK EN MOLINO COUNTER
					&& mouseY > 340 && mouseY < 340 + 46) {
				clickcounter3 ++;
			} //counter 3
			
			if (mouseX > 321 && mouseX < 321 + 296
					&& mouseY > 245 && mouseY < 245 + 83 ) { //CLICK EN FAMILIA
				clickcounter4 ++ ;
			} //counter 4

			// CLICKSOUPS
			if (big == false && clickcounter == 1 && mouseX > 388 && mouseX < 388 + 123 //CLICK EN SOPA 1
					&& mouseY > 506 && mouseY < 506 + 98) {
				big = true;
				soupchat1 =true;
			}

			if (big == true && clickcounter == 2 && mouseX > 388 && mouseX < 388 + 123 //CLICK EN SOPA 1
					&& mouseY > 506 && mouseY < 506 + 98) {
				big = true;
				soupchat2 =true;
				palabra.setup("big");
			}


			if 	(mouseX > 569 && mouseX < 569 + 118 	//CLICK EN SOPA 2
					&& mouseY > 534 && mouseY < 534 + 81 && clickcounter ==2) {
				medium = true;
			}


			if (mouseX > 717 && mouseX < 717 + 78		//CLICK EN SOPA 3
					&& mouseY > 552 && mouseY < 552 + 51 && clickcounter2 ==1) {
				small = true;
			}	

			if (mouseX > 717 && mouseX < 717 + 78		//CLICK EN SOPA 3
					&& mouseY > 552 && mouseY < 552 + 51 && clickcounter2 ==2) {
				small = true;
			}	

			//CLICK EN MOLINO
			
			if (mouseX > 487 && mouseX < 487 + 56  	//CLICK EN MOLINO
					&& mouseY > 340 && mouseY < 340 + 46 && clickcounter3 %2 == 1 ) {

				spinwindmill = true;
				println ("true");

			}
			if (mouseX > 487 && mouseX < 487 + 56  	//CLICK EN MOLINO
					&& mouseY > 340 && mouseY < 340 + 46 && clickcounter3 %2 == 0) {
				spinwindmill = false;
				println ("false");			
			}
			
			if (mouseX > 730 && mouseX < 730 + 131  	//CLICK WINDOW
					&& mouseY > 306 && mouseY < 306 + 111) {
				
				stillwindow = false;
				mouseMoved ();
			}
			
			
			
			
			break;
			
		} //SWITCH



	} //MOUSEPRESSED

	public void hover () {

		if (big==false && medium == false && small == false  //PRIMERA SOPA SELECTION
				&& mouseX > 388 && mouseX < 388 + 123
				&& mouseY > 506 && mouseY < 506 + 98) {
			image (S_SOUP1, 0,0);
		}	

		if (big==true && medium == false && small == false && clickcounter ==  1 //PRIMERA SOPA SELECTION
				&& mouseX > 388 && mouseX < 388 + 123
				&& mouseY > 506 && mouseY < 506 + 98) {
			image (S_SOUP1, 0,0);
		}	


		if (big==true && medium == false && small == false && clickcounter ==2  //SEGUNDA SOPA SELECTION
				&& mouseX > 567 && mouseX < 569 + 118
				&& mouseY > 527 && mouseY < 534 + 82 ) {
			image (S_SOUP2,0,0);
		}	

		if (big==true && medium == true && small == false 
				&& mouseX > 717 && mouseX < 717 + 78		//TERCERA SOPA SELECTION
				&& mouseY > 552 && mouseY < 552 + 51)  {
			image (S_SOUP3,0,0);
		} 

		if (big==true && medium == true && small == true && clickcounter2 == 1
				&& mouseX > 717 && mouseX < 717 + 78		//TERCERA SOPA SELECTION
				&& mouseY > 552 && mouseY < 552 + 51)  {
			image (S_SOUP3,0,0);
		} 
		
		if ( big == true && medium == true && small == true
				&& mouseX > 321 && mouseX < 321 + 296
				&& mouseY > 245 && mouseY < 245 + 83 && clickcounter4 == 0) { //SELECTED FAMILY
			
			image (SELECTEDFAMILY,0,0);
			
		}
	} //HOVER


	public void renderChats () {


		PImage currentChat= null ;

		if (soupchat1 == true && big == true && medium == false && small == false ) { //CHAT1 SOPA 1
			currentChat = SOUP1CHAT;

		}

		if (soupchat2 == true && big == true && medium == false && small == false) { //CHAT2 SOPA 1
			currentChat = SOUP1CHAT2;

			//	soupchat2 = true;
		}

		if (soupchat3 == false && big == true && medium == true && small == false) { //CHAT SOPA 2
			currentChat = SOUP2CHAT; 
		}

		if (soupchat4 == false && big == true && medium == true && small == true && clickcounter2 ==1) { //CHAT SOPA 3
			currentChat = SOUP3CHAT; 
		}

		if (soupchat4 == false && big == true && medium == true && small == false && clickcounter2 ==2) { //CHAT SOPA 3
			currentChat = SOUP3CHAT2; 
		}
		
		if (clickcounter4 == 1 && big == true && medium == true && small == true ) { //CHAT SOPA 3
			currentChat = FAMILYCHAT; 
		}
		
		if (currentChat != null) {		

			image (currentChat,0,0); //SOPA1 CHAT
			
		}

	} //RENDERCHATS

	public void renderGoldilocks () {

		PImage currentGoldilocks= null ;

		if (big == true && medium == false && small == false && clickcounter ==2) { //GOLDILOCK SOPA 1
			currentGoldilocks = GOLDILOCKS2;
		}

		if (soupchat3 == false && big == true && medium == true && small == false) { //CHAT SOPA 2
			currentGoldilocks = GOLDILOCKS2; 
		}

		if (soupchat4 == false && big == true && medium == true && small == true && clickcounter2 ==2) { //CHAT SOPA 3
			currentGoldilocks = GOLDILOCKS3; 
		}

		if (currentGoldilocks != null) {		
			image (currentGoldilocks,0,0); //GOLDILOCK
		}

	}//RENDERGOLDILOCK

	public void renderEmptySoup () {

		if (soupchat4 == false && big == true && medium == true && small == true && clickcounter2 ==2) { //CHAT SOPA 3
			image (EMPTYSOUP,0,0); 
		}
	}//RENDER EMPTY SOUP

	public void spinWindmill () {


		if (spinwindmill == true) {

			pushMatrix();

			translate(516,356);
			rotate(angle += (PI/180)*10);
			rotate(radians(300));
			imageMode (CENTER);
			image (WINDMILL, 0,0);

			popMatrix();

			imageMode (CORNER);
		}
		
		if (spinwindmill == false) {

			pushMatrix();
			
			
			translate(516,356);
			imageMode (CENTER);
			image (WINDMILL, 0,0);

			popMatrix();

			imageMode (CORNER);


		}
	} //SPIN WINDMILL

//WINDOW
 
 public void mouseMoved () {
	 
	 if (stillwindow == false) {
		 
		 newX = mouseX ;
		 
		 image (WINDOW, newX,newY);
		 
	 }
		 
		 
 }// MOUSEMOVED WINDOW
	
	public void mouseReleased () {
		
		stillwindow = true;
		
		
	} //MOUSE RELEASED WINDOW
} //MAINMENU