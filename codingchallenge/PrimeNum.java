package codingchallenge;

public class PrimeNum {
	public static boolean checkPrime(int num)
	{
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=2; i<=100; i++)
		{
			int num=i;
			boolean res=checkPrime(num);
			if(res==true)
			{			
				System.out.println(num);
			}
		}
		
	}

}
