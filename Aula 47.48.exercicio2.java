
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y = 0;
		System.out.print(" Digite x= ");
		x = sc.nextInt();
		System.out.print(" Digite y= ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println(" PRIMEIRO ");
				System.out.print(" Digite x= ");
				x = sc.nextInt();
				System.out.print(" Digite y= ");
				y = sc.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println(" SEGUNDO ");
				System.out.print(" Digite x= ");
				x = sc.nextInt();
				System.out.print(" Digite y= ");
				y = sc.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println(" TERCEIRO ");
				System.out.print(" Digite x= ");
				x = sc.nextInt();
				System.out.print(" Digite y= ");
				y = sc.nextInt();
			} else if (x > 0 && y < 0) {
				System.out.println(" QUARTO ");
				System.out.print(" Digite x= ");
				x = sc.nextInt();
				System.out.print(" Digite y= ");
				y = sc.nextInt();
			}
		}
		
		sc.close();

	}
}

/*
 Digite x= 2
 Digite y= 2
 PRIMEIRO 
 Digite x= 3
 Digite y= -2
 QUARTO 
 Digite x= -8
 Digite y= -1
 TERCEIRO 
 Digite x= -7
 Digite y= 1
 SEGUNDO 
 Digite x= 0
 Digite y= 2
 
 */
