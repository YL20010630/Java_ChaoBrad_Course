package tw.YL;

public class lab63 {
	
	/*
		
	 */

	public static void main(String[] args) {
		m1();
	}

	static void m1() {
		int a=10, b = 3;
		int c;
		try {
			c = a / b;
			System.out.println(c);
			return;
		} catch (Exception e) {
			System.out.println(e);
//			return;
		} finally {
			System.out.println("Finally");
		}
		System.out.println("OK");
	}
	
}
