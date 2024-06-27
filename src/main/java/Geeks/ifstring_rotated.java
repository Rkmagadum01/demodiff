package Geeks;

public class ifstring_rotated {
public static void main(String[] args) {
	System.out.println(isRotated("amazon","azonam"));;
}

public static boolean isRotated(String str1, String str2)
{
    // Your code here
    for(int i=0;i<str1.length()-1;i++)
    {
        
        for(int j=i+2;j<str1.length()-1;j++)
        {
        String check=str1;
        //amazon
        char[] ch=str1.toCharArray();
        // a m a z o n 
        
        //a
         char ch1=ch[i];
         //m
         char ch2=ch[i+1];
         //m
         ch[i]=ch[j];
         //a
         ch[i+1]=ch[j+1];
         
         ch[j]=ch1;
         ch[j+1]=ch2;
         String final1 = "";
         for(int k=0;k<ch.length;k++) {
       final1=final1+ch[k];
         }
        
         System.out.println(final1);
         if(final1.equals(str2))
         {
        	 System.out.println(final1);
             return true;
             
         }
        }
        
    }
    return false;
}
}
