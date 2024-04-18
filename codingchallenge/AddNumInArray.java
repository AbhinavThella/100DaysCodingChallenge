package codingchallenge;
import java.util.*;
public class AddNumInArray {
	public static int [] addNum(int[]arr, int index, int num)
	{
		int []res=new int [arr.length+1];
		for(int i=0; i<index; i++)
		{
			res[i]=arr[i];
		}
		res[index]=num;
		for(int i=index; i<arr.length; i++)
		{
			res[i+1]=arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};		
		int num=23;
		int index=2;
		int [] res=addNum(arr, index, num);
		System.out.println(Arrays.toString(res));
	}

}
