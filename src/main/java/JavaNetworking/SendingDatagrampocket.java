package JavaNetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendingDatagrampocket {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			
			String str="Ramakrishna";
			
			InetAddress address=InetAddress.getByName("localhost");
			
			DatagramPacket dp=new DatagramPacket(str.getBytes(), str.length(),address , 3000);
			ds.send(dp);
			ds.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
