import java.util.Scanner;


public class PrimeNumber {
	public boolean checkPrimeNumber(int number){
		if(number<2){
			return false;
		}
		else if(number > 2){
			for(int i=2;i<=Math.sqrt(number);i++){
				if(number%i == 0){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String []args){
		PrimeNumber ob = new PrimeNumber();
		int test;
		int num;
		Scanner input = new Scanner(System.in);
		test = input.nextInt();
		while(test!=0){
			num = input.nextInt();
			if(ob.checkPrimeNumber(num) == true){
				System.out.println("PRIME");
			}
			else if(ob.checkPrimeNumber(num) == false){
				System.out.println("NOT PRIME");
			}
			test--;
		}
	}
}
