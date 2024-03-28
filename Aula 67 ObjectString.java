
import java.util.Locale;
import java.util.Scanner;

import dadosProduto.DadosTv;

public class Main {

public static void main(String[] args) {

// TODO Auto-generated method stub //

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

DadosTv dadosProduto = new DadosTv();
System.out.println("Insira os dados do produto: ");
System.out.print("Nome: ");
dadosProduto.nome = sc.nextLine();
System.out.print("Preço: ");
dadosProduto.preco = sc.nextDouble();
System.out.print("Quantidade estoque: ");
dadosProduto.quantidade = sc.nextInt();
	

System.out.println(dadosProduto.toString());


sc.close();

	}
}

//CLASSE
import java.util.Locale;
import java.util.Scanner;
import dadosProduto.DadosTv;

public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub //

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

DadosTv dadosProduto = new DadosTv();
System.out.println("Insira os dados do produto: ");
System.out.print("Nome: ");
dadosProduto.nome = sc.nextLine();
System.out.print("Preço: ");
dadosProduto.preco = sc.nextDouble();
System.out.print("Quantidade estoque: ");
dadosProduto.quantidade = sc.nextInt();

System.out.println(dadosProduto.toString());


sc.close();

	}
}

/*
TELA
Insira os dados do produto:
Nome: tv
Preço: 900.00
Quantidade estoque: 10
tv
*/

//CLASSE

package dadosProduto;

public class DadosTv {

	public String nome;
	public double preco;
	public int quantidade;// Atributo

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) { // Parametro do Método
		this.quantidade += quantidade;
		/*
		 * this: alto referência para o objeto, já que parametro e metodo possui o mesmo
		 * nome quando coloca-se this está sendo explicito que é o atributo.
		 */
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco)// Usado para imprimir duas casas pós virgula
				+ ", " + quantidade + " unidades,Total R$ " + String.format("%.2f", valorTotalEstoque());

	}
}

//PROGRAMA

import java.util.Locale;
import java.util.Scanner;

import dadosProduto.DadosTv;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosTv dadosProduto = new DadosTv();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		dadosProduto.nome = sc.nextLine();
		System.out.print("Preço: ");
		dadosProduto.preco = sc.nextDouble();
		System.out.print("Quantidade estoque: ");
		dadosProduto.quantidade = sc.nextInt();

		System.out.println(dadosProduto);

		sc.close();

	}
}

/*
TELA
Insira os dados do produto:Nome:
tv Preço:900.00
Quantidade estoque:10 tv,R$900.00,10 unidades,Total R$ 9000.00
*/

//PROGRAMA
import java.util.Locale;
import java.util.Scanner;
import dadosProduto.DadosTv;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub //
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosTv dadosProduto = new DadosTv();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		dadosProduto.nome = sc.nextLine();
		System.out.print("Preço: ");
		dadosProduto.preco = sc.nextDouble();
		System.out.print("Quantidade estoque: ");
		dadosProduto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Dados Produto " + dadosProduto);
		System.out.println();
		System.out.println(" Entre com o número de produtos para adicionar no estoque");
		int quantidade = sc.nextInt();
		dadosProduto.addProdutos(quantidade);

		System.out.println();
		System.out.println(" Dados atualizados " + dadosProduto);

		System.out.println();
		System.out.println(" Entre com o número de produtos para remover no estoque");
		quantidade = sc.nextInt();
		dadosProduto.removerProdutos(quantidade);

		System.out.println();
		System.out.println(" Dados atualizados " + dadosProduto);

		sc.close();

	}
}

/*
TELA

Insira os dados do produto:Nome:
TV Preço:900.00
Quantidade estoque:10

Dados Produto TV,R$900.00,10 unidades,
Total R$ 9000.00

Entre com
o número
de produtos
para adicionar
no estoque 5

Dados atualizados TV,R$900.00,15 unidades,
Total R$ 13500.00

Entre com
o número
de produtos
para remover
no estoque 3

Dados atualizados TV,R$900.00,12 unidades,Total R$
10800.00
*/