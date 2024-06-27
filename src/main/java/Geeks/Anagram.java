package Geeks;

public class Anagram {
public static void main(String[] args) {
	String result=reverseWords("i.like.this.program.very.much");
	System.out.println(result);
}
	
static String reverseWords(String S)
{
    // code here 
    String[] str=S.split("\\.");
    
    System.out.println(str.length);
    for(int i=0;i<str.length;i++)
    {
    	System.out.println(str[i]);
    }
    System.out.println();
    String str2="";
    for(int i=str.length-1;i>=0;i--)
    {
        str2=str2+str[i]+ (i==0 ?"": ".");
        
        System.out.println(str[i]);
    }
    return str2;
}
}
