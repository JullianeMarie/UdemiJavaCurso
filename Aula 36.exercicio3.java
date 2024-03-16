
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	int A = sc.nextInt(); 
	int B = sc.nextInt();
		 
	if ( A % B == 0 || B % A == 0) {
		System.out.println(" SÃO MULTIPLOS ");
	}
	else {
		System.out.println(" NÃO SÃO MULTIPLOS ");
	}
				
sc.close();
		}	
	}

/*
6
25
NÃO SÃO MULTIPLOS 

*/
