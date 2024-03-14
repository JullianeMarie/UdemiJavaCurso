
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int hora;
		System.out.println(" Que horas são? ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println(" Bom dia ");
		} else if (hora < 18) {
			System.out.println(" Bom tarde ");
		} else {
			System.out.println(" Boa noite ");
		}

		sc.close();
	}
}

/*
 * CONSOLE 
 * Que horas são? 
 * 10 
 * Bom dia
 */