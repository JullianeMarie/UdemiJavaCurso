package aplicattion;

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
		
		Conta conta1 = new Conta(2326, "Julliane", 100.00);
		Conta conta2 = new ContaPoupanca(2566, "Marie", 100.00, 0.01);
		
		conta1.saqueConta(50.0);
		conta2.saqueConta(50.0);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
		sc.close();
	}
}

