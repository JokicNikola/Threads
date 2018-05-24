package koncert;

public class Nastup {
	Synch synch = new Synch(1);
	private Pevac pattiSmith=new Pevac("PattiSmith", "Because the night", 1, 1000, synch);
	private Pevac bruceSpringsteen=new Pevac("BruceSpringsteen", "Belongs to lovers", 2, 1000, synch);
	private Pevac guitar=new Pevac("Nikola jokic", "Jesam li bog?", 3, 1000, synch);
	
	
	public  void startNastup() {
		
		
		pattiSmith.start();
		bruceSpringsteen.start();
		
		guitar.start();
		
		
		
	}
		
}
	
	
	
	
	
	


