package javaioStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataoutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream 	fileop =new FileOutputStream("C:\\Users\\ramakrishnamagadum.k\\Desktop\\javaio.txt",true);
			DataOutputStream dataop=new DataOutputStream(fileop);
			
			//it will give the data size you are going to write in file ...before not wrting ant=ything size is =="0"
			System.out.println(dataop.size());
			String str="Good Morning";
			dataop.write(str.getBytes());
			
			//after writing size becomes size of data which writed.....
			System.out.println(dataop.size());
			
			//It is used to write Boolean to the output stream as a 1-byte value.
			dataop.writeBoolean(true);
			
			dataop.writeChar('L');
			dataop.flush();
			
			
			
//			void writeBoolean(boolean v): 	It is used to write Boolean to the output stream as a 1-byte value.
//			void writeChar(int v)	:       It is used to write char to the output stream as a 2-byte value.
//			void writeChars(String s)	:   It is used to write string to the output stream as a sequence of characters.
//			void writeByte(int v)	    :   It is used to write a byte to the output stream as a 1-byte value.
//			void writeBytes(String s)	:   It is used to write string to the output stream as a sequence of bytes.
//			void writeInt(int v)	    :   It is used to write an int to the output stream
//			void writeShort(int v)      :  	It is used to write a short to the output stream.
//			void writeShort(int v)	    :   It is used to write a short to the output stream.
//			void writeLong(long v)	    :   It is used to write a long to the output stream.
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
