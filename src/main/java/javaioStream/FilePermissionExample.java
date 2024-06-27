package javaioStream;

import java.io.File;

public class FilePermissionExample {
	public static void main(String[] args) {
		File filename=new File("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt");
		if(filename.exists())
		{
			
//			System.out.println(filename.canExecute());//by default true
//			System.out.println(filename.canRead());//by default true
//			System.out.println(filename.canWrite());//by default true
			
			//we can set the permission also
		filename.setExecutable(true);
		filename.setWritable(false);
		filename.setReadable(true);
			System.out.println(filename.canExecute());
			System.out.println(filename.canRead());
			System.out.println(filename.canWrite());
		}else {
			System.out.println("File Not Found");
		}
	}

}
