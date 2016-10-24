import java.util.*;


public class GreatTheWorkIsDone {
	public static void main (String[] args) throws java.lang.Exception
	{
		double hours;
		int numberOfMember;
		int workedTime = 0;
		double totalTime = 0;
		int days;
		Scanner input = new Scanner(System.in);
		hours = input.nextInt();
		numberOfMember = input.nextInt();
		while(numberOfMember!=0){
			workedTime = input.nextInt();
			totalTime = totalTime + workedTime;
			numberOfMember--;
		}
		days = (int)Math.ceil(hours/totalTime);	
		System.out.println("Project will finish within "+days+" days.");
		// your code goes here
	}
}
