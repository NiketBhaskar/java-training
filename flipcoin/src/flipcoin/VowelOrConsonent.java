package flipcoin;

import java.util.Scanner;

public class VowelOrConsonent {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	    System.out.println("Enter an alphabet:");
	    String alphabet = scanner.next();
	    switch(alphabet) {
	    case "a":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "A":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "e":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "E":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "i":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "I":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "o":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "O":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "u":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    case "U":
	    	System.out.println(alphabet+" is a vowel");
	    	break;
	    default:
	    	System.out.println(alphabet+" is a consonent");
		    break;	
	    }
	  }
}
