package koncert;

public class Pevac extends Thread {
	
	private String ime;
	private String tekst;
	private int redniBroj;
	private int delay;
	private Synch synch;
	private boolean start=true;
	
	public Pevac(String ime, String tekst, int redniBroj, int delay, Synch synch) {
		super();
		this.ime = ime;
		this.tekst = tekst;
		this.redniBroj = redniBroj;
		this.delay = delay;
		this.synch=synch;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public int getRedniBroj() {
		return redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	private synchronized void pevaj() {
		while(start) {
		if(this.redniBroj==1) {
			synch.prviPeva(ime, tekst, delay);
		}else {
			if(this.redniBroj==2) 
				synch.drugiPeva(ime, tekst, delay);
			else 
				synch.treciPeva(ime, tekst, delay);
		}
		
		}
	
		
	}
	
	public void run() {
        pevaj();
    }
	
	
	

}
