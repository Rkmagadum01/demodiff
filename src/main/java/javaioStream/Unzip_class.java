package javaioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip_class {

	 private static final String SOURCE_FOLDER = "C:\\Users\\ramakrishnamagadum.k\\Desktop\\javasample.zip";
	    private static final String OUTPUT_ZIP_FILE = "C:\\Users\\ramakrishnamagadum.k\\Desktop\\sampleunzip";
		private static ArrayList filelist;
	    
	public static void main(String[] args) {
		
		Unzip_class object=new Unzip_class();
		object.unzip(SOURCE_FOLDER,OUTPUT_ZIP_FILE);
		
	}

	private void unzip(String sourceFolder, String outputZipFile) {
         
		File file=new File(outputZipFile);
		if(!file.exists())
		{
			file.mkdir();
		}
		
		try {
			ZipInputStream zis=new ZipInputStream(new FileInputStream(sourceFolder));
			ZipEntry ze=zis.getNextEntry();
			
			 while(ze!=null) {
				 String name=ze.getName();
 
				 File fs=new File(outputZipFile + File.separator+name);
				 if(ze.isDirectory()) {
				 new File(fs.getParentFile(), name).mkdir();
				 }
				 else {
					 new File(fs.getParentFile(), name).createNewFile();
				 }
				 
				 FileOutputStream fos=new FileOutputStream(fs);
				 int len;
				 while((len=zis.read())!=-1)
				 {
					 fos.write((char)len);
				 }
				 fos.close();
				 ze = zis.getNextEntry();
				 
			 }
			  zis.closeEntry();
		    	zis.close();
		    	System.out.println("Done");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
