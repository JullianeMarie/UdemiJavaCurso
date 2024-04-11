package entidades;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada de alturas");
		int n = sc.nextInt();
		double[] alturas = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite a altura");
			alturas[i] = sc.nextDouble(); 
		}
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += alturas[i]; 
		}
		
		System.out.printf("Soma alturas: %.2f", soma);
		System.out.println();
		
		double media = soma / n;
		
		System.out.printf("Média Alturas: %.2f", media);
		
	
		
		sc.close();
		
	}

}

/*Entrada de alturas
3
Digite a altura
1.65
Digite a altura
1.56
Digite a altura
1.72
Soma alturas: 4.93
Média Alturas: 1.64
*/

