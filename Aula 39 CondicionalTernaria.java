import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double preço = sc.nextDouble();
		double desconto = (preço > 20.00)? preço * 0.1 : preço * 0.05;
		
				
		System.out.printf(" O valor do desconto R$ %.2f%n ", desconto );

		sc.close();

	}
}




