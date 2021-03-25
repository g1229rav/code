package Practicejava;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i must be 9 to 1
		// j must be 5 to 1

		for (int i = 9; i >= 1; i--)

		{
			for (int j = 5; j >= 1; j--)

			{
				if (i >= 5) {
					if (i + j < 11) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

				else {
					if (i >= j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();

		}

	}

}
