package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos números reais serão digitados: ");
		int xQtdeNumeros = sc.nextInt();
		double[] numerosReais = new double[xQtdeNumeros];

		for (int i = 0; i < xQtdeNumeros; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: " );
			numerosReais[i] = sc.nextDouble();
		}
		
		double maiorNumero = numerosReais[0];
		int posicaoMaiorNumero = 0;
		for (int i = 0; i < xQtdeNumeros; i++) {
			if (numerosReais[i] > maiorNumero) {
				maiorNumero = numerosReais[i];
				posicaoMaiorNumero = i;
			}		
		}
		
		System.out.println("O maior número da lista é: " + maiorNumero);
		System.out.println("Posição: " + (posicaoMaiorNumero + 1));
		

		sc.close();
	}

}

/*
Digite quantos números reais serão digitados: 3
Digite o 1º número: 5.6
Digite o 2º número: 2.3
Digite o 3º número: 10.5
O maior número da lista é: 10.5
Posição: 3
*/
