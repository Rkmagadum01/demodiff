package Collections_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class index_of_list {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(12);
	list.add(42);
	list.add(134);
	list.add(53);
	list.add(12);
	list.add(32);
	
	ArrayList list2=new ArrayList();
	
	list2.add(134);
	list2.add(53);
	list2.add(12);
	
	//in case if repeated the whole list then only it will return index --otherwise it will return as "-1"
	System.out.println(Collections.indexOfSubList(list, list2));
	
}
}
