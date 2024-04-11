
package entidade;

public class Products {

private String nome;
private double preco;
private int quantidade;

public Products() {
}

public Products(String nome, double preco, int quantidade) {
this.nome = nome;
this.preco = preco;
this.quantidade = quantidade;
}

public Products(String nome, double preco) {
this.nome = nome;
this.preco = preco;
}
// Por pratica os metodos sao colocados depois dos construtores 

public void setNome(String nome) {
this.nome = nome;
}

public String getNome() {
return nome;
}

public double getPreco() {
return preco;
}

public void setPreco(double preco) {
this.preco = preco;
}

public int getQuantidade() {
return quantidade;
}

public double valorTotalEstoque() {
return preco * quantidade;
}

public void addProdutos(int quantidade) {
this.quantidade += quantidade;
}

public void removerProdutos(int quantidade) {
this.quantidade -= quantidade;
}

public String toString() {
return nome + ", R$"
+ String.format("%.2f", preco)
+ ", " + quantidade
+ " unidades,Total R$ "
+ String.format("%.2f", valorTotalEstoque());

}
}

____________________________________________________________________

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
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();

		Products entidade = new Products(nome, preco);
		entidade.setNome("Computador");// forma correta.
		System.out.println("Atualizacao de nome: " + entidade.getNome());
		entidade.setPreco(1200.00); // aceita um novo valor para o produto.
		System.out.println("Atualizacao do valor: " + entidade.getPreco());

		// entidade.nome = "Computador" 
		/*
		Quando eu coloco metodo ele agora reclama da do atributo nao o reconhece
		por estar private na classe - Alterar classe o m�todo para utilizar, essa
		forma esta como exemplo de erro. De como nao deve ser feito. Apos ter
		criado o metodo na classe
		*/

		System.out.println();
		System.out.println("Dados Produto: " + entidade);
		System.out.println();
		System.out.println("Entre com o numero de produtos para adicionar no estoque");
		int quantidade = sc.nextInt();
		entidade.addProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + entidade);

		System.out.println();
		System.out.println("Entre com o numero de produtos para remover no estoque");
		quantidade = sc.nextInt();
		entidade.removerProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + entidade);

		sc.close();

	}

}

/*
TELA
Insira os dados do produto:
Nome: tv
Pre�o: 900.00
Atualiza��o de nome: Computador
Atualiza��o do valor: 1200.0

Dados Produto: Computador, R$1200.00, 0 unidades,Total R$ 0.00

Entre com o n�mero de produtos para adicionar no estoque
10

Dados atualizados: Computador, R$1200.00, 10 unidades,Total R$ 12000.00

Entre com o n�mero de produtos para remover no estoque
3

Dados atualizados: Computador, R$1200.00, 7 unidades,Total R$ 8400.00
*/