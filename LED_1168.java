import java.util.Scanner;

public class LED_1168 {
	public static void main(String []args){
		int N;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		String s;
		int Sum;
		while(N!=0){
			Sum =0;
			s = in.next();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)== '1')
					Sum = Sum +2;
				else if(s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='5')
					Sum = Sum + 5;
				else if(s.charAt(i)=='4')
					Sum = Sum + 4;
				else if(s.charAt(i)=='0' || s.charAt(i)=='6' || s.charAt(i)=='9')
					Sum = Sum + 6;
				else if(s.charAt(i)=='7')
					Sum = Sum + 3;
				else if(s.charAt(i)=='8')
					Sum = Sum + 7;
			}
			System.out.println(Sum + " leds");
			--N;
		}
	}
}

