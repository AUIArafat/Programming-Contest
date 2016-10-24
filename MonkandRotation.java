import java.util.Scanner;


public class MonkandRotation {
	public static void main(String []args){
		int T;
		int N;
		int K;
		int A[] = new int[1000000];
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T!=0){
			N = in.nextInt();
			K = in.nextInt();
			for(int i=0;i<N;i++){
				A[i] = in.nextInt();
			}
			K = ((K % N) + N) % N; // limit and make positive
		    int[] dest = new int[N];
		    for (int i=0; i<N; i++) {
		        int index = (i + K) % N;
		        dest[index] = A[i];
		    }
			for(int i=0;i<N;i++){
				System.out.println(dest[i]+" ");
			}
			--T;
		}
	}
}
