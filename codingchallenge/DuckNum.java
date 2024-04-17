package codingchallenge;
import java.util.*;
public class DuckNum {
	public static boolean checkDuck(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			if(count>1&&rem==0)
			{
				return true;
			}
			n=n/10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		boolean res=checkDuck(n);
		if(res==true)
		{
			System.out.println("It is a Duck number");
		}
		else
		{
			System.out.println("It is not a Duck number");
		}
		sc.close();
	}

}
