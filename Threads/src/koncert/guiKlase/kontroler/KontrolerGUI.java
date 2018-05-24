package koncert.guiKlase.kontroler;

import java.awt.EventQueue;

import koncert.Nastup;
import koncert.guiKlase.GlavniProzor;

public class KontrolerGUI {
	
	private GlavniProzor gp;
	public static  Nastup np= new Nastup();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzor frame = new GlavniProzor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	
	
	

}
