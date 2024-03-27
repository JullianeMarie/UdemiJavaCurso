
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta = 'S';

		do {
			double celsius = 0;
			System.out.println(" Digite a temperatura em Celsius ");
			celsius = sc.nextInt();
			double fahrenheit = 9 * celsius / 5 + 32;
			System.out.println(" Equivalente em Fahrenheit: " + fahrenheit);
			System.out.println(" Deseja Repetir S/N ");
			resposta = sc.next().charAt(0);
		} while (resposta == 'S');


		sc.close();
	}
}

/*
 Digite a temperatura em Celsius 
 30
 Equivalente em Fahrenheit: 86.0
 Deseja Repetir S/N 
 S
 Digite a temperatura em Celsius 
 86
 Equivalente em Fahrenheit: 186.8
 Deseja Repetir S/N 
 S
 Digite a temperatura em Celsius 
*/