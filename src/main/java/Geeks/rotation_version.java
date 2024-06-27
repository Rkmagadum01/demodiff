package Geeks;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class rotation_version {
public static void main(String[] args) {

	System.out.println(areRotations("ramakrishna","makrishnara"));;
}

public static boolean areRotations(String s1, String s2 )
{
	if(s1.length()!=s2.length()){
		return false;
	}
	int k=0, count=0, extra =0;
	for(int i=0;i<s1.length();i++){
		k=0;
		extra=0;
		for(int j=i;j<s1.length()+i;j++){
			if(j<s1.length() && s2.charAt(k)==s1.charAt(j)){
				count++;
			}else if(s2.charAt(k)==s1.charAt(extra)){
				extra++;
				count++;
			}else {
				break;
			}
			k++;
		}
		if(count==s1.length()){
			return true;
		}
		count=0;
	}
	return false;		
}

//public static boolean areRotations(String s1, String s2 )
//{
//    // Your code here
//    
//    StringBuffer str = new StringBuffer(s1);
//    
//    for(int i =0;i<str.length();i++){
//        char ch = s	tr.charAt(str.length()-1);
//        str = str.insert(0,ch);
//        str = str.deleteCharAt(str.length()-1);
//        if(str.toString().equals(s2)){
//            return true;
//            
//        }
//    }
//    
//    return false;
//    
//}


//String str = s1 + s1;
//int j=0;
//int i=0;
//
//while(i<str.length() && j<s2.length()){
//    if(str.charAt(i) == s2.charAt(j)){
//        i++;
//        j++;
//    }else{
//        i++;
//    }
//}
//
//return j==s2.length();


}
