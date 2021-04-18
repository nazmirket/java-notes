package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		//DECLARATION
		ArrayList<String> groups= new ArrayList<>();
		
		//BASIC METHODS
		groups.add("Pulp Fiction"); // single addition
		groups.add("Truman Show");
		groups.add("Slumdog Millionaire");
		
		groups.addAll(groups);// mulitple addition
		
		groups.remove("Truman Show");// how to remove a single item
		groups.clear();// to remove all
		
		groups.get(0); // get a item
		groups.indexOf("Pulp Fiction"); // get index of an object
		
		groups.size();// get the size 
		
		 groups.isEmpty();// If it is empty or not
		 
		 groups.contains("");// does the list contain item that pointed out
		 
		 groups.set(4, "Birdman"); // fourth item is changed as "Birdman"
		 
		 Collections.sort(groups); // sort the list alphabetically
		
		
		// PRINTING ALL
		
		 groups.forEach(item->System.out.printf("\n"+item));//short way to get all with a Lambda expression
			
			
	
		   
		   
		  
		   
	       
		
			
		
		
	}

}
