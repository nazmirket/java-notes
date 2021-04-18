package NestedClasses;

public class Shadowing {
	
	/*This concept means that if we create a new variable in outer class 
	and in inner class and in a method the scope of the variable is different for some situations
	That's shadowing. Following examples are to explain which variable we determined*/ 
	
	
	//OUTER PROPERTY
	 String text="This is the OuterClass' variable";
	 

	    class Innerclass {

	    	//INNER CLASS' PROPERTY
	        String text= "This is the Innerclass' variable";
	        

	        
	        void innerClassMethod() {
	        	
	        	//METHOD'S PROPERTY
	        	String text = "This is the method's variable";
	        			
	        			
	        	//PRINTING ALL
	        			
	            System.out.println("text  =  " + text); // points method's variable
	            
	            System.out.println("this.text   =   " + this.text); // points inner class' variable
	            
	            System.out.println("Shadowing.this.text   =   " + Shadowing.this.text); // points outer class' variable
	            
	        }
	    }
	    

	    public static void main(String... args) {

	    	//Let's see which is which
	    	
	    	new Shadowing().new Innerclass().innerClassMethod();
	    	
	    	
	    	
	    	
	    }

}
