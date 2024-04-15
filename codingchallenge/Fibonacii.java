package codingchallenge;
import java.util.*;
public class Fibonacii {
	public static void toFibonacii(int n)
	{
		int a=0;
		int b=1;
		int res=0;
		for(int i=1; i<=n; i++)
		{
			System.out.println(a);
			res=a+b;
			a=b;
			b=res;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		toFibonacii(n);
        sc.close();
	}

}
