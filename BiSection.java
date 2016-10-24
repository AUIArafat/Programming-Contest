
public class BiSection {
	public void mySqrt(double value){
		double low = 0;
		double high = value;
		double mid = 0;
		while(high-low > 0.0000001){
			mid = (high+low)/2;
			if(mid*mid > value){
				high = mid;
				System.out.println("High : " + high);
			}
			else{
				low = mid;
				System.out.println("Low : " + low);
			}
		}
		System.out.println(mid);
	}
	public static void main(String []args){
		BiSection obj = new BiSection();
		obj.mySqrt(81);
	}
}
