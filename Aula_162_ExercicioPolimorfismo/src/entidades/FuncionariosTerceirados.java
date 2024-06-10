package entidades;

public class FuncionariosTerceirados extends Funcionarios {

	private Double cargaAdicional;

	public FuncionariosTerceirados() {
	super();
	}
	
	public FuncionariosTerceirados(String nome, Integer horas, Double valorPorHora, Double cargaAdicional) {
		super(nome, horas, valorPorHora);
		this.cargaAdicional = cargaAdicional;
	}

	public Double getCargaAdicional() {
		return cargaAdicional;
	}

	public void setCargaAdicional(Double cargaAdicional) {
		this.cargaAdicional = cargaAdicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + cargaAdicional * 1.1;
	}
}
