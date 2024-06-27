package javaioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class sequenceinputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fileip=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
			FileInputStream fileip2=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio2.txt");
			
			FileInputStream fileip3=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
			FileInputStream fileip32=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio2.txt");
			FileInputStream fileip33=new FileInputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio3.txt");
			
			
			//to read two files at same time
			SequenceInputStream sip=new SequenceInputStream(fileip, fileip2);
			int i;
			while((i=sip.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
			
			//to read three files or we can read multiple files also  at the same time
			Vector  v1=new Vector();
			v1.add(fileip3);
			v1.add(fileip32);
			v1.add(fileip33);
		
			Enumeration e1=v1.elements();
			SequenceInputStream sip3=new SequenceInputStream(e1);
			int j;
			while((j=sip3.read())!=-1)
			{
				System.out.print((char)j);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
