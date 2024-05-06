package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) { //LINHA
			for (int j = 0; j < n; j++) { //COLUNA
				sc.nextLine();
				System.out.println("Digite número para armazenar no vetor " + (i + 1) + " da matriz: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Numéros na Diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}

		int count = 0;
		System.out.println("Números Negativos: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print(count);
		 
		sc.close();
	}
}


/*
Entre com o tamanho da matriz: 
3
Digite número para armazenar no vetor 1 da matriz: 
-5
Digite número para armazenar no vetor 1 da matriz: 
6
Digite número para armazenar no vetor 1 da matriz: 
7
Digite número para armazenar no vetor 2 da matriz: 
-8
Digite número para armazenar no vetor 2 da matriz: 
-9
Digite número para armazenar no vetor 2 da matriz: 
10
Digite número para armazenar no vetor 3 da matriz: 
11
Digite número para armazenar no vetor 3 da matriz: 
-12
Digite número para armazenar no vetor 3 da matriz: 
13
Numéros na Diagonal: 
-5 
-9 
13 
Números Negativos: 
4
*/
