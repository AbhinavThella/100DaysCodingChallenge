package codingchallenge;
import java.util.*;
public class Paranthesis {
	public static void printSequence(int n, int c, int o, char []arr, int count)
	{
		if(count==arr.length)
		{
			System.out.println(arr);
		}
		if(o<n)
		{
			arr[count]='(';
			printSequence(n, c, o+1, arr, count+1);
		}
		if(c<o)
		{
			arr[count]=')';
			printSequence(n, c+1, o, arr, count+1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number of pairs of paranthesis:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int o=0;
		int count =0;
		char []arr=new char [n*2];
		printSequence(n, c, o, arr, count);
	    sc.close();
	}

}
