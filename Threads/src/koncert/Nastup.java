package koncert;

public class Nastup {
	
	Synch synch = new Synch(1);
	private boolean start=true;
	private Pevac pattiSmith;
	private Pevac together;
	private Pevac bruceSpringsteen;
	//Tekst pesme 
	private String drugiDeo="Because the night belongs to lovers\r\n" + "Because the night belongs to lust\r\n" + "Because the night belongs to lovers\r\n" + "Because the night belongs to us";
	private String prviDeo = "Take me now, baby, here as I am\r\n" + "Pull me close, try and understand\r\n" + "Desire is hunger is the fire I breathe\r\n" + "Love is a banquet on which we feed\r\n"+ "Come on now try and understand\r\n" + "The way I feel when I'm in your hands\r\n" + "Take my hand come undercover\r\n" + "They can't hurt you now\r\n" + "Can't hurt you now, can't hurt you now";
	private String treciDeo= "Have I doubt when I'm alone\r\n" + "Love is a ring, the telephone\r\n" + "Love is an angel disguised as lust\r\n" + "Here in our bed until the morning comes\r\n"+ "Come on now try and understand\r\n" + "The way I feel under your command\r\n" + "Take my hand as the sun descends\r\n" + "They can't touch you now\r\n" + "Can't touch you now, can't touch you now";
	
	
	
	public void startNastup() {
		
		pattiSmith=new Pevac("PattiSmith", prviDeo, 1, synch, start);
		together=new Pevac("Together", drugiDeo, 2, synch, start);
		bruceSpringsteen=new Pevac("BruceSpringsteen", treciDeo, 3, synch, start);
		
		pattiSmith.start();
		together.start();
		bruceSpringsteen.start();
		
		
		}
	
	public void iskljuci() {
		
		//pattiSmith.setStart(false);
		//together.setStart(false);
		//bruceSpringsteen.setStart(false);
		//synch.stop();
		
		pattiSmith.stop();
		together.stop();;
		bruceSpringsteen.stop();
		synch.setPromena(1);
		
			
	}
	
public void startPrvi() {
		
		pattiSmith=new Pevac("PattiSmith", prviDeo, 1, synch, start);
		together=new Pevac("Together", drugiDeo, 2, synch, start);
		bruceSpringsteen=new Pevac("BruceSpringsteen", treciDeo, 3, synch, start);
		
		synch.setPromena(1);
		pattiSmith.start();
		
}

public void startDrugi() {
	
	
	pattiSmith=new Pevac("PattiSmith", prviDeo, 1, synch, start);
	together=new Pevac("Together", drugiDeo, 2, synch, start);
	bruceSpringsteen=new Pevac("BruceSpringsteen", treciDeo, 3, synch, start);
	
	synch.setPromena(2);
	together.start();
	
}

public void startTreci() {
	
	
	pattiSmith=new Pevac("PattiSmith", prviDeo, 1, synch, start);
	together=new Pevac("Together", drugiDeo, 2, synch, start);
	bruceSpringsteen=new Pevac("BruceSpringsteen", treciDeo, 3, synch, start);
	
	synch.setPromena(3);
	bruceSpringsteen.start();
	
}

}
	
	
	
	
	
	


