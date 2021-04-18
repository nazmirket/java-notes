package Keywords;


public class ThisAndSuper{

	String a = "SuperClass' item";
	
	void print() { System.out.println(this.a);	}
	
	
	public static void main(String[] args) {
		
		new AnotherClass().print();
		
	}
	
	
}





class AnotherClass extends ThisAndSuper{
	
	void print() {
		
		super.print();
		
		System.out.println(this.a);}
	
	
	String a = "Subclass' item";
	
	
}
