package Geeks;

import java.util.Arrays;

public class LongCommonPrefix {
public static void main(String[] args) {
	
	String[] arr= {"geeksforgeeks", "geeks" ,"geek", "geezer"};
	String res=longestCommonPrefix(arr,4);
	System.out.println(res);

}

static String longestCommonPrefix(String arr[], int n){
    // code here
    String min="";
         String first ;
        String second ;
        int size;
    for(int i=0;i<n-1;i++)
    {
        if(i==0)
        {
            first =arr[i];
         second =arr[i+1];
         size=Math.min(first.length(),second.length());
        }else{
               first =arr[i];
         second =arr[i+1];
         int  arraysize=Math.min(first.length(),second.length());
         size=Math.min(arraysize,min.length()); 
        }
       min="";
        for(int j=0;j<size;j++)
        {
            if(first.charAt(j)==second.charAt(j))
            {
               min=min+first.charAt(j); 
            }
        }
    }
    if(min.length()==0)
    {
        return "-1";
    }else{
        return min;
    }
    
   
    
}
}
