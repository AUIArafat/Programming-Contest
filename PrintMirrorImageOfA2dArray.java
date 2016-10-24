import java.io.IOException;
import java.util.Scanner;


public class PrintMirrorImageOfA2dArray {
	public static void main(String []args) throws IOException{
		int T, N, M;
		char input1[][];
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		while(T!=0){
			N = input.nextInt();
			M = input.nextInt();
			input1 = new char [N][M];
			for(int i=0;i<N;i++){
					input1[i][0] = (char) System.in.read();
			}
			for(int j=0;j<M;j++){
				input1[0][j] = (char) System.in.read();
			}
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					System.out.println(input1[i][j]);
				}
			}
			--T;
		}
	}
}
