import java.util.Scanner;


public class FindProduct {
	public static void main(String []args){
		int N;
		int answer = 1;
		int A[] = new int[1000];
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		for(int i=0;i<N;i++){
			A[i] = in.nextInt();
			answer = (answer*A[i])%(1000000000+7);
		}
		System.out.println(answer);
	}
}
