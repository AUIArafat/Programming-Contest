import java.util.Scanner;


public class HighSchoolSeries {
	public static void main(String []args){
		int T;
		int N;
		int sum;
		int count = 0;
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		while(T!=0){
			sum = 0;
			 N = input.nextInt();
			 for(int i=1;i<=N;i++){
				 sum = sum + i*i*i;	 
			 }
			 ++count;
			 System.out.println("Case "+count+": "+ sum);
			 --T;
		}
		
	}
}
