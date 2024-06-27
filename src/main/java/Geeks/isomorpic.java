package Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class isomorpic {
public static void main(String[] args) {
	System.out.println(sample("aab","xxy"));;
}

static boolean sample(String str1, String str2)
{   
	if(str1.length()!=str2.length())
		return false;
	
	
	        // Your code here
	        ArrayList<Character> list=str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toCollection(ArrayList :: new));
	        ArrayList<Character> list2= str2.chars().mapToObj(ch -> (char) ch) .collect(Collectors.toCollection(ArrayList:: new ));	        
	        int[] count=new int[str1.length()];
	        int[] count2=new int[str1.length()];
	        for(int i=0;i<str1.length();i++) {
	        	count[i]=Collections.frequency(list, str1.charAt(i));
	        	count2[i]=Collections.frequency(list2, str2.charAt(i));
	        }
	        Arrays.sort(count);
	        Arrays.sort(count2);
	        if(Arrays.equals(count, count2))
	        	return true;
	        return false;
}
}
