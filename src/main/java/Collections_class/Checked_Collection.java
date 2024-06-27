package Collections_class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Checked_Collection {
public static void main(String[] args) {
	
	 ArrayList<Integer> arrlist = new ArrayList<Integer>();  
     arrlist.add(10);  
     arrlist.add(20);  
     arrlist.add(30);  
     arrlist.add(40);  
	
     
////     ArrayList also having Integer type values and in CheckedCollection also we gave Integer.class , so it will not any errors
	Collection typesafe;
	typesafe=Collections.checkedCollection(arrlist, Integer.class);
	System.out.println(typesafe);
	
     
     //2nd case 
//// ArrayList also having Integer type values and in CheckedCollection also we gave Integer.class , so it will not any errors
     Collection<String> c = new ArrayList<>();  
     c = Collections.checkedCollection(c, String.class);  
     Collections.addAll(c, "apple", "banana");  
     System.out.println(c);  
     @SuppressWarnings("rawtypes")  
 Collection c2 = c;  
     c2.add(1);//this throws exception  
     System.out.println(c2);  
	
}
}
