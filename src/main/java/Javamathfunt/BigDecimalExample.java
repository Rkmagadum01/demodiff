package Javamathfunt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExample {
	
	public static void main(String[] args) {
		BigDecimal value1=new BigDecimal("120.00");
		BigDecimal value2=new BigDecimal("10.000");
		
		BigDecimal value3=new BigDecimal("-10");
		//it will return value in positive if we gave in negative or positive ......
		System.out.println(value3.abs());
		
		//if given number is negative then it will give in positive format and vice versaaa.....
		System.out.println(value3.negate());
		
		
		System.out.println(value1.add(value2));
		System.out.println(value1.multiply(value2));
		System.out.println(value1.subtract(value2));
		
		//it will value2 number power to mentioned time --here it will give two times
		System.out.println(value2.pow(2));
		System.out.println();
		
		//compareTO() method--
		System.out.println(value2.compareTo(value2)); ///both are equal so output is --0
		System.out.println(value1.compareTo(value2));  //output is "1" bcz num is greater then num2
		System.out.println(value2.compareTo(value1));   ////output is "-1" bcz num2 is lesser then num
		
		
		//#################  Division Part  #######################
		
		BigDecimal num=new BigDecimal("120.000");
		BigDecimal num2=new BigDecimal("17");
		//In this example, 2 is the scale (number of digits after the decimal point), and RoundingMode.HALF_UP specifies the rounding mode.
		System.out.println(num.divide(num2, 2, RoundingMode.CEILING));
		//this value will return the result in interger form (like without decimal ponitss....)
		System.out.println(num.divideToIntegralValue(num2));
		
		//The divideAndRemainder() methodof java BigInteger class returns an array of two BigIntegerswith being the first one be the quotient while second index corresponds to the remainder.
		BigDecimal[] rem=num.divideAndRemainder(num2);
		System.out.println("Result of  divideAndRemainderoperaion :");     
		System.out.println("Quotient is "+ rem[0]);     
		System.out.println("Remainder is "+ rem[1]);  
		
		System.out.println(num.remainder(num2));
		System.out.println();
		
		System.out.println(num.doubleValue());
		System.out.println(num.floatValue());
		System.out.println(num.intValue());
		System.out.println(num.intValueExact());
		System.out.println(num.longValue());
		
		System.out.println(num.equals(num2));
		
		
		System.out.println(num.max(num2));
		System.out.println(num2.min(num));
		
		
		
		// returns a BigDecimal which is equivalent to this one with the decimal point moved n places to the left.
		//same number it will give But , Decimal Point will shift to left if we gave positive number
		System.out.println(num.movePointLeft(2));// num value is 120 .. and result is 1.20
		
		//same number it will give But , Decimal Point will shift to right if we gave negative number
				System.out.println(num.movePointLeft(-2));// num value is 120 .. and result is 12000
				
				//it is reverse of the above method...........
				System.out.println(num.movePointRight(2));
				System.out.println(num.movePointRight(-2));
				
				//	This method returns the precision of this BigDecimal.
				//Example Num = 120.000  then it will return "6"
				System.out.println(num.precision());
				
				
					
				BigDecimal roundnum=new BigDecimal("123.1231235");
				//This method returns the scale of this BigDecimal.
				//Example in above number having 7 digit after decimal point so 
				System.out.println(roundnum.scale());//-- so result is 7
				//it will remove the decimal point and return the all digits it has
				System.out.println(roundnum.unscaledValue());// result isn:-  1231231235
				//it will set 2 digit after the decimal point of given number
				System.out.println(roundnum.setScale(2,RoundingMode.CEILING));// result is :- 123.13
				
				//it will multiple given value with power of 10
				//example here i gave as 2 : 123.1231235*10*10 ==12312.31235  //it will multiply by 100 because 10 power 2 is =100...
				System.out.println(roundnum.scaleByPowerOfTen(2));//o/p:-  12312.31235 
				
				BigDecimal stripnum=new BigDecimal("123.1230000");
				//This method returns a BigDecimal which is numerically equal to this one but with any trailing zeros removed from the representation.
				System.out.println(stripnum.stripTrailingZeros());//output :- 123.123
				
				
				//it will return only interger part of the given number
				System.out.println(stripnum.toBigInteger());//output:-  123
				double doublenum=1212.1212;
				long longnum=121212122;
				//This method is used to translate a double and long into a BigDecimal.
				System.out.println(stripnum.valueOf(doublenum));
				System.out.println(stripnum.valueOf(longnum));
				
				
		
	}

}
