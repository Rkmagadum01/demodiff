package JavaNetworking;

import java.net.*;

public class InetAddressExample1 {

	public static void main(String[] args) throws UnknownHostException{

		
		// To get and print InetAddress of the Local Host
		InetAddress address = InetAddress.getLocalHost();

		System.out.println("InetAddress of the Local Host : "+address);

		// To get and print host name of the Local Host
		String hostName=address.getHostName();

		System.out.println("\nHost name of the Local Host : "+hostName);
		
		String hostName2=address.getHostAddress();
		System.out.println(hostName2);
		
		String hostName3=address.getCanonicalHostName();
		System.out.println(hostName3);

		InetAddress hostName4=address.getLoopbackAddress();
		System.out.println(hostName4);
		System.out.println();
	    // To get and print ALL InetAddress of Named Host
        InetAddress arr[] = InetAddress.getAllByName(
                            "www.geeksforgeeks.org");
 
        System.out.println("\nInet Address of ALL named hosts :");
 
        for (int i = 0; i < arr.length; i++) {
 
            System.out.println(arr[i]);
        }
        
     

	}

}
