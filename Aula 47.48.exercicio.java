
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println(" Senha Inválida ");
			System.out.println(" Digite Novamente ");
			senha = sc.nextInt();
		}

		if (senha == 2002) {
			System.out.println(" Acesso Permitido ");
		}

		sc.close();

	}
}
/*
CONSOLE
2832
 Senha Inválida 
 Digite Novamente 
2855
 Senha Inválida 
 Digite Novamente 
4528
 Senha Inválida 
 Digite Novamente 
54548
 Senha Inválida 
 Digite Novamente 
2002
 Acesso Permitido 
*/