package Demo1;
import java.util.Scanner;
public class PalindromeReview {
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
String str = "Radar";
String reverseStr = "";
    
    int strLength = str.length();
    System.out.println(strLength);
    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome.");
    }
    else {
      System.out.println(str + " is not a Palindrome.");
    }
}
}
