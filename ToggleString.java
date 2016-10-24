import java.util.Scanner;
public class ToggleString {
	public static void main(String []args){
		String S;
		String result = null;
		Scanner in = new Scanner(System.in);
		S = in.next();
		for(int i=0;i<S.length();i++){
			int asci = S.charAt(i);
			if((asci>=65 && asci<=90)){
				S = S.substring(0, i) + (char)(asci+32) + S.substring(i + 1);
			}
			else 
				S = S.substring(0, i) + (char)(asci-32) + S.substring(i + 1);
		}
		System.out.println(S);
	}
}
