package entidades;

public class Products {

	private String nome;
	private double preco;

	public Products(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
______________________________________________________________________
package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entidades.Products;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade entrada");
		int n = sc.nextInt();
		Products[] produtos = new Products[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite nome do produto");
			String nome = sc.next();
			System.out.println("Digite preço do produto");
			double preco = sc.nextDouble();
			produtos[i] = new Products(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += produtos[i].getPreco();
		}

		double media = soma / n;
		System.out.printf("Media preço: %.2f", media);

		sc.close();

	}

}

/*
Quantidade entrada
3
Digite nome do produto
TV
Digite preço do produto
2500.00
Digite nome do produto
GELADEIRA
Digite preço do produto
3000.00
Digite nome do produto
FOGAO
Digite preço do produto
800.00
Media preço: 2100.00
*/