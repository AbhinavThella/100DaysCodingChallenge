package codingchallenge;

public class num0and1 {

	public static void main(String[] args) {
		int rows=5;
		int n=1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(n==1)
				{
					System.out.print(n+" ");
					n=0;
				}
				else
				{
					System.out.print(n+" ");
					n=1;
				}
			}
			System.out.println();
		}
	}

}
