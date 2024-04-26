package codingchallenge;
import java.util.*;

public class TCSSumOfCube {
	public static int findCube(int n)
	{
		int cube=n*n*n;
		return cube;
	}
	
	public static int sumOfCube(int n, int m)
	{
		int res=0;
		while(n<=m)
		{
			int c=findCube(n);
			res=res+c;
			n++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Give the range***");
		System.out.println("Enter first value: ");
		int n=sc.nextInt();
		System.out.println("Enter second value: ");
		int m=sc.nextInt();
		int res=sumOfCube(n,m);
        System.out.println("The sum of cube in the range: " +res);
        sc.close();
	}

}
