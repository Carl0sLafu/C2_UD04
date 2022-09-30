
public class C2_UD04_05_App {

	public static void main(String[] args) {
		
		int a = 30, b = 10, c = 20, d = 40;
		
		System.out.println("Valor de A = " + a);
		System.out.println("Valor de B = " + b);
		System.out.println("Valor de C = " + c);
		System.out.println("Valor de D = " + d + "");
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("Valor de A = " + a);
		System.out.println("Valor de B = " + b);
		System.out.println("Valor de C = " + c);
		System.out.println("Valor de D = " + d);

	}

}
