package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta(3202, "Julliane", 1000.00);
		conta1.saqueConta(200.00);
		System.out.println(conta1.getSaldo());
		
		Conta conta2 = new ContaPoupanca(3265, "Theodoro", 1000.00, 0.01); //UPCASTING
		conta2.saqueConta(200.00); //O objeto conta2 recebeu um Upcasting ContaPoupança
		System.out.println(conta2.getSaldo());
		/* 
		 * O método saqueConta sofreu uma sobreposição.
		 * Sendo assim não ocorre desconto de taxa de saque.
		 * 
		*/
		
		Conta conta3 = new ContaEmpresarial(1312, "Marie", 1000.00, 7000.00);
		conta3.saqueConta(200.00);
		System.out.println(conta3.getSaldo());
		/* 
		 * ContaEmpresarial recebeu implementação de SuperClasse Conta
		 * A implementação ocasiona mais uma taxa de 2.0 para saque.
		 */
		
		sc.close();
	}
}

/*
 * 795.0
 * 800.0
 * 793.0
 * 
 */
_______________________________________________________________________________________________

package entidades;

public class Conta {

	private Integer numeroConta;
	private String titular;
	protected  Double saldo;
	
	public Conta() {
	}
	
	public Conta(Integer numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saqueConta (Double valor) {
		saldo -= valor + 5.00;
	}
	
	public void depositoConta (Double valor) {
		saldo += valor;
	}

	
	
}
_________________________________________________________________________

package entidades;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaJuros) {
		super(numeroConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void saldoUpdate() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saqueConta (Double valor) { //SOBREPOSIÇÃO
		saldo -= valor;
	}
}

________________________________________________________________________________________________

package entidades;

public class ContaEmpresarial extends Conta {

	private Double emprestimoLimite;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numeroConta, String titular, Double saldo, Double emprestimoLimite) {
		super(numeroConta, titular, saldo);
		this.emprestimoLimite = emprestimoLimite;
	}

	public Double getEmprestimoLimite() {
		return emprestimoLimite;
	}

	public void setEmprestimoLimite(Double emprestimoLimite) {
		this.emprestimoLimite = emprestimoLimite;
	}

	public void emprestimo(Double valor) {
		if (valor <= emprestimoLimite) {
			saldo += valor - 10.00; 
			/*Saldo com modificador protected permite ser acessado devido:
			  serem do mesmo pacote e também uma subclasse*/
		}
	}
	
	@Override
	public void saqueConta(Double valor) { //SOBREPOSIÇÃO
		super.saqueConta(valor);//Implementação super que tem taxa de 5.00.
		saldo -= 2.0; // Permite descontar mais um valor da taxa 2.00.
	}
}
