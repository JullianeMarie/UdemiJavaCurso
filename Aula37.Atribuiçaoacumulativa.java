
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.00;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		System.out.printf(" Valor a pagar: R$ %.2f%n ", conta);

		sc.close();

	}
}
/*
 * 113 
 * Valor a pagar: R$ 76.00
 * Observação: No exemplo usado: conta = conta + ( minutos - 100 ) * 2.0; A
 * atribuição é colocada conta += ( minutos - 100 ) * 2.0;
 */