
import java.util.Locale;
import java.util.Scanner;

public class Main { // Abre chaves classe Main //
	/*Anotações da aula, o código está dentro de um bloco 
	  de uma classe, que nesse caso está nomeado como Main, 
	  no exemplo da aula está nomeado como "Programa" */

	public static void main(String[] args) {//Abre chave função //
	/* E nessa linha à cima está uma função da classe Main 
	 * Função nomeada "main", 
	 * É uma função padrão que será inicializada em primeiro lugar. 
	 * Se a classe for um programa executável, precisa iniciar com essa função.*/
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um número! ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(" O número maior é: " + a);
		} 
		else if (b > a && b > c) {
			System.out.println(" O número maior é: " + b);
		}

		else {
			System.out.println(" O numéro maior é: " + c);
		}

		
		sc.close();
		
	}// fecha chaves da função "main"//
	
	/*  A função criada por mim será iniciada 
	no fecha chaves da função padrão */
	
	
	// public: para que a minha função esteja disponível em outras classes //
	// static para que possa ser chamada independente de criar um objeto.//
	
	
}// fecha chaves da classe "Main"//


/*
tela:

 Digite um número! 
5
8
3
 O número maior é: 8
 */
