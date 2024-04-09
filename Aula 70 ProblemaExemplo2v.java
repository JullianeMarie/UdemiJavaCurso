
package valores;

public class Circunferencia {
	
	public final double PI = 3.14159;
	
	public double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3;
	}

}




import java.util.Locale;
import java.util.Scanner;
import valores.Circunferencia;
public class Main {
	
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Circunferencia valores = new Circunferencia(); 
		
		
		System.out.println("Digite um raio: ");
		double raio = sc.nextDouble();
		double c = valores.circunferencia(raio);
		double v = valores.volume(raio);

		System.out.printf("Circunferência %.2f%n", c);
		System.out.printf("Volume %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", valores.PI);

		sc.close();

	}

}



