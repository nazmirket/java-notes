package Streams;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreams {

	public static void main(String[] args) throws IOException {//throws IOException when the file is not accessible
		
		
		
        FileInputStream in = null; // the data coming from the text
        FileOutputStream out = null; // the data that we will put it in another file

        try {
            in = new FileInputStream("file.txt"); // this is a document that already created in project folder
            
            out = new FileOutputStream("copyOfFile.txt"); // this will be created when the program runs
            
            int c; // this refers the text's all characters as integer references
            
            //For example 83 refers the 'S' character (ASCII)
            
            
            

            while ((c = in.read()) != -1) { // we take the data as ASCII codes by "in.read()" method
            	System.out.println(c);
                out.write(c);// we write the text in other file by using ASCII codes that we got
            }
            
            
        } 
        
        finally {
        	
            if (in != null) {
            	in.close(); // this readers must be closed at the end 
            }
            
            
            if (out != null) {
                out.close();// 
            }
        }
        
        
        
        
        
    }

}
