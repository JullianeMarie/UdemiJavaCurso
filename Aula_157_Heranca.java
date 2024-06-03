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

______________________________________________________________________

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
