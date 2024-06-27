package Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dis_joint {
	public static void main(String[] args) {  
        //Create two lists      
        List<String> list1 = new ArrayList<String>();   
          list1.add("Facebook");  
          list1.add("Instagram");  
          list1.add("Twitter");             
          List<String> list2 = new ArrayList<String>();  
          list2.add("Whatsapp");  
          list2.add("Hike");  
          list2.add("Skype");  
          //Check common elements in both lists  
          boolean isCommon = Collections.disjoint(list1,list2);  
          if(isCommon)   
                 System.out.println("Lists Must Have Nothing In Common!");  
                else  
                 System.out.println("Lists Must Have Something In Common!");  
          //Add one elements in the List1 and check for common elements again  
          list1.add("Whatsapp");  
          isCommon = Collections.disjoint(list1,list2);  
          if(isCommon)   
                 System.out.println("Lists Must Have Nothing In Common!");  
                else  
                 System.out.println("Lists Must Have Something In Common!");   
          }  

}
