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
		int[] numeros = new int[xEntrada]; 
		
		for (int i = 0; i<xEntrada; i++) {
			int n;
			do {	
				System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
				n = sc.nextInt();
				if (n > 10) {
					System.out.println("Número deve ser menor que 10 - (digite novamente)");
				}
			} while (n > 10);
			numeros[i] = n;
		}
		
		System.out.println("Números negativos lidos: ");
		for (int i = 0; i < xEntrada; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}

		sc.close();
	}

}


/*
Digite vezes de entrada: 
3
Digite o 1º número inteiro: 56
Número deve ser menor que 10 - (digite novamente)
Digite o 1º número inteiro: 56
Número deve ser menor que 10 - (digite novamente)
Digite o 1º número inteiro: 1
Digite o 2º número inteiro: -1
Digite o 3º número inteiro: -2
Números negativos lidos: 
-1
-2

*/