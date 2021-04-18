package Streams;
import java.io.*;

/* 
  - Buffered Streams are more efficient because they use a buffer
  - The methods of output and input invoked only when the buffer is empty or full  
  - It's like using a shovel
 
 */


public class BufferedStreams  {
	
	
	public static void main(String[] args) throws IOException {

	 BufferedReader in = null; 
     BufferedWriter out = null;

     try {
         in = new BufferedReader(new FileReader("file.txt")); // reader
         
         out = new BufferedWriter(new FileWriter("copyOfFile.txt")); // writer
         
         int c; // ASCII codes will be kept in this variable
         
         while ((c = in.read()) != -1) { // read the file
        	 
        	 
        	 out.write(c); // write the data into another file
        	 
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


