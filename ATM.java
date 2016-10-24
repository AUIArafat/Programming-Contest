import java.util.Scanner;


public class ATM {
	public static void main(String []args){
		double y = 0.0;
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextDouble();
		if(x%5 == 0 && (x+.5)<y){
			y = y - (x + .50);
			System.out.println(y);
		}
		else if(x%5 != 0){
			System.out.println(y);
		}
		else if(x%5 == 0 && (x+.5)>y){
			System.out.println(y);
		}
		
	}
}
