package Constructors;
/*
  Constructors are used to assign basic properties which belong to that class
  All the objects in that group is constructed by this method
  If you make a new object from a class, there should be a constructor method, 
  if not, java use a random constructor without parameters 

*/

public class Books {
	
	//PROPERTIES
	private String name; // a book must have a name
	private int numOfPage; // 
	private static int numOfBooks; // This is general for all object. This belongs to class not objects


	
	
	//CONSTRUCTOR WITHOUT PARAMETERS
	public Books() {
		name="name information is required";
		numOfPage= 0;
		setNumOfBooks(getNumOfBooks() + 1);//When a new object added the number is changed by 1
	}
	
	
	
    //CONSTRUCTOR WITH PARAMETERS
	public Books(String name, int numOfPage, String genre, String author) {
		this.name=name;
		this.numOfPage=numOfPage;
		setNumOfBooks(getNumOfBooks() + 1);
		}
	
	
	
	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		Books object = new Books();
		
		object.setName("book name");
		object.setNumOfPage(500);
		
		
		System.out.println(getNumOfBooks());//we added one and the numOfBooks = 1 
		
		
	}
	
	
	
	
	
	//GETTERS - SETTERS
	
	public String getName() { return name;}

	public void setName(String name) {this.name = name;}

	public int getNumOfPage() { return numOfPage; }

	public void setNumOfPage(int numOfPage) { this.numOfPage = numOfPage;}
	
	public static int getNumOfBooks() {return numOfBooks; }

	public static void setNumOfBooks(int numOfBooks) {Books.numOfBooks = numOfBooks;}



	

}
