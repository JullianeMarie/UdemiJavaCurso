package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade do index do array: ");
		int xQtdeNumeros = sc.nextInt();
		int[] numerosInteiros = new int[xQtdeNumeros];

		System.out.println("Digite os números inteiros de acordo com o index: ");
		for (int i = 0; i < xQtdeNumeros; i++) {
			numerosInteiros[i] = sc.nextInt();
		}

		int somaPares = 0;
		int xQtdePares = 0;
		boolean encontrouPar = false;

		for (int i = 0; i < xQtdeNumeros; i++) {
			if (numerosInteiros[i] % 2 == 0) {
				somaPares += numerosInteiros[i];
				xQtdePares++;
				encontrouPar = true;
			}
		}

		if (!encontrouPar) {
			System.out.println("NENNHUM PAR DIGITADO");
		} else {
			System.out.printf("Soma Pares: %.1f", (double) somaPares);
			System.out.println();
			if (xQtdePares != 0) {
				double mediaPares = (double) somaPares / xQtdePares;
				System.out.printf("Media Pares: %.1f", (double) mediaPares);
			} 
		}

		sc.close();
	}

}

/*
Digite a quantidade do index do array: 
6
Digite os números inteiros de acordo com o index: 
6
4
9
1
8
4
Soma Pares: 22.0
Media Pares: 5.5
 */
