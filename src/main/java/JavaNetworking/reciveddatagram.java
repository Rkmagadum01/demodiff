package JavaNetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class reciveddatagram {
	
	public static void main(String[] args) {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(3000);
			byte[] buf = new byte[1024];  
		    DatagramPacket dp = new DatagramPacket(buf, 1024);  
		    ds.receive(dp);  
		    String str = new String(dp.getData(), 0, dp.getLength());  
		    System.out.println(str);  
		    ds.close();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
