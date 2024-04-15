package codingchallenge;
import java.util.*;
public class Butterfly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int rows=sc.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");		
			}
			for(int j=1; j<=(rows+rows)-(i+i); j++)
			{
				System.out.print(" "+" ");
			}

			for(int j=i; j>=1; j--)
			{
				System.out.print("*"+" ");
			}
		System.out.println();	
		}
		for(int i=1; i<rows; i++)
		{
			for(int j=(rows-i); j>=1; j--)
			{
				System.out.print("*"+" ");
			}
			for(int j=1; j<=(i+i); j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=(rows-i); j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	sc.close();	
	}

}
