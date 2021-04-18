package package1;

public class AccessModifiers {
	
	// TEXT TUTORIAL = < Access Modifiers Table > (select and press ctrl+shift+r)
	
	
	public static int num1; // Every one can access
	
	protected static int num2; // Accesible for its own package and subclasses in other packages
	
	static int num3; // Accesible for only its own package
	
	private static int num4;// this is accessible from only its own class

	
	
	
	//The getters and setters are used to make this private object accessible to others
	
	public static int getNum4() {return num4;}

	public static void setNum4(int num4) {AccessModifiers.num4 = num4;}
	

}



// ACCESING FROM ANOTHER CLASS IN SAME PACKAGE


   class AnotherClass{
	
	
	   void print() {
		
		
		   AccessModifiers.num1=10; // public
		
		   AccessModifiers.num2=11;  // protected
		
		   AccessModifiers.num3=8;  // default
		
	//	   AccessModifiers.num4=9; // private ; we get an error
		   
	}
}