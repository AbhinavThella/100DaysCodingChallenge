package codingchallenge;

public class Lcm {
	public static void findLCM(int a, int b)
	{
		int n;
		if(a>b)
		{
			n=a;
		}
		else
		{
			n=b;
		}
		for(int i=n; i<(a*b); i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println(i);
				break;
			}
		}
	}

public static void main(String[] args) {
	int a=12;
	int b=36;
    findLCM(a,b);

	}

}
