package RegularExpressions;

import java.util.regex.*;

public class PatternWithFlags {
		
	
	// EXAMPLE 1 : Case insensitive pattern
		Pattern pattern1 = Pattern.compile("pattern",Pattern.CASE_INSENSITIVE); // declaration 1
		Pattern pattern1b = Pattern.compile("(?i)abc"); // declaration 2 (embedded)
		
		
		
	// EXAMPLE 2 : Pattern with comments
		// Here the whitespaces are ignored when the Pattern.COMMENTS is declared
		// In addition, the comments (starts with '#' and ends with the line) are also ignored
		Pattern pattern2 = Pattern.compile("pattern",Pattern.COMMENTS); // declaration 1
		Pattern pattern2b = Pattern.compile("(?x)abc"); // declaration 2 (embedded)
		
	
		
	// EXAMPLE 3 : Literally matching the objects
		// When the pattern is declared with this field, the metacharacers or any special character for regexs
		// is specified as just a character => "[abc]d" is only matched with "[abc]d" in this case
		Pattern pattern3 = Pattern.compile("pattern",Pattern.LITERAL);	 // declaration 1
		// there is no embedded flag for this one
		
		
		
	// EXAMPLE 4 : Multiline pattern
		// When the pattern is declared with this field, the '^'  and  '$' starts to represent the begining of the input
		// and the end of the input
		Pattern pattern4 = Pattern.compile("pattern",Pattern.MULTILINE); // declaration 1
		Pattern pattern4b = Pattern.compile("(?m)abc"); // declaration 2 (embedded)
		
		
		
		
	// EXAMPLE 5 : Unix lines
		// In this mode, only the '\n' line terminator is recognized in the behavior of ., ^, and $
		Pattern pattern5 = Pattern.compile("pattern",Pattern.UNIX_LINES);
		Pattern pattern5b = Pattern.compile("(?d)abc"); // declaration 2 (embedded)
		
		
		
		

	

}
