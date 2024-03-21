

package entities;/* Triangulo é uma entidade e é representado por classe*/

public class Triangle { /* Classe Triangulo possui 3 atributos */
	/*
	 * Triangle é um tipo como double Triagle é composto pois possui 3 atributos
	 * assim como double
	 */

	// Membros = Atributos da classe: a,b,c
	public double a;
	public double b;
	public double c;

	/*
	 * A variável X ela aponta para um objeto, E o objeto é composto por 3 atributos
	 * a,b,c
	 */
	public double area() {
		/*
		 * "area ()"Não recebe parâmetro dentro da classe pois já está declarado no tipo
		 * Triangle, que no caso é a, b, c
		 */
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		

	}

}


package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	Triangle x,y;
	x = new Triangle();
	y = new Triangle();
	
	System.out.println(" Digite as medidas de X");
	x.a = sc.nextDouble();
   	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	System.out.println(" Digite as medidas de Y");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf(" Triangulo X: area: %.4f%n", areaX);
	System.out.printf(" Triangulo Y: area: %.4f%n", areaY);
	
	if (areaX > areaY) {
		System.out.println(" Triangulo X possui área maior");
	}
	else {
		System.out.println(" Traiangulo Y possui área maior");
	}
	
	sc.close();
	}

}


