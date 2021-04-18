package Scanner;
import java.util.Scanner;

public class BasicInformation {
	

	public static void main(String[] args) {
		
	 // EXAMPLE 1  - Scanning Keyboard Input
		
		System.out.println("EXAMPLE 1 \nWhat is your name");
        
		Scanner input = new Scanner(System.in);//Determine a new scanner with a name
		
		char answer;
       
		if (input.hasNext()) { // check if the user write his name
			
			String name = input.next(); // to assign the value to a variable
			
			answer = name.charAt(0); // get the first letter of the variable
			
			System.out.println("first letter of your name is "+answer); // print the answer
		}
		
		else System.out.println(":(");
		
		input.close();//the scanner should be closed at the end
		
		
		
		
		// EXAMPLE 2 - Different delimiter from whitespace
		
		System.out.println("\nEXAMPLE 2");
		
		String s = "a,b,c,d,e,f,g,h,j,k,l,m,n";
		
		Scanner x = new Scanner(s);
		
		x.useDelimiter(","); // we can change the delimiter with this statement
		
		while(x.hasNext()) {
			
			System.out.println(x.next());
			
		}

		x.close();
        
        
        }
	
	
    }



