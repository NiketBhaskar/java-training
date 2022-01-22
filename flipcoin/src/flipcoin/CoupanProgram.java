package flipcoin;

import java.util.Scanner;
import java.util.UUID;
public class CoupanProgram {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("5 Coupans");
	int num = 5;
	UUID[] coupanArray = new UUID[num];
	for(int i=0; i<num; i++) {
	UUID randomCoupan = UUID.randomUUID();
	System.out.println(randomCoupan);
	coupanArray[i] = randomCoupan;
}
}
}
