package codingchallenge;

public class EvenNum {
	public static int checkEven(int num)
	{
		if(num%2==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		int num=19;
		int res=checkEven(num);
		if (res==1) 
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
