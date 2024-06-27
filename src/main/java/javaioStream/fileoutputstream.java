package javaioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream {
	public static void main(String[] args) {
		try {
			//once if write true as second parameter it will append the data and add new data along with old data.....
			FileOutputStream 	fileop =new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt",true);
			
			System.out.println(fileop.toString());
			System.out.println(fileop.getChannel());
			System.out.println(fileop.getFD());
			
			String str="Hello Good Morning";
//			byte[] b=str.getBytes();
			
			// through this we can write data in byte format.........
			fileop.write(str.getBytes());
			
			//here we can specify the how much data we need to input to file or write to the file.........
			fileop.write(str.getBytes(), 2, 5);
			fileop.flush();
			System.out.println("success");
		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}

}
