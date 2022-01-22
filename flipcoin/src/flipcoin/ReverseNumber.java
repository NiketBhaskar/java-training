package flipcoin;
import java.util.Scanner;
public class ReverseNumber {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter number"); 
	int num = scanner.nextInt();
int reversed = 0;

	    for(int i=num ;i != 0; i /= 10) {
	      int digit = i % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);
}

}
