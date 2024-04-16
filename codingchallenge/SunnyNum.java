package codingchallenge;
import java.util.*;
public class SunnyNum {
	public static boolean checkSunny(int n)
	{
		int next=n+1;
		double sqrt=Math.sqrt(next);
		if(sqrt==Math.floor(sqrt))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n=sc.nextInt();
		boolean res=checkSunny(n);
		if(res==true) 
		{
			System.out.println(n+" is a Sunny number.");
		}
		else
		{
			System.out.println(n+" is not Sunny number.");
		}
		sc.close();
	}

}
