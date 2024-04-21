package codingchallenge;
import java.util.*;
public class BubbleSort {
	public static void sortArray(int[]arr)
	{
		for(int i=0; i<=arr.length; i++)
		{			
			int temp;
			for(int j=0; j<arr.length-1; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,54,1,2};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
