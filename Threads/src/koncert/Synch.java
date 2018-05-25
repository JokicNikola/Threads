package koncert;

import java.io.FileInputStream;

import javazoom.jl.player.Player;
import koncert.guiKlase.GlavniProzor;

public class Synch {
	
	private int promena;
	private int refren=0;
	private Player player;
	
	
	
	


	public int getPromena() {
		return promena;
	}


	public void setPromena(int promena) {
		this.promena = promena;
	}


	public void stop() {
		player.close();
	}

	
	public Synch(int promena) {
		
		this.promena = promena;
	}

	public synchronized void prviPeva(String ime, String tekst) {
		
		while(promena!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
			GlavniProzor.textArea.setText(ime+": "+tekst);
			try {
				FileInputStream s = new FileInputStream("Music/PattiSmith.mp3");
				player= new Player(s);
				player.play();
				
				
				
			}catch(Exception e) {
				System.out.println("greska");
			}
			
			promena=2;
			notifyAll();
			}
		
		public synchronized void drugiPeva(String ime, String tekst) {
			
			while(promena!=2) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			GlavniProzor.textArea.setText(ime+": "+tekst);
			try {
				FileInputStream s = new FileInputStream("Music/Together.mp3");
				player= new Player(s);
				player.play();
				
				
			}catch(Exception e) {
				System.out.println("greska");
			}
				
				refren++;
				if(refren==1)
					promena=3;
				else {
					refren=0;
					promena=1;
				}
				notifyAll();
		}
		
		public synchronized void treciPeva(String ime, String tekst) {
			
			while(promena!=3) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			GlavniProzor.textArea.setText(ime+": "+tekst);
			try {
				
				FileInputStream s = new FileInputStream("Music/bruceSpringsteen.mp3");
				player= new Player(s);
				player.play();
				
			}catch(Exception e) {
				System.out.println("greska");
			}
				
				
			
				promena=2;
				
			
				
				notifyAll();
		}
		
	}
		
		

