package aplicattion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		System.out.println("Começo do programa");
		metodo1();
		System.out.println("Fim do programa");
	
	
	}
	
	public static void metodo1() {
		System.out.println("***Inicio Método 1***");
		metodo2();
		System.out.println("***Fim Método 1***");
	}
	
	public static void metodo2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***Inicio Metodo 2***");
		try {
			System.out.println("- Digite 3 nomes: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.println("- Digite uma posição: ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao - 1]); //vetores iniciam 0
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		}
		
		sc.close();
		System.out.println("***Fim Método 2***");
	}

}

/*
Começo do programa
***Inicio Método 1***
***Inicio Metodo 2***
- Digite 3 nomes: 
lu bia ju
- Digite uma posição: 
4
Posição inválida
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at Curso_Nelio_Alves/aplicattion.Programa.metodo2(Programa.java:35)
	at Curso_Nelio_Alves/aplicattion.Programa.metodo1(Programa.java:22)
	at Curso_Nelio_Alves/aplicattion.Programa.main(Programa.java:14)
*/

/*         
 * Exception gerado no método 2
 * Criado método 1 que chama método 2
 * Programa principal chama método 1 
 * Assim eu possuo o caminho percorrido até gerar a minha exceção.
 * O stackTrace permite que toda chamada de métodos seja listada. 
 * Por padrão caso o tryCatch não seja usado para tratar a exceção.
 * O programa será interrompido e mesmo assim o stackTrace irá pontuar as exceções.
 * 
 * */
