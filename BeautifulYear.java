import java.util.Scanner;

public class BeautifulYear {
	public static Boolean checkDistinct(int N){
		String S = Integer.toString(N);
		Boolean flag = true;
		for(int i=0;i<S.length()-1;i++){
			for(int j=i+1;j<S.length();j++){
			if(S.charAt(i)==S.charAt(j))
			{
				flag = false;
				break;
			}
		}
		}
		return flag;
	}
	public static void main(String []args){
		int N;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		while(true){
			++N;
			if(checkDistinct(N) == true){
				System.out.println(N);
				break;
			}
			
		}
		
	}
}
