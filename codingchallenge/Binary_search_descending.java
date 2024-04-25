package Arrays;

public class Binary_search_descending {

		public static int Binary(int[]arr, int key)
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
				else if(arr[mid]<key)
				{
					high=mid;
				}
				else 
				{
					low=mid;
				}
			}
			return -1;
		}
		public static void main(String[] args) {
			int [] arr= {50,40,30,20,10};
			int key=40;
			int ind=Binary(arr, key);
			System.out.println("The element is at index:  "+ind);
		}

	}


