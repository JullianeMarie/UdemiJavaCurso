package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int xPessoas = sc.nextInt();

		Pessoa[] pessoasLista = new Pessoa[xPessoas];
		double altura = 0.0;
		char genero;
		
		
		for (int i = 0; i < xPessoas; i++) {
			System.out.print("Informe a altura da pessoa " + (i + 1)+ ":" + " (metros): ");
			altura = sc.nextDouble();
			System.out.print("Informe o gênero da pessoa " + (i + 1) + ":" + " (M-Maculino | F-Feminino): ");
			genero = sc.next().charAt(0);

			pessoasLista[i] = new Pessoa(altura, genero);
		}

		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Double.MAX_VALUE;
		double somaAlturaMulheres = 0.0;
		int numeroHomens = 0;

		for (Pessoa pessoa : pessoasLista) {
			altura = pessoa.getAltura();
			genero = pessoa.getGenero();

			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			if (genero == 'F' || genero == 'f') {
				somaAlturaMulheres += altura;
			} else if (genero == 'M'|| genero == 'm') {
				numeroHomens++;
			}
		}
        
		int numeroMulheres = xPessoas - numeroHomens;
		if (numeroMulheres > 0) {
			double mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;
		System.out.printf("Média altura mulheres: %.2f metros%n", mediaAlturaMulheres);
		} else {
			System.out.printf("Nenhuma mulher para ser registrada");
		}
		
		System.out.printf("Maior altura: %.2f metros%n", maiorAltura);
		System.out.printf("Menor altura: %.2f metros%n", menorAltura);
		System.out.println("Homens registrados: " + numeroHomens);
		
		
		sc.close();
	}

}

/*
 Digite a quantidade de pessoas: 5
Informe a altura da pessoa 1: (metros): 1.52
Informe o gênero da pessoa 1: (M-Maculino | F-Feminino): f
Informe a altura da pessoa 2: (metros): 1.80
Informe o gênero da pessoa 2: (M-Maculino | F-Feminino): m
Informe a altura da pessoa 3: (metros): 1.72
Informe o gênero da pessoa 3: (M-Maculino | F-Feminino): f
Informe a altura da pessoa 4: (metros): 1.60
Informe o gênero da pessoa 4: (M-Maculino | F-Feminino): f
Informe a altura da pessoa 5: (metros): 1.83
Informe o gênero da pessoa 5: (M-Maculino | F-Feminino): m
Média altura mulheres: 1.61 metros
Maior altura: 1.83 metros
Menor altura: 1.52 metros
Homens registrados: 2
*/
 

