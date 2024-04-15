package codingchallenge;
import java.util.*;
public class PerfectNum {
	public static int checkPerfect(int n)
	{
		int res=0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				res=res+i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		int res=checkPerfect(n);
		if(res==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");			
		}
		sc.close();
	}

}
