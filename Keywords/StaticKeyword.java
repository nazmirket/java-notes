package Keywords;

public class StaticKeyword {
	
	//The static field makes the object usable for all class
	//If a variable is static, it can be used directly without creating an object from this class
	//Otherwise you need to create a new object to use it
	
	int a=10;
	
	static int b=21;

	public static void main(String[] args) {
		
		
		System.out.println(new StaticKeyword().a); // invoked by using an object
		
		System.out.println(b); // invoked directly
		
	    
	    
	    // EXAMPLE - MOVIES (created below)
	    
	    Movies first = new Movies("Matrix",1998);
	    Movies second = new Movies("Birdman",2014);
	    Movies third = new Movies("12 Angry Men",1957);
	    
	    System.out.println(first.getId());
	    System.out.println(second.getId());
	    System.out.println(third.getId());
	    System.out.println(Movies.getNumberOfMovies()); //the Static methods are invoked like this "ClassName.methodName();"
	}

}


class Movies{
	
	//Here an example what is this static word for
    
    //Suppose you created a class "Movies" and you want to know how many object created from this class
    
    //You can create a static variable numberOfMovies,
	
	
	//PROPERTIES
	
	private String name;
	private int year;
	private int id;//this is a special number for every object
	private static int numberOfMovies=0;//this number is general and every object can change it
	
	
	//CONSTRUCTOR
	
	Movies(String name, int year){
		
		this.setName(name);
		this.setYear(year);
		this.id=++numberOfMovies;//every time an object created this id increases by 1
	}
	
   // GETTERS - SETTERS
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getYear() {return year;}

	public void setYear(int year) {this.year = year;}

	public int getId() {return id;}

	public void setId(int id) {this.id = id;}
	
	
	
	// A STATIC METHOD EXAMPLE
	public static int getNumberOfMovies() {
		
		return numberOfMovies;
		
	}
	
	
	
}


