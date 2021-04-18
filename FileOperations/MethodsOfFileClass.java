package FileOperations;

import java.io.File;

public class MethodsOfFileClass {
	
	
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		File file= new File("C:\\Users\\10bag\\OneDrive");
		
		
	  //LOGICAL INFORMATIONS
		boolean a = file.canWrite(); // can program write the file?
		boolean b = file.exists(); // does the file exist?
		boolean c = file.canRead(); // can the program read the file?
		boolean d = file.isFile(); // is this a file?
		boolean e = file.isDirectory(); // is this a folder?
        boolean f = file.isAbsolute(); // is the path given as same as the called path?
        
        
        
	  //STRING INFORMATIONS
		String str1 = file.getPath(); // get the path of the file
		String str2 = file.getName(); // get the name of the file
		String str3 = file.getParent(); // get the parent folder's name
		
		
		
	  //NUMERIC INFORMATIONS
		long num1 = file.length(); // the size of the file
		long num2 = file.lastModified(); // the date that the file changed last on
		
		
		
		
	  //LIST OF INGREDIENTS
		String[] arr= file.list(); // the list of the documents or folders in the file
		
		for(String s:arr) {
			
			System.out.println("-"+s+"\n");
			
		}
		
		
		  

	}

}
