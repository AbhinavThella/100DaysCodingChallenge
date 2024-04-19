package codingchallenge;

public class MaxNumInArray {
	public static int findMaxNum(int[]arr)
	{
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int []arr= {10,50,18,90,27,2};
		int res=findMaxNum(arr);
		System.out.println("Max number: "+res);

	}

}
