package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite número de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite número de colunas: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		System.out.println("Digite números inteiros para armazenar na matriz: ");
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Tabela formada: ");
		System.out.println("___________________________________");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			
			System.out.println();
		}

		System.out.println("___________________________________");
		System.out.print("Digite um número da tabela: ");
		int x = sc.nextInt();
		boolean encontrado = false;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == x) {
					encontrado = true;
					System.out.println("Valor " + x + " encontrado na posição [" + i + "][" + j + "]");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + matriz[i - 1][j]);
					}
					if (j < n - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < m - 1) {
						System.out.println("Abaixo: " + matriz[i + 1][j]);
					}

				}

			}

		}

		if (!encontrado) {
			System.out.println("Valor " + x + " não encontrado na matriz.");
		}

		sc.close();
	}
}

/*
Digite número de linhas: 3
Digite número de colunas: 4
Digite números inteiros para armazenar na matriz: 
10
8
15
12
21
11
23
8
14
5
13
19

Tabela formada: 
___________________________________
10	8	15	12	
21	11	23	8	
14	5	13	19	
___________________________________
Digite um número da tabela: 8
Valor 8 encontrado na posição [0][1]
Esquerda: 10
Direita: 15
Abaixo: 11
Valor 8 encontrado na posição [1][3]
Esquerda: 23
Acima: 12
Abaixo: 19
*/
