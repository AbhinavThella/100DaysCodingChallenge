package codingchallenge;
import java.util.*;
public class DivideStringEqualParts {
	public static String[] divideString(String s, int n)
	{
		int len=s.length();
		int ch=len/n;
		int k=0;
		String []res= new String [n];
		if(len%n==0)
		{
			for(int i=0; i<len; i=i+ch)
			{
				String ep=s.substring(i,i+ch);
				res[k]=ep;
				k++;
			}
		}
		else
		{
			System.out.println("Given number does not divide string equally");
		}
		return res;

	}

	public static void main(String[] args) {
		String s="aaaabbbbcccc";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		String[] res=divideString(s, n);		
		System.out.println(Arrays.toString(res));
        sc.close();
	}

}
