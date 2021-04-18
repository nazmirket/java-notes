package AbstractClasses;


//CREATING AN ABSTRACT CLASS

abstract class abstractClass1{
	
	// A METHOD WITH BODY
   void print() {System.out.println("This is printed in the abstract class");}

    // AN ABSTRACT METHOD
    abstract int production(int a, int b);
    
}


//USING THE ABSTRACT CLASS

public class AbstractClasses extends abstractClass1 {
	
	@Override
	int production(int a, int b) {return a*b;} // abstract method gets a body here
	
	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		new AbstractClasses().print(); // even if this method is not in this class, we can invoke it
		
		new AbstractClasses().production(5, 7); // returns 5*7 = 35 
		
		
		
	}
	
	
	

}





