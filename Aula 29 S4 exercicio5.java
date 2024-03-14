
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double vp1, vp2, vt;
		int cp1, cp2, np1, np2;
		cp1 = sc.nextInt();
		cp2 = sc.nextInt();
		np1 = sc.nextInt();
		np2 = sc.nextInt();
		vp1 = sc.nextDouble();
		vp2 = sc.nextDouble();
		vt = (np1 * vp1) + (np2 * vp2);
		System.out.printf(" VALOR A PAGAR = R$ %.2f%n", vt);

		sc.close();

	}
}

/*
 * 
 * 12 
 * 16 
 * 1 
 * 2 
 * 5.30 
 * 5.10 
 * VALOR A PAGAR = R$ 15.50
 * 
 */