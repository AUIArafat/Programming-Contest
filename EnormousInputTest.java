import java.util.Scanner;


public class EnormousInputTest {
	public static void main(String []args){
		int n,k,t;
		int count = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		k = input.nextInt();
		while(n!=0){
			t = input.nextInt();
			if(t%k == 0)
				++count;
			--n;
		}
		System.out.println(count);
	}
}
//
//7 3
//1
//1
//51
//966369
//7
//9
//999996
//114
