package StringBuffer_Builder;

public class String_Buffer {
public static void main(String[] args) {
	
	//three types of constructer are thier 
	//1st constructer type
	StringBuffer sb=new StringBuffer();
	
	//capacity() method
	System.out.println(sb.capacity());//by default capacity is 16
	
	//appned method
	sb.append("Heelo");
	sb.append(" Java");
	System.out.println(sb);
	
	//insert method
	sb.insert(1 , "###");
	System.out.println(sb);
	
	//delete method
	sb.deleteCharAt(2);
	System.out.println(sb);
	sb.delete(2, 6);
	System.out.println(sb);
	
	//reverse method
	sb.reverse();
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    
    sb.append("Good morning Java");
    System.out.println(sb.capacity());//if length become more than 16, then capacity will be (16*2)+2=34
    
}
}
