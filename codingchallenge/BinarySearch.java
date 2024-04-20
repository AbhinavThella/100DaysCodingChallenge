package codingchallenge;

public class BinarySearch {
	public static int searchArrayBS(int[]arr, int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
		    if(arr[mid]<key)
			{
				low=mid;
			}
			if(arr[mid]>key)
			{
				high=mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]arr= {10,20,45,60,89};
		int key=60;
        int res=searchArrayBS(arr,key);
        System.out.println("Index: "+res);

	}

}
