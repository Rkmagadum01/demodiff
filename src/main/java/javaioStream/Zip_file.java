package javaioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip_file {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\things.zip");
			ZipOutputStream zos=new ZipOutputStream(fos);
			ZipEntry ze=new ZipEntry("dummyfile");
			zos.putNextEntry(ze);
			FileInputStream fis=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\things.txt");
			int num=0;
			
			while((num=fis.read())!=-1)
			{
				zos.write((char)num);
			}
			
			System.out.println("done");
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
