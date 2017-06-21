package mechanics;

import javax.swing.ImageIcon;

public class GameEngine {

	private static ImageIcon foto;
	
	public static void setImage(ImageIcon nova){
		foto = nova;		
	}
	
	public static char getQuadrant(){
		return ' ';
	}
	
	public static ImageIcon getImage(){
		return foto;
	}
	
}
