package Exceptions;


public class TryCatch {
	
	
	
	public static void main(String[] args) {
		
	
		int[] array1 = {1,2,3,4,5}; // there are 5 element in it
		
		
		
		try {
			
			System.out.println(array1[5]);//there is no sixth element
		}
		
		catch(ArrayIndexOutOfBoundsException a){// When the exception occurs it prints the error message
			
			
	             a.printStackTrace(); // it prints the error message to the console
	             System.out.println(a.getMessage()); // it prints the exception's locale directly
		
    
		
	}
	
	
	}
	


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
