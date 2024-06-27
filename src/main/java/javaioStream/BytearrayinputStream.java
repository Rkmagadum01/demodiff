package javaioStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class BytearrayinputStream {
	
	public static void main(String[] args) {
		try {
			byte[] value= {23,13,14,15,16,17,18};
			
			ByteArrayInputStream byteip=new ByteArrayInputStream(value);
			int i;
			while((i=byteip.read())!=-1)
			{
				System.out.print((char)i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
