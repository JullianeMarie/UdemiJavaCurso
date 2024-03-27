
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	int n1 = 89;
	int n2 = 60;
	System.out.println(n1 | n2);
	System.out.println(n1 & n2);
	System.out.println(n1 ^ n2);
		
		
		sc.close();
	}
}


/*
125
24
101
*/
