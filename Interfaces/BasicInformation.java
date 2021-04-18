package Interfaces;



  // CREATING AN INTERFACE   

  interface FirstInterface{
	
	void method1();// normal methods in an interface are both public and abstract
	
	default int getNumber() { return 0;} // Default method may have a body
	
	static void method3() { } // Static methods also may have a body
	
}


   // USING AN INTERFACE

  public class BasicInformation implements FirstInterface {

	  public static void main(String[] args) {
		
		  new BasicInformation().method1(); // we used the method by using BasicInformation class constructor
		
	}
	
	  
  // OVERRIDING METHODS
 
	@Override
	public void method1() {
		
		System.out.print("We added a body to abstract method here");
		
	}
	 
	 
	
}
