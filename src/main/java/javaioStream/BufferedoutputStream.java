package javaioStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedoutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt",true);
	     BufferedOutputStream bout=new BufferedOutputStream(fout);  
	     String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();  
	     bout.write(b);    
	     bout.flush();    
	      
	     
	     
//	     BufferedOutputStream bout=new BufferedOutputStream(fout,5);  
//	     String s="Welcome to javaTpoint.";    
//	     byte b[]=s.getBytes();  
//	     bout.write(b);    
//	     bout.flush();
	     System.out.println("success");  
	     
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
