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
