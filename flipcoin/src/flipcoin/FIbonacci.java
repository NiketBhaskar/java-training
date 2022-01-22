package flipcoin;

public class FIbonacci {
	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, i, noOfTimes = 10;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < noOfTimes; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
