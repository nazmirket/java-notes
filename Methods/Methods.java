package Methods;


public class Methods {
	
	// The methods are named like this commonly;
	
	void getAge() {}
	
	void printFile() {}//an action in lower case and an adjective 
	
	
	
	// 1*
	static void passMethod(int x) {
		
		x=10;
	}//
	
	
	
	// 2*
	
	static int square(int x){
		
		return x*x;
	}//
	
	
    
	public static void main(String[] args) {
		
	//NOTES;
	 	
	 
		//1* When a primitive type argument is used in a method after the method done it keeps first value
	    
		int a=2;
		
		passMethod(a);
		
		System.out.println(a);//a will be printed as 2
		
		
		// 2* If a method is not in void type there must be a return statement in it.
		
		square(2); // there will be an integer in the output
		
		

	}

}
