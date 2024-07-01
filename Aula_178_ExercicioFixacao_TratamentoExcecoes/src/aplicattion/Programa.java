package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.exceptions.BusinessException;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta: ");
		System.out.print("Número: ");
		int numeroConta = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		Double saldoInicial = sc.nextDouble();
		System.out.print("Limite Saque: ");
		Double limiteSaque = sc.nextDouble();

		Conta conta = new Conta(numeroConta, titular, saldoInicial, limiteSaque);

		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		Double saque = sc.nextDouble();

		try {
			conta.saqueConta(saque);
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
		}

		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}

/*
Informe os dados da conta: 
Número: 8021 
Titular: Bob Brown
Saldo Inicial: 500.00
Limite Saque: 300.00

Informe uma quantia para sacar: 100.00
Novo saldo: 400.00
*/

/*
Informe os dados da conta: 
Número: 8021
Titular: Bob Brown
Saldo Inicial: 500.00
Limite Saque: 300.00

Informe uma quantia para sacar: 400.00
Erro Saque: Valor excede o limite de saque
*/

/*
Informe os dados da conta: 
Número: 8021
Titular: Bob Brown
Saldo Inicial: 500.00
Limite Saque: 300.00

Informe uma quantia para sacar: 800.00
Erro Saque: Valor excede o limite de saque
*/

/*
 
 */
 