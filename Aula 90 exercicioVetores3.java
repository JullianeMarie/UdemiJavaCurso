package entidades;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}

__________________________________________________________________________________________

package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantas pessoas serão digitadas: ");
		int xPessoas = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[xPessoas];
		int contaMenores16 = 0;

		for (int i = 0; i < xPessoas; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoa(nome, idade, altura);

			if (idade < 16) {
				contaMenores16++;
			}
		}
		double por100Menores16 = (double)contaMenores16 / xPessoas * 100;
		System.out.printf("Porcentagem menores 16 anos: %.2f", por100Menores16 , "%");
		System.out.println();
		System.out.println("Nome menores de 16 anos: ");
		for (int i = 0; i < xPessoas; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());

			}
		}

		sc.close();
	}

}


/*
Digite quantas pessoas serão digitadas: 3
Dados da 1ª pessoa
Nome: Maria
Idade: 8
Altura: 1.55
Dados da 2ª pessoa
Nome: Bia
Idade: 5
Altura: 1.25
Dados da 3ª pessoa
Nome: Luiza
Idade: 17
Altura: 1.60
Porcentagem menores 16 anos: 66.67
Nome menores de 16 anos: 
Maria
Bia
*/



