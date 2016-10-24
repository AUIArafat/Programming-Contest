import java.util.Arrays;


public class BinarySearch {
	public static int Search(int [] Array, int value){
		int begin = 0;
		int end = Array.length-1;
		int mid, index = 0;
		while(end>=begin){
			mid = (begin + end)/2;
			if(Array[mid] == value)
			{
				index = mid;
				try{
				end = mid - 1;
				}
				catch(Exception e){}
				if(Array[end] == value){
					index = end;
				}
				else
					return index;
				
			}
			else if(Array[mid] > value){
				end = mid - 1;
			}
			else if(Array[mid] < value){
				begin = mid + 1;
			}
			else{
				return index;
			}
		}
//		if(end == begin && Array[begin] == value)
//			return index;
		return -1;
	}
	public static void main(String []args){
		int arr[] = {34,24,14,54,25,64,22,56,84,4};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(BinarySearch.Search(arr, 1));
		System.out.println(BinarySearch.Search(arr, 24));
	}
}
