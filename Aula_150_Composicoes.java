package entidades;

public enum NivelTrabalhador {

	JUNIOR,
	PLENO,
	SENIOR;
	 
}

____________________________________________________

package entidades;

public class Departamento {

	private String nome;
	
	public Departamento() {
	}

	public Departamento (String nome) { 
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	  
}

___________________________________________________

package entidades;

import java.util.Date;

public class HoraContrato {
	private Date date;
	private Double valorPorHora;
	private Integer horas;

	public HoraContrato() {
	}

	public HoraContrato(Date date, Double valorPorHora, Integer horas) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double valorTotal() {
		return valorPorHora * horas;

	} 
}

________________________________________________________________________________________


package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FichaTrabalhador {
	private String nome;
	private NivelTrabalhador level;
	private Double salarioBase;
	
	private Departamento departamento;                                                                                                                                        
	private List<HoraContrato> contratos = new ArrayList<>();//Instancia nos atributos e não declaro no construtor
	
	public FichaTrabalhador() {
	}

	public FichaTrabalhador(String nome, NivelTrabalhador level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getLevel() {
		return level;
	}

	public void setLevel(NivelTrabalhador level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contratos;
	}

	public void setContrato(List<HoraContrato> contrato) {
		this.contratos = contrato;
	}
	
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);	
	}
	 
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(Integer ano, Integer mes ) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (HoraContrato c : contratos) {
			cal.setTime(c.getDate());
			int c_mes = 1 +  cal.get(Calendar.MONTH);
			int c_ano = cal.get(Calendar.YEAR);
			
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}

__________________________________________________________________________________


package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.FichaTrabalhador;
import entidades.HoraContrato;
import entidades.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// PARTE I - ENTRANDO COM OS OBJETOS - FICHA TRABALHADOR
		System.out.print("Entrar com o nome do Departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("**Entrar com os dados do trabalhador**");
		System.out.print("Nome: ");
		String nomeWorker = sc.nextLine();

		// Tratamento de entrada de String com letras minúsculas e nome diferente
		NivelTrabalhador level = null;
		String levelWorker = null;
		while (level == null) {
			System.out.print("Level: ");
			levelWorker = sc.nextLine().toUpperCase();// Minuscula para maiuscula
			try {
				level = NivelTrabalhador.valueOf(levelWorker);
			} catch (IllegalArgumentException e) { // Palavra diferente enum
				System.out.println("Entrada inválida. Entrar com level: JUNIOR, PLENO ou SENIOR.");
			}
		}

		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		sc.nextLine();

		// PARTE II - INSTANCIAÇÃO CLASSE FICHA TRABALHADOR COM OS OBJETOS
		FichaTrabalhador trabalhador = new FichaTrabalhador(nomeWorker, NivelTrabalhador.valueOf(levelWorker),
				salarioBase, new Departamento(departamentoNome));

		// PARTE III - ARMAZENAR DADOS DOS CONTRATOS
		System.out.print("Entrar com os contratos do trabalhador: ");
		int nContratos = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i < nContratos + 1; i++) {
			System.out.println("_____________________________________");
			System.out.println("Entrar com contrato #" + i);

			SimpleDateFormat fData = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Data: DD/MM/AAAA: ");
			String sData = sc.nextLine();
			Date data = null;
			try {
				data = fData.parse(sData);
			} catch (ParseException e) {
				System.out.println("Formato data inválido. Use dd/MM/yyyy.");
				i--; // Garante que o contrato seja pedido novamente.
				continue;
			}

			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			System.out.print("Duração (horas): ");
			Integer horas = sc.nextInt();
			sc.nextLine();

			HoraContrato contrato = new HoraContrato(data, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}

		// PARTE IV - CALCÚLO HORA POR DATA (MÊS)
		System.out.println();
		System.out.print("Entrar com mês e ano para calcular a renda(MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda " + mesAno + ": " + trabalhador.renda(ano, mes));

		sc.close();
	}
}

	