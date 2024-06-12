package aplicattion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Products;
import entidades.ProdutoImportado;
import entidades.ProdutosUsados;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Products> listaProdutos = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Produto #" + (i + 1) + " dados: ");
			System.out.print("Informe: novo/importado/usado (n/i/u): ");
			char tipoProduto = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			if (tipoProduto == 'i') {
				System.out.print("Digite a taxa da alfândega: ");
				Double taxaAlfandega = sc.nextDouble();
				Products produt = new ProdutoImportado(nome, preco, taxaAlfandega);
				listaProdutos.add(produt);
			}

			else if (tipoProduto == 'u') {
				System.out.print("Digite a data de fabricação (dd/mm/aaaa): ");
				LocalDate dataFab = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Products produt = new ProdutosUsados(nome, preco, dataFab);
				listaProdutos.add(produt);

			} else {
				Products produt = new Products(nome, preco);
				listaProdutos.add(produt);

			}
			System.out.println();
		}
		
		System.out.println("RÓTULO PRODUTO");
		for (Products produt : listaProdutos) {
			System.out.println(produt.rotuloPreco());
		}

		sc.close();
	}
}

/*
Entre com o número de produtos: 3
Produto #1 dados: 
Informe: novo/importado/usado (n/i/u): n
Nome: Tv Samsung Galaxy Note 10
Preço: 5000.00

Produto #2 dados: 
Informe: novo/importado/usado (n/i/u): i
Nome: Galaxy Note 13
Preço: 4500.00
Digite a taxa da alfândega: 120.00

Produto #3 dados: 
Informe: novo/importado/usado (n/i/u): u
Nome: Iphone 8
Preço: 2500.00
Digite a data de fabricação (dd/mm/aaaa): 21/10/2021

RÓTULO PRODUTO
Tv Samsung Galaxy Note 10 - R$ 5000.00
Galaxy Note 13 - R$ 4500.00 - (Taxa Alfândega: R$ 120.00)
Iphone 8(usado) - R$ 2500.00 - Data Fabricação: (21/10/2021)
*/
