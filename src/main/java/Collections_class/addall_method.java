package Collections_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addall_method {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		//addAll Method 
		Collections.addAll(list, 12,23,34,46);
		System.out.println(list);
		Collections.addAll(list, 26,76,45);
		System.out.println(list);	
		
	}

}
