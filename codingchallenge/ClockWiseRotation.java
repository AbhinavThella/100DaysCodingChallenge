package codingchallenge;
import java.util.*;

public class ClockWiseRotation {
	public static void rotateArray(int[]arr)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int n=3;
		for(int i=1; i<=n; i++)
		{
		rotateArray(arr);
		System.out.println(Arrays.toString(arr));
		}
	}

}
