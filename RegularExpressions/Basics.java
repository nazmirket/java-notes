package RegularExpressions;

import java.util.regex.*;

public class Basics {		
	

	public static void main(String[] args) {
		
		
		// CREATING A PATTERN
		
		Pattern pattern1 = Pattern.compile("pattern 1");
		
		
		
		// COMPARING PATTERN WITH THE INPUT
		
		Matcher matcher = pattern1.matcher("input 1");	
		
		matcher.find(); // returns a boolean value if they matched or not
		
		
		
		

	}

}
