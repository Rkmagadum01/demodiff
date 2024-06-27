package javaioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileinputstream {
	
public static void main(String[] args) {
try {
	FileInputStream fileip=new 	FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
	

	
	//it will give the count or number of the charecter or data in file.......
	System.out.println(fileip.available());
	
	//it will give the only first charecter in ASCII number format....
	System.out.println(fileip.read());
	
	// it will give the first charecter in ASCII number then it will convert into Char....
	int r=fileip.read();
	System.out.println((char)r);
	
	//it will skip first 3 charecter in file before read those file.....
	fileip.skip(3);
	//it will read the file 
	int i=0;
	while((i=fileip.read())!=-1)
	{
		System.out.print((char)i);
	}
	
	
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}

}
