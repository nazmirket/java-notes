package Streams;

import java.io.*;

public class CharacterStreams {

	public static void main(String[] args) throws IOException {
		
		/*
		    unless the ByteStreams The FileReader and FileWriter can works with only files 
		 */

		
		FileReader in = null; // the input from the file
        FileWriter out = null; // output

        try {
        	
            in = new FileReader("file.txt"); // open the file
            out = new FileWriter("copyOfFile.txt");

            int c; //this is almost same as the integer c in the ByteStream class
           
            
            
            while ((c = in.read()) != -1) { // read the file and convert them into ASCII codes
            	
                out.write(c); // Write the file again with ASCII codes
            }
        } 
        
        finally {
            if (in != null) {
                in.close(); //these must be closed 
            }
            if (out != null) {
                out.close();//
            }
        }

	}

}
