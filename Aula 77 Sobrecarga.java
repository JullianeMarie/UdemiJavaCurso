package entidade;

public class Products {

public String nome;
public double preco;
public int quantidade;

public Products(String nome, double preco, int quantidade) {
this.nome = nome;
this.preco = preco;
this.quantidade = quantidade;
}

public Products(String nome, double preco) {
this.nome = nome;
this.preco = preco;
}

public double valorTotalEstoque() {
return preco * quantidade;
}

public void addProdutos (int quantidade) {
this.quantidade  += quantidade;
}
public void removerProdutos (int quantidade) {
this.quantidade -= quantidade;
}
public String toString() {
return nome
+ ", R$"
+ String.format("%.2f", preco)
+ ", "
+ quantidade
+ " unidades,Total R$ "
+ String.format("%.2f", valorTotalEstoque());

       }
}

________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import entidade.Products;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		Products entidade = new Products(nome, preco);
		System.out.println();
		System.out.println("Dados Produto " + entidade);
		System.out.println();
		System.out.println("Entre com o numero de produtos para adicionar no estoque");
		int quantidade = sc.nextInt();
		entidade.addProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados " + entidade);

		System.out.println();
		System.out.println("Entre com o numero de produtos para remover no estoque");
		quantidade = sc.nextInt();
		entidade.removerProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados " + entidade);

		sc.close();

	}
}


/*

TELA

Insira os dados do produto: 
Nome: tv
Pre�o: 900.00
Dados Produto tv, R$900.00, 0 unidades,Total R$ 0.00
Entre com o n�mero de produtos para adicionar no estoque
10
Dados atualizados tv, R$900.00, 10 unidades,Total R$ 9000.00
Entre com o n�mero de produtos para remover no estoque
3
Dados atualizados tv, R$900.00, 7 unidades,Total R$ 6300.00

 */
