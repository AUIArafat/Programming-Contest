import java.util.Scanner;


public class Banglawash {
	public static void main(String []args)  throws java.lang.Exception{
		int test;
		Scanner input = new Scanner(System.in);
		test = input.nextInt();
		int Test1[] = new int[4];
		int Test2[] = new int[4];
		int count = 0;
		while(test!=0){
			for(int i=0;i<4;i++){
				Test1[i] = input.nextInt();
			}
			if((Test1[0]+Test1[1])>(Test1[2]+Test1[3])) ++count;
			else --count;
			for(int i=0;i<4;i++){
				Test2[i] = input.nextInt();
			}
			if((Test2[0]+Test2[1])>(Test2[2]+Test2[3])) ++count;
			else --count;
			if(count==2){
				System.out.println("Banglawash");
			}
			else 
				System.out.println("Miss");
			--test;
		}
	}
}
