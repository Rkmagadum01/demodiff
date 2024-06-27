package javaioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip_folder_example {
	static List  filelist;
	
	 private static final String OUTPUT_ZIP_FILE = "C:\\Users\\ramakrishnamagadum.k\\Desktop\\javasample.zip";
	    private static final String SOURCE_FOLDER = "C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio";
	public static void main(String[] args) {
		  filelist=new ArrayList();
		Zip_folder_example zf=new Zip_folder_example();
		zf.generatefilelist(new File(SOURCE_FOLDER));
		zf.zip(new File(OUTPUT_ZIP_FILE));
		
	}
	
	

	private void zip(File file) {
		FileOutputStream fos;
		byte[] buffer =new byte[1024];
		try {
			fos = new FileOutputStream(file);
			ZipOutputStream zos=new ZipOutputStream(fos);
			
			for(Object filename : filelist)
			{
				ZipEntry ze=new ZipEntry(filename.toString());
				zos.putNextEntry(ze);
				System.out.println("#####" +filename.toString());
				
				FileInputStream fis=new FileInputStream(SOURCE_FOLDER+ File.separator + filename);
				int num=0;
				while((num=fis.read())!=-1)
				{
					zos.write((char)num);
				}
				fis.close();
				
			}
			zos.closeEntry();
			zos.close();
			System.out.println("Done");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



	public static void generatefilelist(File node) {
		
		if(node.isFile())
		{
			System.out.println("  ----  "+node.getAbsolutePath().toString());
			filelist.add(generatezipentry(node.getAbsoluteFile().toString()));
		}
		
		if(node.isDirectory())
		{
			String[] files = node.list();
			
			
			for(String file: files)
			{
				System.out.println(node+"-- "+ file);
				generatefilelist(new File(node, file));
			}
		}
		
		
	}

	private static Object generatezipentry(String file) {
		// TODO Auto-generated method stub
		System.out.println(SOURCE_FOLDER.length());
		System.out.println(SOURCE_FOLDER);
		System.out.println(file.substring(SOURCE_FOLDER.length()+1, file.length()));
		return file.substring(SOURCE_FOLDER.length()+1, file.length());
	}

}
