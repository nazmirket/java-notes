package Methods;

public class ArbitraryNumOfArguments {
	
	//If the number of arguments is not certain we can make it changeable
	
	
     public int summation(int... parameters) { //GenericType... nameOfArguments
	    
		int sumOfNums=0;
	    for(Integer s : parameters) {
	    	
	    	sumOfNums=sumOfNums+s;
	    }
	    
	    return sumOfNums;
	}//We can use this function with different number of arguments
	
     
     

	 public static void main(String[] args) {
		
		
		
		System.out.println(new ArbitraryNumOfArguments().summation(1,2,3,4,5,6));
		
		//we add 6 argument if we make it for example "1,2,3,4,5,6,7" the sumOfNums would be 28
		
		
		
		

	}


}
