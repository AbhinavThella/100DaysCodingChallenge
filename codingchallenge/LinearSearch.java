package codingchallenge;

public class LinearSearch {
	public static int arraySearch(int[]arr, int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr= {10,30,20,50,40,70};
		int key=40;
		int res=arraySearch(arr, key);
		System.out.println("Index: "+res);
	}

}
