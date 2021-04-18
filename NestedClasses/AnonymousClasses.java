package NestedClasses;
// A kind of Inner Classes, these are the nameless classes and used for creating only one object

public class AnonymousClasses {
	
	//THE METHOD
	interface sayHello{ void greetingsomeone(String someone);} // it keeps a method
	
	
	// USUAL INNER CLASS
    class english implements sayHello{
			

			@Override
			public void greetingsomeone(String someone) { System.out.println("Hello "+ someone);	}
			
    }
	 
		
	// ANONYMOUS CLASS
	 sayHello spanish= new sayHello() {
		
			
			@Override
			public void greetingsomeone(String someone) {System.out.println("Hola "+ someone);	}
	 
	 };	
	 
	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		//We can create an object from an usual inner class simply
		AnonymousClasses.english english = new AnonymousClasses().new english();
		
		english.greetingsomeone("John");
		
		
		
		
		//This method is useable for only one object
		new AnonymousClasses().spanish.greetingsomeone("Domingo");
		

	}
		
	
	

}
	 
