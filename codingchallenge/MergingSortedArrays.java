package codingchallenge;
import java.util.*;
public class MergingSortedArrays {
	public static int[] mergeArrays(int[]arr1, int[]arr2)
	{
		int []res=new int [arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				res[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				res[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			res[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			res[k]=arr2[j];
			k++;
			j++;
		}
		return res;
	}
	public static void main(String[] args) {
		int []arr1= {10,30,50,70,90,92,95,108};
		int []arr2= {20,40,60,80,100};
		int [] res=mergeArrays(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}
}
