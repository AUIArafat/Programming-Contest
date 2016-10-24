import java.util.Scanner;


public class DecimaltoBinary {
	int reminder;
	int i;
	long binary;
	int decimal;
	public long decimalToBinary(int value){
		binary = 0;
		i = 1;
		while(value!=0){
			reminder = value%2;
			binary = binary + (reminder * i);
			i = i*10;
			value = value/2;
		}	
		return binary;
	}
	public int binaryToDecimal(long value){
		decimal = 0;
		i = 0;
		while(value!=0){
			reminder = (int)value%10;
			decimal = decimal + reminder*(pow(2,i));
			++i;
			value = value/10;
		}
		return decimal;
	}
	private int pow(int j, int i2) {
		int temp = j;
		for(int i=1;i<i2;i++){
			j = j*temp;
		}
		return j;
	}
	public static void main(String []args){
		int value;
		DecimaltoBinary ob = new DecimaltoBinary();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Decimal Value	: ");
		value = input.nextInt();
		System.out.println(ob.decimalToBinary(value));
		System.out.println("Enter your Binary Value	: ");
		value = input.nextInt();
		System.out.println(ob.binaryToDecimal(value));
		
	}
}
