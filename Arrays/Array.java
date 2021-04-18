package Arrays;
public class Array {

	public static void main(String[] args) {
		
	//DECLARATION
		
		int[] arrayname = new int[4]; // this is an array with 4 objects
		
		arrayname[1] = 5; // we changed the second object of the array as 5
		
	
		
	// COPYING ARRAYS
		
		int[] array1= {1,2,3,4,5,6}; // this is first one
		
		int[] array2= new int[5]; // second one
		
		
		System.arraycopy(array1, 0, array2, 0, 5); // "array1,initial,array2,initial,length"
		
		for(int a : array2) { System.out.println(a);} // the array2 printed as a copy of the first one
	
		
		
		
	// CUTING ARRAYS
		
		char[] arr1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n', 'a', 't', 'e', 'd'};
	            
	        char[] arr2 = java.util.Arrays.copyOfRange(arr1, 2, 9);
	        
	        System.out.println(new String(arr2)); // caffein is printed
	        
	        
	        
	 //2D ARRAYS
	        
	        int[][] twoDimensionalArray = new int [3] [2]; // this is how to create a new 2D array
			
	        twoDimensionalArray[0][0] = 3;// this is how to add a new object to the array
		        
	            
	    }

}
		
		
		
		
	
		
		
		

