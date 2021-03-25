package Practicejava;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//

		
		
		for (int i = 1; i <= 9; i++)

		{
			for (int j = 5; j >= 1; j--)

			{
				if (i <= 5) {
					if (i >= j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

				else {
					if (i+j < 11) {
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