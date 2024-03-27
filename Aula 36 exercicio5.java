
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
    
	double resultado = 0;	
	int codigo, quantidade;
		
	    System.out.println(" Digite o código do produto");
	    System.out.println(" 1 - CACHORRO QUENTE ");
	    System.out.println(" 2 - X SALADA ");
	    System.out.println(" 3 - X BACON ");
	    System.out.println(" 4 - TORRADA SIMPLES ");
	    System.out.println(" 5 - REFRIGERANTE ");
	    
	    
	    codigo = sc.nextInt();
	    
	    System.out.println(" Digite a quantidade ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
		   resultado = quantidade * 4.00;
		}
		else if (codigo == 2) 
			resultado = quantidade * 4.50;
		
		if (codigo == 3) { 
			resultado = quantidade * 5.00;
		}
		if (codigo == 4) {
			resultado = quantidade * 2.00;
		}
		if (codigo == 5) { 
			resultado = quantidade * 1.50;
		}
		System.out.printf(" Total a pagar R$ %.2f%n", resultado );		

		
		sc.close();
	}	
}

/*		
Digite o código do produto
 1 - CACHORRO QUENTE 
 2 - X SALADA 
 3 - X BACON 
 4 - TORRADA SIMPLES 
 5 - REFRIGERANTE 
       2
 Digite a quantidade 
       3
 Total a pagar R$ 13.50
*/