package GenericMethods;

import java.util.List;

public class GenericMethods{
	
	
  // GENERIC METHOD DECLARATION 1
	
	public <T> void print(T[] arr) {
	
		for(T item : arr) {System.out.println(item);}
		
	}
	
	
  // GENERIC METHOD DECLARATION 2	
	
	public <T extends Number> double square(T num){
		
		return num.doubleValue()*num.doubleValue();
		
	}
	
	
  // GENERIC METHOD DECLARATION 3
	
	public double sum(List<? extends Number> list){
		
		double result = 0;
		
		for(Number num : list) {result+=num.doubleValue();}
		
		return result;
		
	}
	
	
	
	
	

	
	
	
	
	}