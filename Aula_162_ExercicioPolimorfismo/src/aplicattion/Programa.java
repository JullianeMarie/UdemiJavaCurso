package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.FuncionariosTerceirados;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> lista = new ArrayList<>();

		System.out.print("Entrar com número de funcionários: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			System.out.println("Dados funcionário #" + (i + 1) + ":");
			System.out.print("Terceirizado (s/n)?: ");
			char funcTer = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Hora: ");
			Integer hora = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			
			if (funcTer == 's') {
				System.out.print("Digite carga adicional: ");
				Double cargaAdicional = sc.nextDouble();
				Funcionarios func = new FuncionariosTerceirados(nome, hora, valorPorHora, cargaAdicional);
				lista.add(func);
			}

			else {
				Funcionarios func = new Funcionarios(nome, hora, valorPorHora);
				lista.add(func); 
			}
		}

		for (Funcionarios func : lista) {
			System.out.println(func.getNome() + " - Pagamento: R$ " + String.format("%.2f", func.pagamento()));
		}

		sc.close();
	}
}

/*
Entrar com número de funcionários: 3
Dados funcionário #1:
Terceirizado (s/n)?: s
Nome: Julliane Marie
Hora: 72
Valor por hora: 200.00
Digite carga adicional: 100.00
Dados funcionário #2:
Terceirizado (s/n)?: n
Nome: Angelo Franzon
Hora: 72
Valor por hora: 200.00
Dados funcionário #3:
Terceirizado (s/n)?: s
Nome: Pitanga Maria
Hora: 50
Valor por hora: 160.00
Digite carga adicional: 300.00
Julliane Marie - Pagamento: R$ 14510.00
Angelo Franzon - Pagamento: R$ 14400.00
Pitanga Maria - Pagamento: R$ 8330.00 
 */
 
