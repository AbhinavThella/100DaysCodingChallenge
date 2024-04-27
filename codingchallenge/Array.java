package codingchallenge;
import java.util.*;
public class Array {
	public static void practiceArray(int[]arr)
	{
		int p=0;
		int n=0;
		int e=0;
		int o=0;
		int z=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				p++;
			}
			if(arr[i]<0)
			{
				n++;
			}
			if(arr[i]%2==0)
			{
				e++;
			}
			if(arr[i]%2!=0)
			{
				o++;
			}
			if(arr[i]==0)
			{
				z++;
			}
		}
		System.out.println("Number of positive numbers: "+p );
		System.out.println("Number of negative numbers: "+n );
		System.out.println("Number of even numbers: "+e );
		System.out.println("Number of odd numbers: "+o );
		System.out.println("Number of zeros: "+z );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int []arr=new int[10];
        System.out.println("Enter the element: ");
        for(int i=0; i<arr.length; i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        practiceArray(arr);
        sc.close();
	}

}
