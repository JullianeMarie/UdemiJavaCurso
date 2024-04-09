//CLASSE - membros estáticos

package valores;

public class Circunferencia {
	
	public static final double PI = 3.14159;
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3;
	}

}

___________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import valores.Circunferencia;
public class Main {
	
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um raio: ");
		double raio = sc.nextDouble();
		double c = Circunferencia.circunferencia(raio);
		double v = Circunferencia.volume(raio);

		System.out.printf("Circunfer�ncia %.2f%n", c);
		System.out.printf("Volume %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", Circunferencia.PI);

		sc.close();

	}
}



