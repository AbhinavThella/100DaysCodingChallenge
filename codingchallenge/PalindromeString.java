package codingchallenge;
import java.util.*;

public class PalindromeString {
	public static String palindrome(String s)
	{
		String res="";
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			res=c+res;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s=sc.nextLine();
		String res=palindrome(s);
		if(s.equals(res))
		{
			System.out.println("It is Palindrome string");
		}
		else
		{
			System.out.println("It is not Palindrome string");
		}
		sc.close();
	}

}
