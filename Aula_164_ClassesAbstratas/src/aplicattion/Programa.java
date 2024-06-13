package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Conta conta1 = new Conta(1000, "Julliane", 1000.0); SuperClasse abstrata não instância.
		//Conta conta2 = new ContaEmpresarial(1001, "Pitanga", 1000.0, 5000.0);
		//Conta conta3 = new ContaPoupanca(1002, "Theodoro", 1000.0, 0.01);
		
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaEmpresarial(1001, "Pitanga", 1000.0, 5000.0));
		lista.add(new ContaPoupanca(1002, "Theodoro", 1000.0, 0.01));
		lista.add(new ContaEmpresarial(1003, "Amora", 1800.0, 5000.0));
		lista.add(new ContaPoupanca(1004, "Orion", 2000.0, 0.01));
		
		double soma = 0.0;
		
		for (Conta conta : lista ) {
			soma += conta.getSaldo();
		}
		
		System.out.printf("Total saldo: %.2f%n", soma);
		
		for (Conta conta : lista ) {
			conta.depositoConta(100.0);
		}
		
		for (Conta conta : lista ) {
			System.out.printf("Atualização saldo %d: %.2f%n", conta.getNumeroConta(), conta.getSaldo() );
		}
		
		
		
		
		sc.close();
	}
}


