import java.util.Collections;
import java.util.Scanner;


public class MarkTheAnswer {
	public static void main(String []args){
		int N,X,count = 0;
		long arr[] = new long[100000000];
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		X = input.nextInt();
		for(int i=0;i<N;i++){
			arr[i] = input.nextInt();
		}
		for(int i=1;i<N;i++){
			System.out.println(count);
			if(arr[i]<X || arr[0] > arr[++i] ){
				++count;
			}
		}
		System.out.println(count);
	}
}
