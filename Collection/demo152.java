// PROPERTIES : STORE DATA IN FORM OF KEY-VALUE PAIR ; PARENT CLASS HASHTABLE ; 
// EXTENTION IS .PROPERTIES OF FILES WHICH HAS STORED IN PROPERTIES OBJECT
// HASHING FUNCTION IN STRING :

import java.util.*;
import java.io.*;

class PropDemo{
	public static void main(String[]args) throws IOException{
	
		Properties p = new Properties();

		FileInputStream fis = new FileInputStream("carNumber.properties");
		
		p.load(fis);

		System.out.println(p);

		p.setProperty("Akshay","6598"); 			 // INTEGER CONVERT INTO STRING
		FileOutputStream fos = new FileOutputStream("carNumber.properties");
		p.store(fos,"Updated By Shashi");     			 // UPDATE KONI KELA ---> File madhe dista he
		
		System.out.println(p);
	}
}
