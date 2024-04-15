package codingchallenge;

public class HappyNum {
	public static int checkHappy(int n)
	{
		int res=0;
		int rem=n%10;
		res=res+(rem*rem);
		n=n/10;
		return res;
	}

	public static void main(String[] args) {
		int n=32;
		int res=checkHappy(n);
		while(res==1 || res==4)
		{
			res=checkHappy(res);
		}
		if(res==1)
		{
			System.out.println(n+" is a happy number");
		}
		else
		{
			System.out.println(n+" is a happy number");
		}
	}

}
