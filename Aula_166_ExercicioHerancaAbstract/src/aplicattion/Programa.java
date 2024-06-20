package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> listaContrb = new ArrayList<>();

		System.out.print("Entre com o numero de taxas para pagamento: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Taxa Pagamento #" + (i + 1) + " dados: ");
			System.out.print("Pessoa Fisica(f) ou Pessoa Juridica(j)? ");
			char tipoPessoa = sc.next().charAt(0);
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a renda anual: ");
			Double rendaAnual = sc.nextDouble();

			if (tipoPessoa == 'f') {
				System.out.print("Gastos saúde: ");
				Double gastosSaude = sc.nextDouble();
				Contribuinte pF = new PessoaFisica(nome, rendaAnual, gastosSaude);
				listaContrb.add(pF);
			}

			if (tipoPessoa == 'j') {
				System.out.print("Número de funcionários: ");
				Integer nFuncionarios = sc.nextInt();
				Contribuinte pJ = new PessoaJuridica(nome, rendaAnual, nFuncionarios);
				listaContrb.add(pJ);
			}
		}

		System.out.println();
		double soma = 0.0;
		System.out.println("Taxas para Pagamento: ");
		for (Contribuinte contribuinte : listaContrb) {
			double taxa = contribuinte.totalImposto();
			System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f", contribuinte.totalImposto()));
			soma += taxa;
		}

		System.out.println();
		System.out.println("Total Taxas: R$ " + String.format("%.2f", soma));

		sc.close();
	}
}
