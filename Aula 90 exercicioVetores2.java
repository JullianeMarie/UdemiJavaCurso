package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite vezes de entrada: ");
		int xEntrada = sc.nextInt();
		double[] numeros = new double[xEntrada];
		double soma = 0.0;
		double media = 0.0;

		for (int i = 0; i < xEntrada; i++) {
			System.out.print("Digite o " + (i + 1) + "º número real: ");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}

		System.out.println("\nElementos do vetor: ");
		for (int i = 0; i < xEntrada; i++) {
			System.out.println(numeros[i]);
		}

		media = soma / xEntrada;

		System.out.printf("Soma dos elementos: %.2f", soma);
		System.out.println();
		System.out.printf("Média dos elementos: %.2f ", media);

		sc.close();
	}

}

/*
Digite vezes de entrada: 
3
Digite o 1º número real: 5.60
Digite o 2º número real: 13.50
Digite o 3º número real: 10.50

Elementos do vetor: 
5.6
13.5
10.5
Soma dos elementos: 29.60
Média dos elementos: 9.87 
*/