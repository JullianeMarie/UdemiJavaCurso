
package estudante;

public class DadosEstudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double total;
	
	public String nomeEstudante() {
		return nome;
	}

	public double notasTrimestre() {
		total = nota1 + nota2 + nota3;
		return total;
	}

	public double resultado() {
		if (total >= 60) {
			System.out.println("Aprovado");
		} 
		else if (total < 60) {
			total = 60 - total;
		System.out.println("Não Aprovado");
		System.out.print("Faltou: ");
		}	
			
		return total;

		}
		
	}

_____________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import estudante.DadosEstudante;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosEstudante estudante = new DadosEstudante();

		System.out.println("Digite nome do estudante");
		estudante.nome = sc.nextLine();
		System.out.println("Nota primeiro trimestre");
		estudante.nota1 = sc.nextDouble();
		System.out.println("Nota segundo trimestre");
		estudante.nota2 = sc.nextDouble();
		System.out.println("Nota segundo trimestre");
		estudante.nota3 = sc.nextDouble();

		System.out.println(estudante.nome);

		System.out.println("Nota final: " + estudante.notasTrimestre());

		System.out.println(estudante.resultado());

		sc.close();

	}
}

/*
TELA
Digite nome do estudante
Julliane
Nota primeiro trimestre
12
Nota segundo trimestre
12
Nota segundo trimestre
12
Julliane
Nota final: 36.0
Não Aprovado
Faltou: 24.0
*/

