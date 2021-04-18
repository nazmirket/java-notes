package package2;

import package1.AccessModifiers;

// ACCESING FROM ANOTHER PACKAGE

public class AccesModifiers2 extends AccessModifiers {
	
	
void print() {
		
		AccessModifiers.num1=10; // public
		
		AccessModifiers.num2=11;  // protected     // there is no problem because this class extends the first class
		
	//	AccessModifiers.num3=8;  // default    // we get an error
		
	//	AccessModifiers.num4=9; // private ; we get an error
		
		
		
		AccessModifiers.getNum4(); // getter for private property
		
		AccessModifiers.setNum4(3);  // setter for private property
	}
	
	

}
