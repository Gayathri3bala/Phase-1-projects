package StringArrayMapRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
public static void main(String[] args) {
		
		String regex="^(?=.*[A-Z]).{8}";
		String in="678Aa435";

		Pattern pattern=Pattern.compile(regex);
		
		Matcher match=pattern.matcher(in);
		
		if(match.matches()) {
			System.out.println("Valid");
			
		}
		else {
			System.out.println("Not valid");
		}
		
	}

}
