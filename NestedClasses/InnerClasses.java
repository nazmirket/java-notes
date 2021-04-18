package NestedClasses;

	//TEXT TUTORIAL = < Nested Classes > (select and press ctrl+shift+r)

/*
 
  - A nested class is a member of its enclosing class. 
  - Non-static nested classes (inner classes) have access to other members of the enclosing class,
	even if they are declared private. 

*/
//OUTER CLASS
class InnerClasses {
	
	
	//INNER CLASS
	class InnerClass{
		
		void print(){System.out.println("this method comes from InnerClass");}
	}
	
	
	
	public static void main(String[] args) {
		
		// CREATING OBJECT FROM AN INNER CLASS
		
		InnerClasses.InnerClass object = new InnerClasses().new InnerClass();
		//OuterClass.InnerClass innerObject = new OuterClass.new InnerClass();
		
		object.print();
	}
	
	
	
	
	
}
	
	
