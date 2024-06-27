package JavaNetworking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class calculator_client {
public static void main(String[] args) {
	try {
		Socket s=new Socket("localhost", 9999);
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		while(true)
		{
			System.out.println("provide values for calculation \n Example: 3 + 5");
			Scanner sc=new Scanner(System.in);
			
			String value=sc.nextLine();
			
			if(value.equals("stop"))
			{
				break;
			}
			
			dos.writeUTF(value);
			  String ans = dis.readUTF();
              System.out.println("Answer = " + ans);
			
			
			
		}
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
