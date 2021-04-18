package Inheritance_Override;


class SuperClass{ // This is a super class
	
	private int property1; // a property
	
	void method1() {System.out.println("SuperClass");} // a method
	
	public int getProperty1() {return property1;} // getter
	
	public void setProperty1(int property1) {this.property1 = property1;} //setter
	
}



public class BasicInformation extends SuperClass {//"Extends" means that this class is a member of the SuperClass

	
	//We can modify the method for this class by overriding
	@Override
	void method1() {
	
		super.method1(); // this means run the superclass method as it is
		
		System.out.println("an addition from overriding part"); 
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		BasicInformation object1 = new BasicInformation();
		
		object1.method1();//First SuperClass' method runs then the subclass' one
		System.out.println(object1.getProperty1());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
