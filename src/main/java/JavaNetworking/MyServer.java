package JavaNetworking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(5678);
			//after accept() method excuting , it will wait for client server to start on same port number
			// when clientserver startes on same port number --then it will contiune ecxcuting next part....
			Socket s=server.accept();
			
			//s.getInputStream() -- it will read input from scoket(i.e through client some msgs we are passing that msg it will read ....
			DataInputStream input=new DataInputStream(s.getInputStream());
			
			String value=input.readUTF();
			
						System.out.println("Message" +value);
			server.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
