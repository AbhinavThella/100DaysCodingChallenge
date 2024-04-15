package codingchallenge;

public class Palindrome {
	public static int checkPalindrome(int num)
	{
		int res=0;
		while(num>0)
		{
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 121;
		int res = checkPalindrome(num);
		if(res==num)
		{
			System.out.println(num+" is a palindrome number");
		}
		else
		{
			System.out.println(num+" is not a palindrome number");
		}
	}

}
