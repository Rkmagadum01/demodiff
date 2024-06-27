package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class copy_method {
public static void main(String[] args) {
//	--------------------------------------------------------------------------------------------
	//change in length
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
	
	//source list has smaller in size and both having same type of datatype so it copy and print 
	Collections.copy(list1, list2);//result:- [2, 7, 4, 8, 19]
	System.out.println(list1);
	
	//source list has larger in size and both having same type of datatype so it copy and print 
//		Collections.copy(list2, list1);//result:-java.lang.IndexOutOfBoundsException: Source does not fit in dest
//		System.out.println(list1);
//	--------------------------------------------------------------------------------------------

	
	
//	--------------------------------------------------------------------------------------------
//	change in datatype
//	ArrayList<Integer> list3=new ArrayList<Integer>();
//	list3.add(12);
//	list3.add(17);
//	list3.add(14);
//	list3.add(18);
//	list3.add(19);
//	System.out.println(list3);
//	ArrayList<String> list4=new ArrayList<String>();
//	list4.add("first");
//	list4.add("second");
//	System.out.println(list4);
//	//it will through errors
//	Collections.copy(list3, list4);
	
	
	
//	--------------------------------------------------------------------------------------------
	
	
	
	
	
	
}
}
