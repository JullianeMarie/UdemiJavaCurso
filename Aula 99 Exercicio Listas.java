package entidades;



public class Funcionarios {

	private Integer id;
	private String nome;
	private double salario;

	public Funcionarios() {

	}

	public Funcionarios(Integer id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

}

____________________________________________________________________________________

package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// PARTE I

		List<Funcionarios> listaFuncionarios = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados?: ");
		int xFuncionarios = sc.nextInt();
		System.out.println("_________________________________________");

		int id;
		for (int i = 0; i < xFuncionarios; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.println("Digite ID: ");
			id = sc.nextInt();

			// Aprendizado uso 'has'
			while (hasId(listaFuncionarios, id)) {
				System.out.println("ID já informado, digite novamente: ");
				id = sc.nextInt();
			}

			System.out.println("Nome funcionário: ");
			sc.nextLine(); // buffer
			String nome = sc.nextLine();
			System.out.println("Salário funcionário: ");
			double salario = sc.nextDouble();
			listaFuncionarios.add(new Funcionarios(id, nome, salario));

		}

		// PARTE II
		System.out.println("________________________________________________");

		Funcionarios funcionarios = null;

		while (funcionarios == null) {
			System.out.println("Digite o ID funcionário para atualizar salário: ");
			id = sc.nextInt();
			final int idFinal = id;

			if (!hasId(listaFuncionarios, idFinal)) {
				System.out.println("ID não existe");
				continue;
			}
			funcionarios = listaFuncionarios.stream()
					.filter(x -> x.getId() == idFinal)
					.findFirst().orElse(null);
		}

		// PARTE III
		System.out.println("Entrar com a porcentagem: ");
		double porcentagem = sc.nextDouble();
		funcionarios.aumentoSalario(porcentagem);

		System.out.println("_______________________________________________");
		System.out.println("Lista dos Funcionários: ");

		for (Funcionarios obj : listaFuncionarios) {
			System.out.println(obj);
		}

		sc.close();
	}

	// Método para aplicar has
	public static boolean hasId(List<Funcionarios> listaFuncionarios, Integer id) {
		Funcionarios funcionarios = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionarios != null;
	}

}

/*
Quantos funcionários serão registrados?: 
4
_________________________________________
Funcionario #1:
Digite ID: 
211
Nome funcionário: 
Julliane Marie
Salário funcionário: 
4500.00
Funcionario #2:
Digite ID: 
211
ID já informado, digite novamente: 
212
Nome funcionário: 
Angelo Franzon
Salário funcionário: 
6500.00
Funcionario #3:
Digite ID: 
213
Nome funcionário: 
Alex Green
Salário funcionário: 
1500.00
Funcionario #4:
Digite ID: 
214
Nome funcionário: 
Maria Silva
Salário funcionário: 
2500.00
________________________________________________
Digite o ID funcionário para atualizar salário: 
210
ID não existe
Digite o ID funcionário para atualizar salário: 
211
Entrar com a porcentagem: 
20
_______________________________________________
Lista dos Funcionários: 
211, Julliane Marie, 5400.00
212, Angelo Franzon, 6500.00
213, Alex Green, 1500.00
214, Maria Silva, 2500.00
*/
