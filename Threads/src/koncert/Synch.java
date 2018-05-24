package koncert;

public class Synch {
	
	private int promena;
	
	
	
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
			System.out.println(ime+": "+tekst);
			try {
				wait(delay);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
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
			
				System.out.println(ime+": "+tekst);
				try {
					wait(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				promena=3;
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
			
				System.out.println(ime+": "+tekst);
				
				try {
					wait(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				promena=1;
				
				notifyAll();
		}
		
	}
		
		

