import java.util.Scanner;

public class Borze {
	public static void main(String []args){
		String S;
		int count = 0;
		Scanner in = new Scanner(System.in);
		S = in.nextLine();
		String fS = "";
		for (int i = 0; i <S.length(); i++) {
			if(S.charAt(i)=='.')
				fS = fS + '0';
			if(S.charAt(i)=='-' && S.charAt(i+1)=='.') {fS = fS + '1'; ++i;}
			if(S.charAt(i)=='-' && S.charAt(i+1)=='-') {fS = fS + '2'; ++i;}
			
		}
		System.out.println(fS);
	}
}
