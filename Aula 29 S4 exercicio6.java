
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	double A, B, C, areaP, areaT, areaR, areaC, areaQ; 

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaP = A * C / 2.0;
		areaC = 3.14159 * C * C;
		areaT = (A + B) / 2.0 * C;
		areaQ = B * B;
		areaR = A * B;
		
		System.out.printf(" A area do Triangulo é: %.3f%n" , areaP);
		System.out.printf(" A area do Circulo é: %.3f%n" , areaC);
		System.out.printf(" A area Trapézio é: %.3f%n" , areaT);
		System.out.printf(" A area do Quadrado é: %.3f%n" , areaQ);
		System.out.printf(" A area do Retangulo é: %.3f%n" , areaR);
		
		sc.close();
		
	}
}
/*
3.0
4.0
5.2
A area do Triangulo é: 7.800
 A area do Circulo é: 84.949
 A area Trapézio é: 18.200
 A area do Quadrado é: 16.000
 A area do Retangulo é: 12.000
 */
