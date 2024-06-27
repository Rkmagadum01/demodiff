package javaioStream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BytearrayOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fileop=new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt",true);
			FileOutputStream fileop2=new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio2.txt",true);
			ByteArrayOutputStream  byteop=new ByteArrayOutputStream();
			String str="welcome to java class";
			byteop.write(str.getBytes());
			byteop.writeTo(fileop);
			byteop.writeTo(fileop2);
			byteop.flush();
			
			System.out.println("success");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
