package codingchallenge;
import java.util.*;

public class AntiClockWiseRotation {
	public static void rotateArray(int []arr)
	{
		int temp=arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
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
