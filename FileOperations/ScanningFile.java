package FileOperations;

import java.io.*;
import java.util.Scanner;

public class ScanningFile {

	

	public static void main(String[] args) throws FileNotFoundException {
		
		
	Scanner scan=null;
	
	
	try {	
		
	 scan = new Scanner(new BufferedReader(new FileReader("file.txt")));//Declaration
	 
	 while(scan.hasNext()) { 
		 
		 System.out.println(scan.nextLine());  } // keep printing when there is a word in scanner
	 } 
	
	
	finally {if(scan != null) { scan.close(); } } // close it at the end
	

	
	}
	

}
