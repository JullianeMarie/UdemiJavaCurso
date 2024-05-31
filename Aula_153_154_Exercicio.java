package entidades;

public class OrdemItem {

	private Integer quantidade;
	private Double preco;

	private Products produto;

	public OrdemItem() {
	}

	public OrdemItem(Integer quantidade, Double preco, Products produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preco;
	}

	public void setPreço(Double preco) {
		this.preco = preco;
	}

	public Products getProduto() {
		return produto;
	}

	public void setProduto(Products produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return quantidade * preco;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNome() + ": " + "\n");
		sb.append(String.format("%.2f", produto.getPreco()) + "\n");
		sb.append("Quatidade: " + quantidade + "\n");
		sb.append("Subtotal: " + String.format("%.2f", subTotal()));
		return sb.toString();
	}

}
_____________________________________________________________________________________

package entidades;

public class Products {

	private String nome;
	private Double preco;

	public Products(String nome, Double preco) {
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
_______________________________________________________________________________________

package entidades;

public enum OrdemStatus {

	PAGAMENTO_PENDENTE(1), // CONSTANTES
	PROCESSANDO(2), 
	ENVIADO(3), 
	ENTREGUE(4);

	private int valor;

	private OrdemStatus(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}

_______________________________________________________________________________________

package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date dataNascimento;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
	}

	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Nome: " + nome + "\n");
		sb.append("Email: " + email + "\n");
		sb.append("Data Nascimento: " + sdf.format(dataNascimento) + "\n");
		
		return sb.toString();
	}
}
______________________________________________________________________________________

package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;

	private OrdemStatus status;
	private Cliente cliente;
	private List<OrdemItem> itens = new ArrayList<>();

	public Ordem(Date moment, OrdemStatus status, Cliente cliente) {
		this.status = status;
		this.cliente = cliente;
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getItens() {
		return itens;
	}

	public void addItem(OrdemItem item) {
		itens.add(item);
	}

	public void removeItem(OrdemItem item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0.0;
		for (OrdemItem item : itens) {
			soma += item.subTotal();
		}

		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem moment: " + sdf.format(moment) + "\n");
		sb.append("Ordem status: " + status + "\n");
		sb.append("Cliente: " + cliente + "\n");
		sb.append("Ordem Itens: \n");
		for (OrdemItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total preço: " + String.format("%.2f", total()));
		return sb.toString();

	}

}

________________________________________________________________________________________________________________


package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.OrdemStatus;
import entidades.Products;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data Nascimento: (DD/MM/AAAA)");
		Date dataNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("Entrar com os dados do pedido: ");
		System.out.println("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());

		Ordem ordem = new Ordem(new Date(), status, cliente);

		System.out.print("Quantos itens para essa ordem? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Entrar #" + i + " dados: ");
			System.out.print("Nome Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço Produto: ");
			Double precoProduto = sc.nextDouble();

			Products produto = new Products(nomeProduto, precoProduto);

			int quantidade = sc.nextInt();
			OrdemItem ordemItem = new OrdemItem(quantidade, precoProduto, produto);

			ordem.addItem(ordemItem);
		}

		System.out.println();
		System.out.println("Ordem Sumário: ");
		System.out.println(ordem);

		sc.close();
	}
}

/*
Entre com dados do cliente: 
Nome: JULLIANE MARIE
Email: JULLIANE@GMAIL.COM
Data Nascimento: (DD/MM/AAAA): 18/01/1983
Entrar com os dados do pedido: 
Status: PROCESSANDO
Quantos itens para essa ordem? 2
Entrar #1 dados: 
Nome Produto: TV
Preço Produto: 1000.00
Digite a quantidade: 1
Entrar #2 dados: 
Nome Produto: MOUSE
Preço Produto: 40.00
Digite a quantidade: 2

Ordem Sumário: 
Ordem moment: 31/05/2024
Ordem status: PROCESSANDO
Cliente: 
Nome: JULLIANE MARIE
Email: JULLIANE@GMAIL.COM
Data Nascimento: 18/01/1983 00:00:00

Ordem Itens: 
TV: 
1000.00
Quatidade: 1
Subtotal: 1000.00
MOUSE: 
40.00
Quatidade: 2
Subtotal: 80.00
Total preço: 1080.00
*/
