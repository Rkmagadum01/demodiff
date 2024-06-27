package Geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class first_non_reapeating_char {
public static void main(String[] args) {
System.out.println(sumane());
}

static char sumane()
{
	String str="srraisi";
	HashMap<Character , Integer> map=new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		//map.getOrDefault(c, 0): This part retrieves the value associated with the key c from the map. If the key c is present in the map,
		//it returns the corresponding value (which represents the frequency of the character c encountered so far). 
		//If the key c is not present in the map, it returns the default value 0.
		//this method will store key as our character and value=ferequncy of that value 
		System.out.println(map.getOrDefault(ch, 0)+1);
		map.put(ch, map.getOrDefault(ch, 0)+1);
		
		
	}
	for(int j=0;j<str.length();j++)
	{
		if(map.get(str.charAt(j))==1)
		{
			return str.charAt(j);
		}
	}
	
	return 'F';
}

//static char sumane()
//{
	String str="ramakrishna";

//	ArrayList<Character> list =new ArrayList<Character>();
//	for(int i=0;i<str.length();i++)
//	{
//		list.add(str.charAt(i));
//	}
//	
//	for(int j=0;j<str.length();j++)
//	{
//		int count=Collections.frequency(list, str.charAt(j));
//		
//		if(count==1) {
//			return str.charAt(j);
//		}
//	}
//	return 'F';
//}


//static char sumane()
//{
//	String str="ramakrishna";
//	for(int i=0;i<str.length();i++)
//	{
//		String value=str.substring(0, i)+str.substring(i+1);
//		if(!value.contains(str.valueOf(str.charAt(i))))
//		{
//			return str.charAt(i);
//		}
//		
//	}
//	return 'F';
//}
}
