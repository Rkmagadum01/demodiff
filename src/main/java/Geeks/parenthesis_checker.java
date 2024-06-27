package Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class parenthesis_checker {

	public static void main(String[] args) {
		
		String str= "[()]{}{[()()]()}";
		ispar(str);
		
	}

	  static boolean ispar(String x)
	    
	    {
	        int count = 0 ;
	        if(x.length()%2 != 0){
	            return false ;
	        }
	        
	        Stack <Character> s = new Stack<Character>();
	        //[ 
	        for(int i =0 ; i< x.length(); i++){
	            if(x.charAt(i) == '[' || x.charAt(i)=='(' || x.charAt(i)=='{'){
	                s.push(x.charAt(i));
	                //[
	            }
	            else if(s.size()==0){
	                return false ;
	            }
	            else {
	                if(s.size()!= 0){
	                	//true  
	                    if((x.charAt(i)==']'&& s.peek()=='[') || (x.charAt(i)==')' && s.peek()=='(')
	                    || (x.charAt(i)=='}'&& s.peek()=='{')
	                    ){
	                        s.pop();
	                        count ++;
	                    }
	                    
	                }
	            }
	            if( x.length()/2 == count && s.size()==0){
	            	//16/2=8 ==0 -false
	            	//
	                return true ;
	            }
	        }
	            return false ;
	    }
}
