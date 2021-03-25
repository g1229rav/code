package Practicejava;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i must be 9 to 1
		// j must be 1 to 5

		for (int i = 9; i >= 1; i--)

		{
			for (int j = 1; j <= 5; j++)

				if (i >= j) {
					if (i + j <= 10) {

						System.out.print("* ");
					}

				}

			System.out.println();
		}

	}

}