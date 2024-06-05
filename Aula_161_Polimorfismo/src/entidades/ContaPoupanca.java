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
