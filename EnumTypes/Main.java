package EnumTypes;


// Enum types are limited variables, they can change but they must be one of the remarked variables

// Here the difference is that the objects in a list cannot have a method or property


public class Main {
	
	static String name;
	
	public static void main(String[] args) {
		
		
		for (Planets p : Planets.values()) {
	           
		       System.out.printf("your weight on %s is %f\n", p, p.surfaceWeight(60));
		
		}
	}
	

}
