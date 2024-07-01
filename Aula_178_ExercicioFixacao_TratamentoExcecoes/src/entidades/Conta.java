package entidades;

import entidades.exceptions.BusinessException;

public class Conta {

	private Integer numeroConta;
	private String titular;
	protected  Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}
	
	public Conta(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
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

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void saqueConta (Double valor) {
		validaSaque(valor);
		saldo -= valor;
	} 
	
	public void depositoConta (Double valor) {
		saldo += valor;
	}
	
	public void validaSaque (Double valor)  {
		if (valor > getLimiteSaque()) {
			throw new BusinessException("Erro Saque: Valor excede o limite de saque");
		}
		if (valor > getSaldo()) {
			throw new BusinessException("Erro Saque: Saldo Insuficiente");
		}
	}
}
