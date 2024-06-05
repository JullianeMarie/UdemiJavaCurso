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
