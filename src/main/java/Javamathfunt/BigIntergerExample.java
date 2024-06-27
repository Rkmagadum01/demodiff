package Javamathfunt;

import java.math.BigInteger;

public class BigIntergerExample {
public static void main(String[] args) {
	
	BigInteger number=new BigInteger("-123456789");
	
	//abs() method  ---  it will result in positive is input is negative value or positive value.......
	System.out.println(number.abs());
	
	
	BigInteger num=new BigInteger("120");
	BigInteger num2=new BigInteger("17");
	
	//add method to addition
	System.out.println(num.add(num2));
	
	//it will return how much binaruycode value has ---1
	System.out.println(num2.bitCount());
	
	//it will return lenght of binary code of given number.....
	System.out.println(num2.bitLength());
	
	//compareTO() method--
	System.out.println(num2.compareTo(num2)); ///both are equal so output is --0
	System.out.println(num.compareTo(num2));  //output is "1" bcz num is greater then num2
	System.out.println(num2.compareTo(num));   ////output is "-1" bcz num2 is lesser then num
	
	System.out.println(num.divide(num2));
	
	//The divideAndRemainder() methodof java BigInteger class returns an array of two BigIntegerswith being the first one be the quotient while second index corresponds to the remainder.
	BigInteger[] rem=num.divideAndRemainder(num2);
	System.out.println("Result of  divideAndRemainderoperaion :");     
	System.out.println("Quotient is "+ rem[0]);     
	System.out.println("Remainder is "+ rem[1]);  
	
	//it will return remainder after divinding the numbers 
	System.out.println(num.mod(num2));
	System.out.println(num.remainder(num2));
	System.out.println();
	
	System.out.println(num.multiply(num2));
	
	System.out.println(num.subtract(num2));
	System.out.println(num.add(num2));
	
	
	//if given number is negative then it will give in positive format and vice versaaa.....
	System.out.println(num.negate());
	
	
	
	//it will convert BigInteger to Double 
	System.out.println(num.doubleValue());
	System.out.println(num2.doubleValue());
	
	//it will convert BigInteger to int
	System.out.println(num.intValue());
	
	//it will convert BigInteger to float
	System.out.println(num.floatValue());
	
	//it will convert BigInteger to Long 
	System.out.println(num.longValue());
	
	System.out.println(num.equals(num2));
	System.out.println();
	
	//In Java, the flipBit(int n) method of the BigInteger class is used to create a new BigInteger that has the specified bit flipped (i.e., it changes the specified bit from 0 to 1 or from 1 to 0). This method does not modify the original BigInteger; instead, it returns a new BigInteger with the specified bit flipped.
	BigInteger flipnum=new BigInteger("10");//Binary is ==1010
	//index two means third number form right -- if third number form rigth is 1 then it become 0 and vice-versa 
	//in this case 1010 it becomes ---1110  
	System.out.println(flipnum.flipBit(2));// result is -- 14
	
	//it replace first number .. for now first number is 0 and it replace it with 1 then ---1011
	System.out.println(flipnum.flipBit(0)); //result is --11
	
	System.out.println(flipnum.flipBit(3));//result is --2
	
	
	BigInteger first=new BigInteger("10");
	BigInteger second=new BigInteger("20");
	//gcd()-- grestest common Divisor method()    -
	//it will 2 numbers and it will take HCF of this numbers
	System.out.println(first.gcd(second));// result is --10
	
	//it will return given first-number is prime or not , if prime it will return true else return false
	System.out.println(first.isProbablePrime(2));
	//it will give next probraly prime number of first number.....
	System.out.println(first.nextProbablePrime());
	
	System.out.println(first.max(second));
	System.out.println(first.min(second));
	
System.out.println();
	
	//here we can give power or exponetila number and it will multile that much with same number
System.out.println(first.pow(2)); //example : here i gave 2 as power number :- so 10*10 = ans is 100
System.out.println(first.pow(3));//here power number is : 3 -so the result is 1000		
}
}
