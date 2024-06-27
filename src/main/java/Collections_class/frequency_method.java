package Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class frequency_method {
public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(12);
	list1.add(17);
	list1.add(14);
	list1.add(12);
	list1.add(19);
	System.out.println(list1);
	
	int freq=Collections.frequency(list1, 12);
	System.out.println("12 is repeated -> "+ freq+" times");
	
	
	System.out.println("\ngetting frequency of all the elements\n");
	Set<Integer> uniqueset=new HashSet<Integer>();
	uniqueset.addAll(list1);
	
	for(int i:uniqueset) {
		System.out.println(i+" is repeated -> "+Collections.frequency(list1, i)+ " times");
	}
}
}
