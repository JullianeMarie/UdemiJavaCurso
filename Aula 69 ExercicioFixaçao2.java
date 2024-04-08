package entidade;

public class DadosFuncionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double salarioLiquido;
	public double porcentagem;
	public double salarioAjuste;
	
		public String nomeFuncionario() {
		return nome;
	}

	public double valorL() {
	double	salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;
	}

	public double ajusteSalario() {
		double salarioAjuste = porcentagem / 100 * salarioBruto;
		salarioAjuste += salarioBruto;
		return salarioAjuste - imposto;
		
		}

	}

_________________________________________________________________________

import entidade.DadosFuncionario;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosFuncionario entidade = new DadosFuncionario();

		System.out.println("Nome: ");
		entidade.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		entidade.salarioBruto = sc.nextDouble();
		System.out.println("Imposto:");
		entidade.imposto = sc.nextDouble();

		System.out.println("Funcionário: " + entidade.nome);

		System.out.println("Salário Liquido: " + entidade.valorL());

		System.out.println("Qual a porcentagem de ajuste de salário ");
		entidade.porcentagem = sc.nextDouble();

		System.out.println(" Dados Atualizados: " + entidade.nome + " , R$ " + entidade.ajusteSalario());

		sc.close();

	}
}


/*
TELA
Nome: 
João Silva
Salario Bruto: 
6000.00
Imposto:
1000.00
Funcionário: João Silva
Salário Liquido: 5000.0
Qual a porcentagem de ajuste de salário 
10
Dados Atualizados: João Silva , R$ 5600.0
*/
