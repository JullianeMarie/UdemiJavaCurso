
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario, imposto = 0;
		salario = sc.nextDouble();

		if (salario <= 2000.00) {
			imposto = 0.0;
			System.out.println(" ISENTO ");
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		} else if (salario < 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else if (salario > 4500.00) {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		System.out.printf(" Valor a cobrar R$ %.2f%n  ", imposto);

		sc.close();
	}
}

/*
 * 4520.00 
 * Valor a cobrar R$ 355.60
 */