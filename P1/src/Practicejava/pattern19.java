package Practicejava;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i must be 1 to 9
		// j must be 5 to 1

		for (int i = 1; i <= 9; i++)

		{
			for (int j = 5; j >= 1; j--)

				if (i >= j) {
					if (i + j <= 10) {

						System.out.print("* ");
					}

				}

			System.out.println();
		}

	}

}