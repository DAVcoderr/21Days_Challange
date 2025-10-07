package Practices;

public class pgm8 {
	public static void main(String[] args) {
		int k=0;
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=6;b++) {
				System.out.printf("%2d ", k);
				k+=2;
			}
			System.out.println();
		}
	}

}
