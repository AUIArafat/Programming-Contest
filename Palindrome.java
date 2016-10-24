import java.util.*;


public class Palindrome {
	public static void main(String []args){
		int T;
		String text;
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		if(T<=30){
			while(T!=0){
				text = input.next();
				text.toLowerCase();
				String reverse = "";
				for(int i=text.length()-1;i>=0;i--){
					reverse = reverse + text.toLowerCase().charAt(i);
				}
				if(reverse.equals(text.toLowerCase())){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
				--T;
			}
		}
		}
}
