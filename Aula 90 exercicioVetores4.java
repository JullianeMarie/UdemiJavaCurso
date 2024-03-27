package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos números serão digitados: ");
		int xQtdeNumeros = sc.nextInt();
		int[] numerosInteiros = new int[xQtdeNumeros];
		

		for (int i = 0; i < xQtdeNumeros; i++) {
			System.out.print("Digite os números inteiros: ");
			numerosInteiros[i] = sc.nextInt();
		}

		int[] numerosPares = new int[xQtdeNumeros];
		int contador = 0;
		for (int numero : numerosInteiros) {
			if (numero % 2 == 0) {
				numerosPares[contador] = numero;
				contador++;
			}
		}
		System.out.println("Números pares: ");
		for (int i = 0; i < contador; i++) {
			System.out.println(numerosPares[i]);
		}
		System.out.print("Quantidade de números pares: " + contador);
		
		sc.close();
	}

}

/*
Digite quantos números serão digitados: 3
Digite os números inteiros: 5
Digite os números inteiros: 10
Digite os números inteiros: 24
Números pares: 
10
24
Quantidade de números pares: 2
*/
