package koncert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.*;
import javazoom.jl.player.Player;

public class Music {
	
	public static void main(String[] args) {
		play();
		
	}
	
	public static void play() {
		try {
			FileInputStream s= new FileInputStream("arc1.mp3");
			Player player = new Player(s);
			player.play();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
}
