
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double NF, NH, VH, salario;
		NF = sc.nextDouble();
		NH = sc.nextDouble();
		VH = sc.nextDouble();
		salario = (NH * VH);
		System.out.println(" NUMERO = " + NF);
		System.out.printf(" SALARIO = R$%.2f%n", salario);

		sc.close();

	}
}

/*
 * 100 
 * 5.50 
 * NUMERO = 25.0 
 * SALARIO = R$550.00
 */