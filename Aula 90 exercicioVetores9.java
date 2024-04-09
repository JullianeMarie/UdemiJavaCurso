package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantidade de pessoas: ");
		int xPessoas = sc.nextInt();
		String[] nome = new String[xPessoas];
		int[] idade = new int[xPessoas];
		int maiorIdade = 0;
		String nomeMaiorIdade;

		for (int i = 0; i < xPessoas; i++) {
			System.out.print("Digite nome: ");
			nome[i] = sc.next();
			System.out.print("Digite idade: ");
			idade[i] = sc.nextInt();
		}
		
		for (int i = 0; i < xPessoas; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				nomeMaiorIdade = nome[i];
				System.out.println("Nome maior idade: " + nomeMaiorIdade);
			}
		}

		sc.close();
	}

}

/*
Digite quantidade de pessoas: 3
Digite nome: Luiza
Digite idade: 75
Digite nome: Lurdes
Digite idade: 69
Digite nome: Bia
Digite idade: 62
Nome maior idade: Luiza
*/
