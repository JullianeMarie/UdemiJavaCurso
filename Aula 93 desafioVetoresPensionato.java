package entidades;

public class Estudantes {

	private String nome;
	private String email;

	public Estudantes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome estudante: " + nome + " \nEmail: " + email;
	}

	
	
}

________________________________________________________________________________


package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entidades.Estudantes;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("PENSIONATO ESTUDANTES - VAGAS 10 QUARTOS");
		System.out.println("****************************************");
		Estudantes[] estudantes = new Estudantes[10];
		
		System.out.println("Quantos estudantes irão alugar os quartos?");
		int vagasQuarto = sc.nextInt();
		
		    for (int i = 1; i <= vagasQuarto; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome do estudante: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email do estudante: ");
			String email = sc.next();
			System.out.print("Quarto desejado: ");
			int quarto = sc.nextInt();
			estudantes[quarto] = new Estudantes(nome, email);
			System.out.println("_________________________________________");
		}
		
		System.out.println("Relatório Pensionato Estudantes");
		for (int i = 0; i < 10; i++) {
			if (estudantes[i] != null ) {
			System.out.println(i + " :\n" + estudantes[i]);
			
			}
		} 
				
				
		sc.close();
	}

}

/*
PENSIONATO ESTUDANTES - VAGAS 10 QUARTOS
****************************************
Quantos estudantes irão alugar os quartos?
5
Aluguel #1:
Nome do estudante: Julia Moreira
Email do estudante: juliamoreira@gmail.com
Quarto desejado: 8
_________________________________________
Aluguel #2:
Nome do estudante: Ana Lima
Email do estudante: analima@gmail.com
Quarto desejado: 2
_________________________________________
Aluguel #3:
Nome do estudante: Jonas Duarte
Email do estudante: jonasduarte@gmail.com
Quarto desejado: 5
_________________________________________
Aluguel #4:
Nome do estudante: Luna Paris
Email do estudante: lunaparis
Quarto desejado: 7
_________________________________________
Aluguel #5:
Nome do estudante: Jaime Lins
Email do estudante: jaimelins@gmail.com
Quarto desejado: 1
_________________________________________
Relatório Pensionato Estudantes
1 :
Nome estudante: Jaime Lins 
Email: jaimelins@gmail.com
2 :
Nome estudante: Ana Lima 
Email: analima@gmail.com
5 :
Nome estudante: Jonas Duarte 
Email: jonasduarte@gmail.com
7 :
Nome estudante: Luna Paris 
Email: lunaparis
8 :
Nome estudante: Julia Moreira 
Email: juliamoreira@gmail.com
*/


