package codingchallenge;
import java.util.*;
public class TCSSumOfFactorials {
	public static int findSum(int n)
	{
		int res=0;
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=n*i;
			res=res+sum;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=sc.nextInt();
		int res=findSum(n);
        System.out.println("The sum is: "+res);
        sc.close();
	}

}
