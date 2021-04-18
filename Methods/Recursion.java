package Methods;

public class Recursion {
	
	// TEXT TUTORIAL = < Recursion Tutorial > (select and press ctrl+shift+r)
	
	
	// EXAMPLE 1 - FACTORIAL
	
	public static long factorial(long n) {
		
         if (n <= 0) return 1;
         
        else  return n * factorial(n-1);
    }   //
	
	
	
	// EXAMPLE 2 - GREATEST COMMON DIVISOR
	
    public static int gcd(int p, int q) {
    	
        if (q == 0) return p;
        
        else return gcd(q, p % q);
    }
	
	
	
    // EXAMPLE 3 - FIBONACCI
	
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    } // This function gives the  nth number of the Fibonacci array
    
    
    
    
    
    
    
    
}
