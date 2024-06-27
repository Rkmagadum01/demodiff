package Geeks;

import java.util.HashMap;

public class longest_distinct {
public static void main(String[] args) {
	System.out.println(longestSubstrDistinctChars("geeksforgeeks"));;
}



static int longestSubstrDistinctChars(String S){
    // code here
	int max = 0;
	String str="";
	for(int i=0;i<S.length();i++)
	{
		 str=str+str.charAt(i);
		int count=0;
		for(int j=i;j<S.length();j++)
		{
//			String ch=str.valueOf(j);
			if(!str.contains(str.valueOf(j))) {
				count++;
			}else {
				break;
			}
			str=str+str.charAt(j);
		}
		if(count>max)
		{
			max=count;
		}
		str="";
	}
	return max;
//	  HashMap<Character, Integer> map= new HashMap<Character, Integer>();
//      
//      int l = 0;
//      int r =0;
//      int n =  S.length();
//      //13
//      int len = 0;
//      
//      while(r < n){
//    	  
//          if(map.containsKey(S.charAt(r))){
//              l =  Math.max(map.get(S.charAt(r))+1,l);
//          }
//          
//          map.put(S.charAt(r),r);
//          len = Math.max(r-l+1,len);
//          r++;
//      }
//      
//      return len;
}
}
