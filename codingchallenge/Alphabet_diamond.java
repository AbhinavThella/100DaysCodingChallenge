package codingchallenge;

public class Alphabet_diamond {

	public static void main(String[] args) {
		int rows=5;
		int k=65;
		int n=64;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=(rows-i); j++)
			{
				System.out.print(" "+" ");	
			}
			char c=(char)k;
			for(int j=1; j<=i; j++)
			{
				System.out.print(c+" ");
				c++;
			}
			char c2=(char)n;
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(c2+" ");
				c2--;
			}
			n++;
			System.out.println();
		}
		int m=67;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+" ");
			}
			char c=(char)k;
			for(int j=1; j<=(rows-i); j++)
			{
				System.out.print(c+" ");
				c++;
			}
			char c2=(char)m;
			for(int j=(rows-i)-1; j>=1; j--)
			{
				System.out.print(c2+" ");
				c2--;
			}
			System.out.println();
			m--;
		}
	}

}
