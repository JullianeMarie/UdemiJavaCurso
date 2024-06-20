package aplicattion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
		String[] vect =  sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
		catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		}
		
		System.out.println("Fim do programa");
		
		sc.close();
	}
}


/*

*/
