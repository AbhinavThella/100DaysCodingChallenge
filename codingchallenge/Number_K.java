package codingchallenge;

public class Number_K {
	public static void main(String[]args)
	{
		int rows=6;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=(rows-i)+1; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<rows; i++)
		{
			for(int j=1; j<=(i+1); j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
