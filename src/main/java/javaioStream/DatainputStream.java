package javaioStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DatainputStream {
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream input1 = new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
		    DataInputStream inst1 = new DataInputStream(input1); 
			int i;
			//for one one value fetching and displaying 
			while((i=inst1.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
			
			FileInputStream input = new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
	    DataInputStream inst = new DataInputStream(input);  
	    int count = input.available();  
	    //for all value fetching at time and displaying 
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      System.out.print((char)bt);  
	    }  
	    
	    
	    
//	            int readInt()        : 	It is used to read input bytes and return an int value.
//	    		byte readByte()	     :  It is used to read and return the one input byte.
//	    		char readChar()  	 :  It is used to read two input bytes and returns a char value.
//	    		double readDouble()	 :  It is used to read eight input bytes and returns a double value.
//	    		boolean readBoolean():	It is used to read one input byte and return true if byte is non zero, false if byte is zero.
//	    		int skipBytes(int x) :	It is used to skip over x bytes of data from the input stream.
	    
	    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}

}
