
public class UD4_5APP {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 25;
		int c = 32;
		int d = 15;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
