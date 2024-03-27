
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	int numero = sc.nextInt();
		 
	if (numero % 2 == 0) {
		System.out.println(" PAR ");
	}
	else if (numero % 2 != 0) {
		System.out.println(" IMPAR ");
	}
				
sc.close();

		}	
	}


/*27
 IMPAR 
*/
