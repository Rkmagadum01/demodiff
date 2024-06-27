package javaioStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;

public class BufferedinputStream {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fileip=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
			BufferedInputStream buffip=new BufferedInputStream(fileip);
			//it will count number of data present inside it......
			buffip.available();
			
			//it will read the file first charecter  in ASCII format.....
			System.out.println(buffip.read());
			
			//it will read the file first charecter  in ASCII format then it will convert into ASCII to Charecter.....
			int i=buffip.read();
			System.out.println((char)i);
			
			int j;
			while((j=buffip.read())!=-1)
			{
				System.out.print((char)j);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
