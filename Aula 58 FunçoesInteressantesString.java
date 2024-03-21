
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String original;
		original = "abcde FGHIJ abc DEFG -  ";  
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(3);
		String s05 = original.substring(3,10);
		String s06 = original.replace('a', 'y');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
			
		
		System.out.println(" Original: - " + original + " - ");
		System.out.println(" toLowerCase: - " + s01 + " - ");
		System.out.println(" toUpperCase: - " + s02 + " - ");
		System.out.println(" trim: - " + s03 + " - ");
		System.out.println(" substring(3): - " + s04 + " - ");
		System.out.println(" substring(3,10): - " + s05 + " - ");
		System.out.println(" replaceChar (a,y): - " + s06 + " - ");
		System.out.println(" replaceString (abc,xyz): - " + s07 + " - ");
		System.out.println(" indexOf: - " + i);
		System.out.println(" lastIndexOf: - " + j);
		System.out.println();
		String s = " potato apple lemon ";
		String[] vect = s.split(" ");
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		sc.close();
	}
}

/*
 Original: - abcde FGHIJ abc DEFG -   - 
 toLowerCase: - abcde fghij abc defg -   - 
 toUpperCase: - ABCDE FGHIJ ABC DEFG -   - 
 trim: - abcde FGHIJ abc DEFG - - 
 substring(3): - de FGHIJ abc DEFG -   - 
 substring(3,10): - de FGHI - 
 replaceChar (a,y): - ybcde FGHIJ ybc DEFG -   - 
 replaceString (abc,xyz): - xyzde FGHIJ xyz DEFG -   - 
 indexOf: - 1
 lastIndexOf: - 13

potato
apple
lemon

*/