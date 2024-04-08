package entidade;
public class Retangulo {

public double a;
public double b;

public double areaR()  {
double area = a * b;
return area;
}
public double perimetroR() {
double perimetro = 2 * (a + b);
return perimetro;
}
public double diagonalR() {
double diagonal = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
return diagonal;

	}

}

______________________________________________________________________


import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

public class Main {

public static void main(String[] args) {

// TODO Auto-generated method stub //

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

Retangulo entidade = new Retangulo();
System.out.println("Digite a largura do retângulo ");
entidade.a = sc.nextDouble();
System.out.println("Digite a altura do retângulo ");
entidade.b = sc.nextDouble();

System.out.printf("Qual o valor da área? %.2f%n" , entidade.areaR());

System.out.printf("Qual o valor do Perímetro? %.2f%n" , entidade.perimetroR());

System.out.printf("Qual o valor da Diagonal? %.2f%n" , entidade.diagonalR());


sc.close();

	}
}


/*Digite a largura do retângulo
3.00
Digite a altura do retângulo
4.00
Qual o valor da área? 12.00
Qual o valor do Perímetro? 14.00
Qual o valor da Diagonal? 5.00
*/




