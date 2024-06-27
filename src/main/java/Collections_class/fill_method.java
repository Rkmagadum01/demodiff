package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class fill_method {
public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(12);
	list1.add(17);
	list1.add(14);
	list1.add(18);
	list1.add(19);
	System.out.println(list1);
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(2);
	list2.add(7);
	list2.add(4);
	list2.add(8);
	System.out.println(list2);
	
	//it will fill the all the list with one given value 
	Collections.fill(list1, 12);
	System.out.println(list1);
}
}
