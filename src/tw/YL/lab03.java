package tw.YL;

import java.util.Scanner;

public class lab03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
		
		System.out.printf("%d + %d = %d\n", x, y, r1);
		System.out.printf("%d - %d = %d\n", x, y, r2);
		System.out.printf("%d * %d = %d\n", x, y, r3);
		System.out.printf("%d / %d = %d ...... %d \n", x, y, r4, r5);
	
	}

}
