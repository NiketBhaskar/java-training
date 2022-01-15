package flipcoin;
import java.util.Scanner;
public class Distance {
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter x");
	int x= scanner.nextInt();
	System.out.println("Enter y");
	int y= scanner.nextInt();
	Double temp = (Math.pow(x, 2) + Math.pow(y, 2));
	Double result = Math.sqrt(temp);
	System.out.println(result);
	
}

}
