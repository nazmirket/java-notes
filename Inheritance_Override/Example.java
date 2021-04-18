package Inheritance_Override;

//SUPER CLASS
class Vehicles {
	
	
	private String company;//*Basic properties for all subclasses
	private String model;//*
	private int year;//*
	
	//a method to print the informations
	public void showInfos(){System.out.println("Brand: "+company+ "\nModel: "+model+"\nYear: "+year);}


    //Getters and Setters
	
	public String getCompany() {return company;}

	public void setCompany(String company) {this.company = company;}

	public String getModel() {return model;}

	public void setModel(String model) {this.model = model;}

	public int getYear() {return year;}

	public void setYear(int year) {	this.year = year;}


}


//SUBCLASS 1

class automobiles extends Vehicles{
	
	private double engine;//*Specific properties of this subclass
	private int km;//*


	@Override
	//changing the method partly for this class
	
	public void showInfos() {
	super.showInfos();
	System.out.println("Engine: "+engine+"\nKm: "+km );}
	
	
    //Getters and Setters
	
	public double getEngine() {return engine;}
	public void setEngine(double engine) {this.engine = engine;}
	public int getKm() {return km;}
	public void setKm(int km) {this.km = km;}

}


//SUBCLASS 2

class bicycles extends Vehicles{
	
	private double wheelSize;//*Specific properties for this class
	private String type;//*
	
	
	@Override
	//Changing the method partly for this class
	public void showInfos() {
		super.showInfos();
		System.out.println("Wheel Size: "+wheelSize+"\nType: "+type);
	}
	

    //Getters and Setters
	
	public double getWheelSize() {return wheelSize;}
    public void setWheelSize(double wheelSize) {this.wheelSize = wheelSize;}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	
}



//MAIN CLASS
public class Example {
	
	
	//MAIN METHOD
	
	public static void main(String[] args) {
		
		
		//create a new object from automobiles
		Vehicles corolla = new automobiles();
		
		//set the properties
		corolla.setCompany("Toyota");
		((automobiles)corolla).setEngine(1.6);
		((automobiles)corolla).setKm(1500);
		corolla.setModel("Corolla");
		corolla.setYear(2018);
		
		
		//create a new object from bicycles
		Vehicles phantomx = new bicycles();
		
		//set the properties
		phantomx.setCompany("ProdecoTech");
		phantomx.setModel("Phantom X");
		((bicycles)phantomx).setType("Electric Bike");
		((bicycles)phantomx).setWheelSize(26);
		phantomx.setYear(2018);
		
		
		//printing the informations
		
		corolla.showInfos();
		
		System.out.println("");//a blank line
		
		phantomx.showInfos();
		
		
	}

}
