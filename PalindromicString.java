import java.util.Scanner;


public class PalindromicString {
	public static String reverse(String S){
		String rev = null;
		for(int i=S.length()-1;i>=0;--i)
			rev = rev + S.charAt(i);
		return rev;
	}
	public static void main(String []args){
		String S;
		Scanner in = new Scanner(System.in);
		S = in.next();
		System.out.println(reverse(S));
	}
}
