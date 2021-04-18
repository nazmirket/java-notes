package Encapsulation;


class class1 {
	
	//PRIVATE PROPERTIES
	private String property1;
	private int property2;
	
    //GETTERS
	public String getProperty1() {return property1;}
	public int getProperty2() {return property2;}

	
    //SETTERS
	
	public void setProperty1(String property1) {
		
		if(property1.contains("a") || property1.contains("A")) { // this string can take such values that contains letter 'A'
		this.property1 = property1;
			
		}
		
	}

	
	public void setProperty2(int property2) {
		
		if(property2 % 2 == 1 ) { //this integer can take odd values
		this.property2 = property2;
		
		}
	}
	
}



//MAIN CLASS
public class Encapsulation {

	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		 class1 object1 = new class1();
		 
		  object1.setProperty1("Ahoy!"); // this is suitable now property1 is "Ahoy!"
		 
		  object1.setProperty2(3); // this is also suitable change operation is succesfull
		 
		 
		 
		 System.out.println(object1.getProperty1());
		 
		 System.out.println(object1.getProperty2());
		
		

	}

}




