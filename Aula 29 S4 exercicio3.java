
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferenca;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = (A * B - C * D);
		System.out.println("DIFERENÇA = " + diferenca);

		sc.close();

	}
}

/*
 * 5 
 * 6 
 * -7 
 * 8 
 * DIFERENÇA = 86
 */
