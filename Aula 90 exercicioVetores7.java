package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do array numerosReais[]");
		int xQtdeNumeros = sc.nextInt();
		double[] numerosReais = new double[xQtdeNumeros];

		System.out.println("Digite os elementos(numeros reais): ");
		for (int i = 0; i < xQtdeNumeros; i++) {
			numerosReais[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < xQtdeNumeros; i++) {
			soma += numerosReais[i];
		}

		double media = soma / xQtdeNumeros;
		System.out.printf("Média Vetor: %.3f", media);
		System.out.println();
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < xQtdeNumeros; i++) {
			if (numerosReais[i] < media) {
				System.out.println(numerosReais[i]);
			}
		}

		sc.close();
	}

}

/*
Digite o tamanho do array numerosReais[]
5
Digite os elementos(numeros reais): 
5.66
7.98
3.32
4.56
3.75
Média Vetor: 5.054
Elementos abaixo da média: 
3.32
4.56
3.75
*/



