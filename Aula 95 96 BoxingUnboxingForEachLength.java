package aplicattion;

import java.util.Locale;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 20;
		System.out.println(x);
		// boxing
		Object obj = x;
		System.out.println(obj);
		
		// unboxing
		int y = (int) obj;
		System.out.println(y);
		System.out.println("_________________________________________");
		
		String[] vetor = new String[] {"Maria", "Luiza", "Beatriz"};
		
		// length atributo java, utlizado para determinar o tamanho do array
		for (int i = 0; i < vetor.length; i++ ) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("__________________________________________");
		
		// loop for each
		for (String objeto : vetor) {
			System.out.println(objeto);
		}
		
				
		sc.close();
	}

}

/*
20
20
20
Maria
Luiza
Beatriz
__________________________________________
Maria
Luiza
Beatriz
*/
