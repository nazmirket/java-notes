package Arrays;

public class MethodsOfArraysClass {

	public static void main(String[] args) {
		
		
	   int[] array1 = {1,2,3,4,5,6,7,8,9};
		
	   int[] array2 = {2,4,6,8,10,12,14,16,18};
	   
	   
	   
	   //BINARY SEARCH
		
	   java.util.Arrays.binarySearch(array1, 4); // at which index in array1, there is a item that has a value of "4"
	   
		
	   //COMPARE THE ARRAYS
	   
	   java.util.Arrays.equals(array1, array2); // compare the arrays if they keep same object or not
	   
	   java.util.Arrays.copyOf(array1, 3); // returns an array that has same element with the original between 0-3
	   
	   java.util.Arrays.copyOfRange(array1,3,5); // returns an array that has the elements of the original between index=3 and index=5
	   
	   java.util.Arrays.fill(array1, 5); // sets all items of the array1 as 5
	   
	   java.util.Arrays.toString(array1); // returns all items of the array1
		

		
	}

}
