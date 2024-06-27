package JavaNetworking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class calculator_server {

	public static void main(String[] args) {
          try {
			ServerSocket ss=new ServerSocket(9999);
			Socket s=ss.accept();
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			
			
			
			while(true)
			{
				
				String val=dis.readUTF();
				if(val.equals("stop"))
					break;
				
				System.out.println("equation recived");
				
			StringTokenizer st=new StringTokenizer(val);
			
			int opr1=Integer.parseInt(st.nextToken());
			String operation=st.nextToken();
			int opr2=Integer.parseInt(st.nextToken());
			int result=0;
			if(operation.equals("+")) {
				result=opr1+opr2;
			}else if(operation.equals("-")) {
				result=opr1-opr2;
			}else if(operation.equals("/")) {
				result=opr1/opr2;
			}else if(operation.equals("*")) {
				result=opr1*opr2;
			}else {
				System.out.println("operation is in-valide");
			}
			System.out.println("sending the result");
			dos.writeUTF(Integer.toString(result));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          
	}
}
