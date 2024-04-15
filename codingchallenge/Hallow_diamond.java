package codingchallenge;
public class Hallow_diamond {
	public static void main(String[] args) {
		int rows=7;
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-i+1; j>=1; j--)
			{
				System.out.print("*"+" ");
			}
			for(int j=1; j<=(i*2-2); j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=rows-i+1; j>=1; j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=(rows-i)*2; j>=1; j--)
			{
				System.out.print(" "+" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
	}

}
