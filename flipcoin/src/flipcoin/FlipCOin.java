package flipcoin;

public class FlipCOin {
	static void percentageCoin() {
		int numberOfTime = 10;
		double valueOfDecision;
		double percentHead;
		double percentTail;

		int headCounter = 0;
		int tailsCounter = 0;
		for (int i = 0; i <= numberOfTime; i++) {
			valueOfDecision = Math.random();
			System.out.println(valueOfDecision);
			if (valueOfDecision < 0.5) {
				headCounter++;
				System.out.println("Head");
			} 
			else {
				tailsCounter++;
				System.out.println("Tail");
			}
		}
		percentHead=(headCounter/numberOfTime)*100;
		percentTail=(tailsCounter/numberOfTime)*100;
		System.out.println("Head Percent : " +percentHead+ "%");
		System.out.println("Tail Percent : " +percentTail+ "%");
		
	}
	public static void main(String[] args) {
			percentageCoin();
	}
}
