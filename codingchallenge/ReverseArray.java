package codingchallenge;
import java.util.*;

public class ReverseArray {
	public static void revArray(int[]arr)
	{
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};		
		System.out.println("Before reverse: " +Arrays.toString(arr));
		revArray(arr);
		System.out.println("After reverse: " +Arrays.toString(arr));

	}

}
