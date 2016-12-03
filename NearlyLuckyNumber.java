import java.util.Scanner;
public class NearlyLuckyNumber{
	public static void main(String []args){
		long n ;
		int count = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		String S = Long.toString(n);
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='4' || S.charAt(i) == '7'){
				++count;
			}
		}
		if(count == 4 || count ==7){
			System.out.println("YES");
		}
		else 
			System.out.println("NO");
	}
}