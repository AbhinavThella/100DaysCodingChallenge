package codingchallenge;
import java.util.*;

public class AnagramStrings {
	public static void checkAnagram(String s1, String s2)
	{
		char [] res1=s1.toCharArray();
		char [] res2=s2.toCharArray();
		Arrays.sort(res1);
		Arrays.sort(res2);
		if(Arrays.equals(res1, res2)) 
		{
			System.out.println("The string is anagram");		 	
		}
		else
		{
			System.out.println("The string is not anagram");		 				
		}
	}

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		checkAnagram(s1, s2);
	}
}
