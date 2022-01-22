package flipcoin;
import java.util.Scanner;
public class PerfectNumber {
	static Scanner scanner= new Scanner(System.in);
public static void main(String[] args) {
	int i;
	int Sum = 0 ;
	System.out.println("Please Enter any Number: ");
	int number = scanner.nextInt();

	for(i = 1 ; i < number ; i++) {
		if(number % i == 0)  {
			Sum = Sum + i;
		}
	}
	if (Sum == number) {
		System.out.format("%d is a Perfect Number", number);
	}
	else {
		System.out.format("%d is NOT a Perfect Number", number);
	}
}
}
