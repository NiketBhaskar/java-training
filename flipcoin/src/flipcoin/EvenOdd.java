package flipcoin;
import java.util.Scanner;
public class EvenOdd {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	    System.out.println("Enter an Integer number:");
	    int num = scanner.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
	}

