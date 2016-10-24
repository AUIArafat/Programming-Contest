import java.util.*;


public class TomorrowisEid {
	public static void main(String []args){
		int N;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		if(N>0 && N<=30){
			if(N == 30 || N == 29){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}
