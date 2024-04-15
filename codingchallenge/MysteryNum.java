package codingchallenge;

public class MysteryNum {
	public static int toReverse(int i) 
	{
		int res=0;
		while(i!=0)
		{
			int rem=i%10;
			res=(res*10)+rem;
			i=i/10;
		}
		return res;
	}
	public static boolean findMysteryNum(int n)
	{
		int rev;
		for(int i=1; i<n/2; i++)
		{
			rev=toReverse(i);
			if(i+rev==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n=176;
		boolean res=findMysteryNum(n);
		if(res==true)
		{
			System.out.println(n+" is a Mystery number");
		}
		else
		{
			System.out.println(n+" is not a Mystery number");
		}
	}

}
