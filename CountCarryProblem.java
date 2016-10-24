/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes*/
import java.util.*;

class TestClass {
    public static void main(String []args){
		int num1 = 0, num2 = 0;
		int carry,count;
		long rem1;
		long rem2;
		Scanner input = new Scanner(System.in);
		while(true){
			try{
			num1 = input.nextInt() ;
			num2 = input.nextInt() ;
			}
			catch(Exception e){}
			carry = 0;
			count = 0;
			if(num1==0 && num2==0) break;
			while(num1>0 || num2>0){
				rem1 = num1%10;
				rem2 = num2%10;
				if((rem1+rem2+carry)>=10){
					++count;
					carry = 1;
				}
				else
					carry = 0;
				num1 = num1/10;
				num2 = num2/10;
			}
			if(count == 0)
				System.out.println("No carry operation");
			else if(count == 1)
				System.out.println("1 carry operation");
			else
				System.out.println(count + " carry operations");
		}
	}
}
