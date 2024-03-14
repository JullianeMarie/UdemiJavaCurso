EXEMPLO IF/ELSE E SWITCH/CASE


import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String dia;
		int x = sc.nextInt();

		if (x == 1) {
			dia = " domingo";
		} else if (x == 2) {
			dia = " segunda ";
		} else if (x == 3) {
			dia = " terça ";
		} else if (x == 4) {
			dia = " quarta ";
		} else if (x == 5) {
			dia = " quinta ";
		} else if (x == 6) {
			dia = " sexta ";
		} else if (x == 7) {
			dia = " sábado ";
		} else {
			dia = "Fora do Intervalo";
		}

		System.out.println(" Dia da semana " + dia);

		sc.close();

	}
}

7
 Dia da semana  sábado 



import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String dia;
		int x = sc.nextInt();

		switch (x) {
		
		case 1:
			dia = " Domingo ";
			break;
		case 2:
			dia = " Segunda ";
			break;
		case 3:
			dia = " Terça ";
			break;
		case 4:
			dia = " Quarta ";
			break;
		case 5:
			dia = " Quinta ";
			break;
		case 6:
			dia = " Sexta ";
			break;
		case 7:
			dia = " Sábado ";
		break;
		default:
			dia = " Fora do Intervalo ";
		break;
		}
		System.out.println(" Dia da semana " + dia);
		
		sc.close();

	}
}
