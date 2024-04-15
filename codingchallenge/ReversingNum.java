package codingchallenge;

public class ReversingNum {
	public static int revNum(int num)
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
		int num=1324;
		int res=revNum(num);
		System.out.println(res);
	}

}
