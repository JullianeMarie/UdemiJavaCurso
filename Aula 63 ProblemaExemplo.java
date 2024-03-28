
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite as três medidas do Triângulo X -> ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		System.out.println(" Digite as três medidas do Triângulo Y -> ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();

		double px = (xa + xb + xc) / 2;
		double py = (ya + yb + yc) / 2;

		double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
		double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));

		System.out.printf(" Área do Triangulo X = %.2f%n", areax);
		System.out.printf(" Área do Triangulo Y = %.2f%n", areay);

		if (areax > areay) {
			System.out.println(" Triangulo X área é maior");
		} else {
			System.out.println(" Triangulo Y área é maior");
		}

		sc.close();


/*
TELA
 Digite as três medidas do Triângulo X -> 
3.00
4.00
5.00
 Digite as três medidas do Triângulo Y -> 
7.50
4.50
4.02
 Área do Triangulo X = 6.00
 Área do Triangulo Y = 7.56
 Triangulo Y área é maior

Exercício sem orientação à objeto!!!!!
*/
