package codingchallenge;

public class MirroredHeart {

	public static void main(String[] args) {
		int n=6;
		int m=7;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(i==0&&j%3!=0 || i==1&&j%3==0 || i-j==2 || i+j==8)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(i+j==3 || j-i==3 || i==4&&j%3==0 || i==5&&j%3!=0)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}

}
