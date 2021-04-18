package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyword {
	
	//If we don't know what to do with some kind of exceptions we can throw them with "Throw" keyword
	
		
	

	public static void main(String[] args) throws IOException { // here we stated that if the error occurs throw it
		
		
		File file = new File("document.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
	
		reader.readLine(); // this will throw an IOException
		
		reader.close();//It should be closed at the end
        
		
	}

}
