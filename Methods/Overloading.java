package Methods;

public class Overloading {
	
	//Now we will create one function with different variables
	
	public static int newfunction(int a, int b, int c){
		
		return a+b+c;
		
	}// this returns an integer value
	
	public static double newfunction(double a, double b) {
		
		return a*b;
	}//this returns a double value
	
	

	public static void main(String[] args) {
		
		/*
		  
		If we use three integer, function result would be as "a+b+c".
		If we use two double variables, function returns "a*b". This is overloading
		it provides to use same function in different ways with different values
		
		*/
		
		int first = newfunction(5,4,5); //"a+b+c
		
		double second = newfunction(2.1,3.4); // a*b
		
		System.out.println("first number: "+ first );
		System.out.println("second number: "+ second );
		

	}

}
