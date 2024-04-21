package codingchallenge;
public class SecondMaxArray {
	public static int findSecondMax(int[]arr)
	{
		int max1;
		int max2;
		if(arr[0]>arr[1])
		{
			max1=arr[0];
			max2=arr[1];
		}
		else
		{
			max1=arr[1];
			max2=arr[0];
		}
		for(int i=2; i<arr.length; i++)
		{
			if(max1<arr[i])
			{
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i])
			{
				max2=arr[i];
			}
		}
		return max2;
	}
	public static void main(String[] args) {
		int []arr= {20,10,34,29,56,9};
		int res=findSecondMax(arr);
		System.out.println("Second maximum element is "+res);
	}

}
