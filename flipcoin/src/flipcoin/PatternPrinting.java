package flipcoin;

import java.util.Scanner;

public class PatternPrinting {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		starpattern();
		
	}

	static void starpattern() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int n=3;
		int x = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<2*n; j++) {
				if (j == x || j==2*n-x) {
					System.out.print("*");		
				}
				else {
			System.out.print(" ");
			
				}
		}
			System.out.println();
			x++;
		
		
	}

}
}
