package Exceptions;

public class FinallyKeyword {
	
	//Finally keyword provides to compile the codes that we want them to run anyway

	public static void main(String[] args) {
	
		String str = "this is a random string";
		
		try{
			
			System.out.println(str.charAt(23));// length is 22 so there is no character in 23
			
			
		}
		
		catch(StringIndexOutOfBoundsException a){
			
			System.out.println(a.toString());// prints the error
			
		}
		
		finally {
			
			System.out.println("This runs anyway");// it runs even if the compiler gets an error
			
		}

	}

}
