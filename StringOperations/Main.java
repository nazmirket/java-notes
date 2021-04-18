package StringOperations;

public class Main {

	public static void main(String[] args) {
		
		
		
	 String weWillRockYou = "Buddy you're a boy make a big noise\r\n" + 
				"Playin' in the street gonna be a big man some day\r\n" + 
				"You got mud on yo' face\r\n" + 
				"You big disgrace\r\n" + 
				"Kickin' your can all over the place\r\n" + 
				"Singin'\r\n" + 
				"We will we will rock you\r\n" + 
				"We will we will rock you"; // a string that has enough size for examples
	 
	 
	 
	 //BASIC METHODS
	 
	 weWillRockYou.length();//returns the size of the string
	 
	 weWillRockYou.charAt(3);// what is the character in 3th index
	 
	 weWillRockYou.indexOf('b');// what is the index of 'b'
	 
     weWillRockYou.toUpperCase();//Capitalizes the string
	 
	 weWillRockYou.toLowerCase();//opposite of the upper case
	 
	 weWillRockYou.substring(4,5);//returns a string in the range of first and second index parameter
	 
	 weWillRockYou.contains("Buddy"); // does this word exist in the string (true or false)
	 
	 weWillRockYou.split(" ");// returns an aray splitted by the delimiter 
	 
	 weWillRockYou.toCharArray();//returns an array including the characters of the string
	 
	
	 
	 
	 //STRING BUILDER
	 
	 // the process will be shown step by step
	 
	 StringBuilder str = new StringBuilder();
	 
	 str.append("Mercury is the smallest planet in the Solar System"); // step 1 :  "Mercury is the smallest planet in the Solar System "
	 
	 str.insert(0,"Venus and ");// step 2 : "Venus and Mercury is the smallest planet in the Solar System"
	 
	 str.delete(18,20);// step 3 : "Venus and Mercury  the smallest planet in the Solar System"
	 
	 str.insert(18, "are"); // step 4 :  "Venus and Mercury are  the smallest planet in the Solar System"
	 
	 str.insert(41, "s"); // step 5 : "Venus and Mercury are  the smallest planets in the Solar System"
		
		
	}

}
