package codingchallenge;
import java.util.*;
public class ReverseString {
	public static String revString(String s)
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
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String res=revString(s);
		System.out.println("The reversed string is: "+res);
		sc.close();
	}

}
