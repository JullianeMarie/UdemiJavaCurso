
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double raio1, raio2, raio3, area1, area2, area3;
		raio1 = sc.nextDouble();
		raio2 = sc.nextDouble();
		raio3 = sc.nextDouble();
		area1 = 3.14159 * Math.pow(raio1, 2.0);
		area2 = 3.14159 * Math.pow(raio2, 2.0);
		area3 = 3.14159 * Math.pow(raio3, 2.0);

		System.out.printf(" Area 1 é igual: %.4f%n", area1);
		System.out.printf(" Area 2 é igual: %.4f%n", area2);
		System.out.printf(" Area 3 é igual: %.4f%n", area3);

		sc.close();

	}
}

/*
 * 2.00 100.64 150.00 Area 1 é igual: 12.5664 
 * Area 2 é igual: 31819.3103 
 * Area 3 é igual: 70685.7750
 */
