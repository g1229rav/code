package Practicejava;
public class Pattern27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i must be 9 to 1
		// j must be 1 to 5
		int k = 14;
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i >= 5) {
					if (i + j >= k) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
				else {
					if (i + j >= 6) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			}
			if (i >= 5) {
				k = k - 2;
			}
			System.out.println();
		}
	}
}
