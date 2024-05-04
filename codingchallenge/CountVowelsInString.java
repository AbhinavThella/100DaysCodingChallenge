package codingchallenge;
import java.util.*;

public class CountVowelsInString {
	public static int countVowels(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s=sc.nextLine();
		int res=countVowels(s);
		System.out.println("The number of Vowels are: "+res);
		sc.close();
	}

}
