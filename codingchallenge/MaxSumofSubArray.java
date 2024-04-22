package codingchallenge;

public class MaxSumofSubArray {
	public static int subArray(int[]arr, int n)
	{
		int res=0;
		int max=arr[0];
		for(int i=0; i<n; i++ )
		{
			res=res+arr[i];
		}
		max=Math.max(max, res);
		for(int i=n; i<arr.length; i++)
		{
			
			res=res+arr[i]-arr[i-n];
			max=Math.max(max, res);
			
		}
		return max;
	}

	public static void main(String[] args) {
		int []arr= {10,20,15,25,30,40};
		int n=3;
		int res=subArray(arr, n);
		System.out.println(res);

	}

}
