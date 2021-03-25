package Practicejava;

public class Globalvariable {

	int i = 10;
	static int j = 20;

	public static void main(String[] args) {

		Globalvariable n1 = new Globalvariable();
		Globalvariable n2 = new Globalvariable();

		n1.i = 30;
		n2.i = 40;
		n1.j = 50;
		n2.j = 60;

		j = 25;

		System.out.println(n1.i);
		System.out.println(n1.j);
		System.out.println(n2.i);
		System.out.println(n2.j);
		// System.out.println(j);
		
	}

}
