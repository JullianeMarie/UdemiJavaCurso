package aplicattion;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta(1018,"Julliane Marie" , 0.0);
		ContaEmpresarial contaEmp = new ContaEmpresarial(2020, "Angelo Franzon", 0.0, 10000.00);		
		
		//UPCASTING
		
		Conta conta1 = contaEmp; // Objeto da Subclasse sendo atribuído a uma variável SuperClasse.
		// Em herança podemos confirmar que ContaEmporesarial É UMA Conta. 
		Conta conta2 = new ContaEmpresarial(2021, "Pitanga Maria", 0.0, 2000.00);
		//Atribuição do objeto da Subclasse para SuperClasse. ContaEmporesarial É UMA Conta. 
		Conta conta3 = new ContaPoupanca(2032, "Bianca Maria", 0.0, 0.01);
		//Conta poupança é uma conta.
		
		//DOWNCASTING
		
		/*
		 * ContaEmpresarial conta4 = conta2; Imcompatibilidade de tipos, não posso
		 * converter SuperClasse para Subclasse.Já que conta2 é uma Conta, mesmo ter sido
		 * instânciada como ContaEmpresarial o seu tipo é Conta.Não é uma conversão segura
		 * podendo ocorrer ClassCastExcepetion 
		 *
		 */
		
		//CASTING MANUAL PARA FAZER A CONVERSÃO DE FORMA CORRETA.
		
		ContaEmpresarial conta4 = (ContaEmpresarial) conta2;
		conta4.emprestimo(100.0);
		/* 
		 * Dessa forma posso por meio da variável conta4 chamar o método 
		 * empréstimo do Tipo Conta Empresarial sendo aceito pelo copilador.      
		 *
		 */
		
		/* 
		 * ContaEmpresarial conta5 =  (ContaEmpresarial)conta3;
		 *
		 *	Ao executar mesmo o copilador não notando o erro.
		 * 	Exception in thread "main" java.lang.ClassCastException: class entidades.
		 * 	ContaPoupanca cannot be cast to class entidades.ContaEmpresarial 
		 * 	(entidades.ContaPoupanca and entidades.ContaEmpresarial are in module Curso_Nelio_Alves of loader 'app')
		 * 	at Curso_Nelio_Alves/aplicattion.Programa.main(Programa.java:49)
		 *	Esse erro ocorre devido conta3 ser do tipo Conta e não Conta Empresarial
		 *	
		 */
		
		//PARA EVITAR ERROS DE DOWNCASTING USANDO OPERADOR instanceof
		
		if (conta3 instanceof ContaEmpresarial) {
			/* Se o que tiver na variável conta3 for um objeto que seja 
			 * instância de ContaEmpresarial. Faça o casting
			 */
			ContaEmpresarial conta5 = (ContaEmpresarial) conta3;//Casting
			conta5.emprestimo(500.00);
			System.out.println("Empretimo");
		}
		
		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca) conta3;
			conta5.depositoConta(1500.00);
			System.out.println("Atualização");
		}
		
		sc.close();
	}
}

______________________________________________________________________________________________________________________________________

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
		saldo -= valor;
	}
	
	public void depositoConta (Double valor) {
		saldo += valor;
	}

}
___________________________________________________________

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
}

_____________________________________________________________________________________________________________

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
	
}
