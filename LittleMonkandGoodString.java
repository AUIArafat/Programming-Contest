import java.util.Scanner;


public class LittleMonkandGoodString {
	public static void main(String []args){
		String S;
		Scanner in = new Scanner(System.in);
		S = in.next();
		int count = 0;
		int max = 0;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u'){
				++count;
			}
			else{
				if(count > max)
					max = count;
				count = 0;
			}
		}
		System.out.println(max);
	}
}
