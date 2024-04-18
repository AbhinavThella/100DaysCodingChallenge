package codingchallenge;
import java.util.*;
public class RemoveNumFromArray {
	public static int [] removeNum(int []arr, int index)
	{
		int []res=new int[arr.length-1];
		for(int i=0; i<index; i++)
		{
			res[i]=arr[i];
		}
		for(int i=index; i<res.length; i++)
		{
			res[i]=arr[i+1];
		}
		return res;
	}

	public static void main(String[] args) {
		int []arr= {12,35,62,79,10};
		int index=3;
		int []res=removeNum(arr, index);
	    System.out.println(Arrays.toString(res));

	}

}
