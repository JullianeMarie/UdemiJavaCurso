
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int Codigo = sc.nextInt();

		
		while (Codigo != 4) {
			if (Codigo == 1) {
				alcool += 1;
			} 
			else if (Codigo == 2) {
				gasolina += 1;
			}
			else if (Codigo == 3) {
				diesel += 1;
			}
			if (Codigo > 4) {
				System.out.println(" Fora da Faixa Digite Novamente");
		}
		Codigo = sc.nextInt();		
		}
	System.out.println(" Muito Obrigado ");
	System.out.println(" Alcool: " + alcool);
	System.out.println(" Gasolina: " + gasolina);
	System.out.println(" Diesel: " + diesel);

	sc.close();
	}
}


/*
1
2
3
5
 Fora da Faixa Digite Novamente
2
4
 Muito Obrigado 
 Alcool: 1
 Gasolina: 2
 Diesel: 1
*/

