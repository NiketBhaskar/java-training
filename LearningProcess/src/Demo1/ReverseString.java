package Demo1;

public class ReverseString {
	 public static void main (String[] args) {
	       
	        String str= "Niket";
	        String rev="";
	        char c;
	       
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        c= str.charAt(i); 
	        rev= c+rev; 
	      }
	      System.out.println("Reversed word: "+ rev);
	    }
	
}
