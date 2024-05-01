package codingchallenge;

public class MaxProductOfSubarray {
	public static int findMaxProduct(int[]arr, int n)
	{
		int max=arr[0];
		int cp=1;
		for(int i=0; i<n; i++)
		{
			cp=cp*arr[i];
		}
		max=Math.max(max, cp);
		for(int i=n; i<arr.length; i++)
		{
			cp=(cp/arr[i-n])*arr[i];
			max=Math.max(max, cp);
		}
		return max;
	}

	public static void main(String[] args) {
		int []arr= {1,4,3,6,5,2};
		int n=3;
		int res=findMaxProduct(arr, n);
		System.out.println("The maximum product of subarray is: "+res);
	}

}
