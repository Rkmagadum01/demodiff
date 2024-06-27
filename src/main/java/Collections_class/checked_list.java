package Collections_class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class checked_list {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(12);
	list.add(14);
	
	System.out.println("Type safe view of the List is: "+Collections.checkedList(list, Integer.class));
	
	
	//2nd case
//    List myList = new ArrayList();  
//    myList.add("one");  
//    myList.add("two");  
//    myList.add("three");  
//    myList.add("four");  
//    List chkList = Collections.checkedList(myList, String.class);  
//    System.out.println("Checked list content: "+chkList);  
//    //you can add any type of elements to myList object  
//    myList.add(10);  
//    //you cannot add any type of elements to chkList object, doing so throws ClassCastException  
//    chkList.add(10); //throws ClassCastException  
//	
	
	
	//3rd case
    //Create list         
    ArrayList<Integer> arrlist = new ArrayList<Integer>();  
    arrlist.add(10);  
    arrlist.add(20);  
    arrlist.add(30);  
    arrlist.add(40);  
    //Create type safe view of the collection  
    Collection<Integer> tsafelist;  
    tsafelist = Collections.checkedList(arrlist,Integer.class);       
    System.out.println("Type safe view of the List is: "+tsafelist);  
   
	
}
}
