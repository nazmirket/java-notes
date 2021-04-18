package Loops;

public class ForEachLoop {
	
	
	public static void main(String[] args) {
		
		
		
		//This is a special loop. Thanks to this loop we can exert the code for each item of the group, array etc.
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};// we have a array of numbers
		
		
		for(Integer s : arr) {
			
			System.out.println("square of "+s+" = "+(s*s));
			
		}
		
		
		/*
		  Syntax should be like this;
		  
		  for(TypeOfItems  reference : groupName  ){
		  
		  Statements;
		  
		  
		  }
		  
	   
	   -reference might be a letter to refer the items of the group
	   -groupName might be an array, array list, collection etc.
		 
		
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
