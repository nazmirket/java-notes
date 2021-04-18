package Conditionals;
public class SwitchCase {

	public static void main(String[] args) {

		// To explain this concept this is a simple example program
		// We can use both number and string
		
	 
		
	// Which day is today?
		
		int numofday= 5;
		
		switch(numofday) {
		
		case 1 : System.out.println("Monday"); break; // there must be a "break" code to stop the switch-case
		case 2 : System.out.println("Tuesday"); break;
		case 3 : System.out.println("Wednesday"); break;
		case 4 : System.out.println("Thursday"); break;
		case 5 : System.out.println("Friday"); break;
		case 6 : System.out.println("Saturday"); break;
		case 7 : System.out.println("Sunday"); break;
		default: System.out.println("invalid number\n\n"); // if the number is not in the range between 1-7 "invalid number" would be printed
		}
		
		
		String src="something";
		switch(src) {
		
		case "something": System.out.println(src +" is printed");
		
		}
		
		
		
	}

}
