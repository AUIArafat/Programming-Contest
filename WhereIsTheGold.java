import java.util.Scanner;


public class WhereIsTheGold {
	public static void main(String []args){
		int T;
		char c;
		char arr[][] = new char[100][100];
		int R;
		int C;
		int N=0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		while(T!=0){
			++count;
			R = input.nextInt();
			C = input.nextInt();
			for(int i=1;i<=R;i++){
				for(int j=1;j<=C;j++){
					c = input.nextLine().charAt(0);
					arr[i][j] = c;
				}
			}
			System.out.println("Case "+ count+":");
			for(int i=1;i<=R;i++){
				for(int j=1;j<=C;j++){
					if(arr[i][j]=='$'){
						++N;
						System.out.println(i+","+j);
					}
				}
			}
			if (N==0) {
				System.out.println("No Gold Found");
			}
			--T;
		}
	}
}
