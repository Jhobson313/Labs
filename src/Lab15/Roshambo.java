package Lab15;
import java.lang.Throwable;


public enum Roshambo {
	 
	ROCK(0),PAPER(1),SCISSORS(2);
	
	private int rank;
	
	private Roshambo(int rank){
		this.rank = rank;
	}
	
	public GameOutcome compareAgainst(Roshambo opponent){
		int diff = this.rank - opponent.rank;
		if(diff < 0) {
			diff += 3;
		}
		switch(diff){
		case 0:
			return GameOutcome.TIE;
		case 1:
			return GameOutcome.WIN;
		case 2:
			return GameOutcome.LOSS;
		default:
			throw new RuntimeException("TRY AGAIN.");
		}
	}
}
