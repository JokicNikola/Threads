package koncert;

public class Pevac extends Thread {
	
	private String ime;
	private String tekst;
	private int redniBroj;
	private Synch synch;
	private boolean start;
	
	
	
	public Pevac(String ime, String tekst, int redniBroj, Synch synch, boolean start) {
		super();
		this.ime = ime;
		this.tekst = tekst;
		this.redniBroj = redniBroj;
		this.synch = synch;
		this.start = start;
	}
	
	

	public Synch getSynch() {
		return synch;
	}



	public void setSynch(Synch synch) {
		this.synch = synch;
	}



	public boolean isStart() {
		return start;
	}



	public void setStart(boolean start) {
		this.start = start;
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
	
	private synchronized void pevaj() {
		while(start) {
		if(this.redniBroj==1) {
			synch.prviPeva(ime, tekst);
		}else {
			if(this.redniBroj==2) 
				synch.drugiPeva(ime, tekst);
			else 
				synch.treciPeva(ime, tekst);
		}
		
	}
	
		
	}
	
	public void run() {
        pevaj();
    }
	
	
	

}
