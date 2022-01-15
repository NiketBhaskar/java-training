package flipcoin;
import java.util.Scanner;
public class Factors {
 static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
	 System.out.println("Provide input:");
	int num= scanner.nextInt();
	System.out.println("Prime Factors are : ");
	for(int i = 2; i<= num; i++) {
        while(num%i == 0) {
           System.out.println(i+" ");
           num = num/i;
        }
     }
     if(num >2) {
        System.out.println(num);
     }
	
 }
}
