package JavaNetworking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 5678);
			// DataInputStream input=new DataInputStream(System.in);

			// here we are writing msg and storing into socket and this will take msg and
			// share to the server
			// Example : -socket.getOutputStream() - client will write data in the socket
			// s.getInputStream():- here we pass the data to server through the socket
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());

			output.writeUTF("Hello");
			output.close();
			socket.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
