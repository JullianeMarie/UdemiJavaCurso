
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 5;
	   	int y = 0;		
		while (x > 2) {
			System.out.println(x);
					y += x;
					x -= 1;
		}			
		
		sc.close();

	}
}


5
4
3



import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 2;
	   	int y = 0;		
		while (x < 60) {
			System.out.println(x);
					y += 10;
					x *= 2;
		}			
		
		sc.close();

	}
}



2
4
8
16
32


import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 100;
	   	int y = 100;		
		while (x == y) {
			System.out.println("Olha");
					x = (int) Math.sqrt(y);
		}			
		
		sc.close();

	}
}





import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		while (x < 5) {
			int y =  x * 3;
			System.out.println(y);
			x += 1;
		}
		System.out.println(" Fim ");
		
		sc.close();

	}
}

0
3
6
9
12
Fim 



import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 4;
		int y = 0;
		int i = 0;
			while (x > i) {
				i += 1;
				y += 1;
				System.out.print(i + ",");
				System.out.println(y);
			}
		
			
		sc.close();

	}
}

/*
1,1
2,2
3,3
4,4
*/


