package Keywords;
/*
 
 - This keyword is used to assign the value that never be changed for example the pi number in math
 - If a method is final, it cannot be overridden in the subclass

*/
public class FinalKeyword {
	
	final static double PI=3.1415926535;//this number is constant
	
	
	final void method1() {
		
	}

}


class Subclass extends FinalKeyword{
	
	/*

	@Override
	void method1() {
		
		super.method1();
	}
	
	*/// We get an error here
	
	
	
}