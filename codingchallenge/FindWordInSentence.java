package Strings;
import java.util.*;
public class FindWordInSentence {
	public static boolean checkWord(String[]arr) {
	  for(int i=0; i<arr.length; i++)
      {
      	String s1=arr[i];
      	if(s1.equals("country"))
      	{
      		System.out.println("Index: "+i);
      		return true;
      	}
     
      }
	return false;
}   
public static void main(String[] args) {
		String s="india is my country";
		String []arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		boolean res=checkWord(arr);
		if(res==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
      
	}

}
