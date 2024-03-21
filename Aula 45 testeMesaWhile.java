
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
	   	int y = 4;		
		while (x < 3) {
			y += 2;
			x += 1;
		}
		
		System.out.println(x + "-" + y);		
		


		sc.close();

	}
}

/*
CONSOLE
3-10
*/

