
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
    
		double A = 0;
		A = sc.nextDouble();
 
	if (A >= 0 && A <= 25) {
		System.out.println(" Intervalo(0,25) ");
	} 
	else 
		if (A > 25 && A <= 50) {
		System.out.println(" Intervalo (25,50) ");
	}
	else 
		if (A >= 75 && A <= 100) {
		System.out.println(" Intervalo (75,100) ");
	}
	else 
		if (A < 0 || A > 100) {
		System.out.println(" Fora do Intervalo ");
	}
	
	sc.close();
	
	}
}
	
/*
-25.01
 Fora do Intervalo 
*/