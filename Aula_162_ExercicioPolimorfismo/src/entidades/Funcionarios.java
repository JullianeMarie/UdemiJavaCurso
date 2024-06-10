package entidades;

public class Funcionarios {
	
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	
	public Funcionarios() {
	}

	public Funcionarios(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento () {
		return horas * valorPorHora;
	}	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pagamento: \n");
		sb.append(getNome() +  " - R$ " + pagamento());
		return sb.toString();
	}
}
