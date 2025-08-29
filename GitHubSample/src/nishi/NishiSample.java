package nishi;

public class NishiSample {
	public static void main(String[] args) {
		int a = 0;
		int b =10;
		
		int c = a++ + --b + ++a + (b += (a += 3));
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.print("a + b + c = ");
		System.out.println(a + b + c);
	}
}
