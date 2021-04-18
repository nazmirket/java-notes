package NestedClasses;

public class StaticNestedClasses {
	
	
	/*
	 
	  - Static nested classes do not have access to other members of the enclosing class.
	  - A static nested class is associated with its outer class


     */
	
	static class StaticNestedClass{
		
		void method1() {
			
			System.out.print("this method comes from StaticNestedClass");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//Creating a new object from a static nested class
		
		StaticNestedClasses.StaticNestedClass  object = new StaticNestedClasses.StaticNestedClass();
		//OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
		
		object.method1();
		
		
	}
	
}
