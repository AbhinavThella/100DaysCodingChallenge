package codingchallenge;

public class Alphabet_triangle {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1; i<=rows; i++)
		{
			char k=65;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
