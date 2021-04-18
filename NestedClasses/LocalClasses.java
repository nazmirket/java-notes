package NestedClasses;
//A kind of Inner Classes , these are created in a method and they can be used only from this method

public class LocalClasses {
	
	
	//METHOD
	void method(){
		
		
		//LOCAL CLASS
		class example{
			
			void print() {System.out.print("this method comes from example class");}
			
		} //
		
		
		
		example object1 = new example();
		
		object1.print();
	}
	
	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		new LocalClasses().method();
		
		
		
	}
		
	
	
	
	
	
		
	}
	
	
	


