package Demo1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String firstName = scanner.next();
		System.out.println(firstName);
		//telling compiler about pattern
	//	Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		//matching input with pattern
	//	Matcher m = p.matcher(firstName);
		
		//boolean isMatch = m.matches();
	//	System.out.println(isMatch);
		System.out.println(firstName +":"+ Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName));
	}
}
