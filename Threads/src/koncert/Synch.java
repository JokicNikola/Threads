package koncert;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Synch {
	
	private int promena;
	private int refren=0;
	
	
	
	public Synch(int promena) {
		
		this.promena = promena;
	}

	public synchronized void prviPeva(String ime, String tekst, int delay) {
		
		while(promena!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
			try {
				FileInputStream s = new FileInputStream("Music/PattiSmith.mp3");
				Player player= new Player(s);
				player.play();
				
			}catch(Exception e) {
				System.out.println("greska");
			}
			/*try {
				wait(delay);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			promena=2;
			notifyAll();
			}
		
		public synchronized void drugiPeva(String ime, String tekst, int delay) {
			
			while(promena!=2) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			try {
				FileInputStream s = new FileInputStream("Music/Together.mp3");
				Player player= new Player(s);
				player.play();
				
			}catch(Exception e) {
				System.out.println("greska");
			}
				/*try {
					wait(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}*/
				refren++;
				if(refren==1)
					promena=3;
				else {
					System.out.println("Kraj");
					promena=1;
				}
				notifyAll();
		}
		
		public synchronized void treciPeva(String ime, String tekst, int delay) {
			
			while(promena!=3) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			try {
				
				FileInputStream s = new FileInputStream("Music/bruceSpringsteen.mp3");
				Player player= new Player(s);
				player.play();
				
			}catch(Exception e) {
				System.out.println("greska");
			}
				
				/*try {
					wait(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}*/
			
				promena=2;
				
			
				
				notifyAll();
		}
		
	}
		
		

