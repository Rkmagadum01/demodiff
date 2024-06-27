package Collections_class;

import java.util.Collections;
import java.util.List;

public class empty_list {
public static void main(String[] args) {
	//if i assigned list to as Emptylist() and if try add values in it 
	//it will throws java.lang.UnsupportedOperationException Error......
	List list=Collections.emptyList();
//	List list=Collections.EMPTY_LIST;---both are same 
	System.out.println(list);//result : []
	
	
	list.add(12);//this line will thorws an error......
	System.out.println(list);
}
}
