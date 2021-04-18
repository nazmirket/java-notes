package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsOfMatcherClass {
	
	static Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z]\\d\\d\\d\\d\\d\\d\\d");
	static Matcher matcher = pattern.matcher("ta1434567");
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println(matcher.find());
		
	// INDEX METHODS
		
		//Index methods provide useful index values that show precisely where the match was found in the input string:

	    	matcher.start(); // Returns the start index of the previous match.
	    	matcher.start(1);  // Returns the start index of the given group. (second group)
	    	matcher.end(); // Returns the offset after the last character matched.
	    	matcher.end(0); // Returns the offset after the last character of the given group. (first group)
	    	
	    	
	    	
	 // STUDY METHODS
	    	
	    	// Some methods that gives a boolean value about the comparing
	    	
	    		matcher.lookingAt(); // returns true if input contains any little strings that the pattern is mapped
	    		matcher.matches(); // returns true if the input is exactly same as the pattern
	    		matcher.find(); // returns true if there is a next one
	    		matcher.find(4); // resets the operation and starts scanning file by starting at index 4.
	    		
	    		
	  // REPLACEMENT METHODS
	    		
	    	 // Some methods that gives the manipulated version of the input
	    		
	    		String newText = matcher.replaceAll("replacement word"); // it manupilates every found with the given word
	    		String newText2 = matcher.replaceFirst("replacement word"); // it does same thing with above one but just for the first one
	    		
	    		
	
	}

}
