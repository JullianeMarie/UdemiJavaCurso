package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números serão digitados para vetor A e B: ");
		
		int xQtdeNumeros = sc.nextInt();
		int[] listaA = new int[xQtdeNumeros];
		int numeroDigitado = 0;
		
		System.out.println("Digite para vetor A:");
		for (int i = 0; i < xQtdeNumeros; i++) {
			numeroDigitado = sc.nextInt();
			listaA [i] = numeroDigitado;
		}
		
		System.out.println("Números vetor B: ");
		int[] listaB = new int[xQtdeNumeros];
		
		for (int i = 0; i < xQtdeNumeros; i++) {
			numeroDigitado = sc.nextInt();
			listaB [i] = numeroDigitado;
		}
		
		int [] listaC = new int[xQtdeNumeros];
		for (int i = 0; i < xQtdeNumeros; i++) {
			listaC[i] = listaA[i] + listaB[i];
		}

		for ( int i = 0; i < xQtdeNumeros; i++) {
		System.out.println("Soma dos elementos de cada lista: " + listaC[i]);
		}
		
		sc.close();
	}

}
/*
Quantos números serão digitados para vetor A e B: 3
Digite para vetor A:
5
4
7
Números vetor B: 
8
2
5
Soma dos elementos de cada lista: 13
Soma dos elementos de cada lista: 6
Soma dos elementos de cada lista: 12
 */



