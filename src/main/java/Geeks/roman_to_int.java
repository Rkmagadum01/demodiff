package Geeks;

import java.math.BigDecimal;
import java.util.HashMap;

public class roman_to_int {
	public static void main(String[] args) {
		System.out.println(convert("XI"));
	}

	static int convert(String str) {
		String s="ram";
		String s1="ram";
		System.out.println(s.charAt(0)==s1.charAt(0));
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int result=map.get(str.charAt(str.length()-1));
		
		for(int i=str.length()-2;i>=0;i--)
		{
			if(map.get(str.charAt(i))< map.get(str.charAt(i+1)))
			{
				result-=map.get(str.charAt(i));
			}else {
				result+=map.get(str.charAt(i));
			}
		}
		return result;
	}
	
	
}
