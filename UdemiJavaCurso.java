import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double raio1, raio2, raio3, area1, area2, area3;
		raio1 = sc.nextDouble();
		raio2 = sc.nextDouble();
		raio3 = sc.nextDouble();
		area1 = 3.14159 * Math.pow(raio1, 2.0);
		area2 = 3.14159 * Math.pow(raio2, 2.0);
		area3 = 3.14159 * Math.pow(raio3, 2.0);
		
		System.out.printf(" Area 1 é igual: %.4f%n", area1);
		System.out.printf(" Area 2 é igual: %.4f%n", area2);
		System.out.printf(" Area 3 é igual: %.4f%n", area3);
		

		sc.close();

	}
}


TELA
2.00
100.64
150.00
 Area 1 é igual: 12.5664
 Area 2 é igual: 31819.3103
 Area 3 é igual: 70685.7750

_________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int A,B,C,D, diferenca;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
			diferenca = (A*B-C*D);
		System.out.println("DIFERENÇA = " + diferenca);
		
		
		

		sc.close();

	}
}


TELA
5
6
-7
8
DIFERENÇA = 86
____________________________________________________________________________
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double NF, NH, VH, salario;
		NF = sc.nextDouble();
		NH = sc.nextDouble();
		VH = sc.nextDouble();
		salario = (NH*VH);
		System.out.println(" NUMERO = " + NF);
		System.out.printf(" SALARIO = R$%.2f%n", salario);
		
		

		sc.close();

	}
}

TELA
25
100
5.50
NUMERO = 25.0
SALARIO = R$550.00
________________________________________________________________________________


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	double vp1, vp2, vt;
	int cp1, cp2, np1, np2;
		cp1 = sc.nextInt();
		cp2 = sc.nextInt();
		np1 = sc.nextInt();
		np2 = sc.nextInt();
		vp1 = sc.nextDouble();
		vp2 = sc.nextDouble();
		vt = (np1*vp1) + (np2*vp2);
	System.out.printf(" VALOR A PAGAR = R$ %.2f%n", vt);
	//System.out.printf(" SALARIO =        R$%.2f%n", salario);
		sc.close();

	}
}

TELA
12
16
1
2
5.30
5.10
VALOR A PAGAR = R$ 15.50
______________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	double A, B, C, areaP, areaT, areaR, areaC, areaQ; 

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaP = A * C / 2.0;
		areaC = 3.14159 * C * C;
		areaT = (A + B) / 2.0 * C;
		areaQ = B * B;
		areaR = A * B;
		
		System.out.printf(" A area do Triangulo é: %.3f%n" , areaP);
		System.out.printf(" A area do Circulo é: %.3f%n" , areaC);
		System.out.printf(" A area Trapézio é: %.3f%n" , areaT);
		System.out.printf(" A area do Quadrado é: %.3f%n" , areaQ);
		System.out.printf(" A area do Retangulo é: %.3f%n" , areaR);
		
		sc.close();
		
	}
}

TELA
3.0
4.0
5.2
A area do Triangulo é: 7.800
 A area do Circulo é: 84.949
 A area Trapézio é: 18.200
 A area do Quadrado é: 16.000
 A area do Retangulo é: 12.000

______________________________________________________________________________________
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
	
	
		String produto1 = "computador";
		String produto2 = "officedesk";
	
	int idade = 30; 
	int codigo = 5290;
	char genero = 'F';
		
	double preco1 = 2100.0;
	double preco2 = 650.5;
	double medida = 53.234567;
	
	System.out.printf("Produtos: %s qual é o preço" + " R$ %.2f%n", produto1, preco1);
	System.out.println();
	System.out.printf("Produtos: %s qual o preço" + " R$ %.2f%n", produto2, preco2);
	System.out.println();
	System.out.printf(" Registro: %d anos, %d codigo, %c%n ", idade, codigo, genero);
	
	System.out.printf("Seis casas decimais %.6f%n", medida);
	System.out.printf(" Três casas decimais %.3f%n", medida);
	
	
	
	sc.close();
	
	
	
	
	}
}
_____________________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double delta, b, a, c, x1, x2;
		a = 1.0;
		b = 2.0;
		c = 1.0;
		delta = Math.pow(b,2.0)- 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		System.out.println(" x1 é igual a:" + x1);
		System.out.print(" x2 é igual a:" + x2);
		

		sc.close();

	}
}

Console:
 x1 é igual a:-1.0
 x2 é igual a:-1.0
____________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
    
		
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.00; 
		}
		System.out.printf(" Valor a pagar: R$ %.2f%n ", conta);
		
	
		
		
		
		          
sc.close();

	}
		}
	
113
Valor a pagar: R$ 76.00
 
Observação: 
No exemplo usado: conta = conta + ( minutos - 100 ) * 2.0;
A atribuição é colocada conta += ( minutos - 100 ) * 2.0;
_____________________________________________________________________________
EXEMPLO IF/ELSE E SWITCH/CASE


import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String dia;
		int x = sc.nextInt();

		if (x == 1) {
			dia = " domingo";
		} else if (x == 2) {
			dia = " segunda ";
		} else if (x == 3) {
			dia = " terça ";
		} else if (x == 4) {
			dia = " quarta ";
		} else if (x == 5) {
			dia = " quinta ";
		} else if (x == 6) {
			dia = " sexta ";
		} else if (x == 7) {
			dia = " sábado ";
		} else {
			dia = "Fora do Intervalo";
		}

		System.out.println(" Dia da semana " + dia);

		sc.close();

	}
}

7
 Dia da semana  sábado 



import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String dia;
		int x = sc.nextInt();

		switch (x) {
		
		case 1:
			dia = " Domingo ";
			break;
		case 2:
			dia = " Segunda ";
			break;
		case 3:
			dia = " Terça ";
			break;
		case 4:
			dia = " Quarta ";
			break;
		case 5:
			dia = " Quinta ";
			break;
		case 6:
			dia = " Sexta ";
			break;
		case 7:
			dia = " Sábado ";
		break;
		default:
			dia = " Fora do Intervalo ";
		break;
		}
		System.out.println(" Dia da semana " + dia);
		
		sc.close();

	}
}
____________________________________________________________________________________
EXPRESSÃO CONDICIONAL TERNÁRIA

IF / ELSE

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double preço = sc.nextDouble();
		double desconto;
		
		if ( preço < 20.0) {
			desconto = preço * 0.1;
		}
		else { desconto = preço * 0.05; 
		}
		
		System.out.printf(" O valor do desconto R$ %.2f%n ", desconto );
		sc.close();

	}
}

TERNÁRIA


import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double preço = sc.nextDouble();
		double desconto = (preço > 20.00)? preço * 0.1 : preço * 0.05;
		
				
		System.out.printf(" O valor do desconto R$ %.2f%n ", desconto );


		sc.close();

	}
}




_____________________________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int hora;
		System.out.println(" Que horas são? ");
		hora = sc.nextInt();
			
		if (hora < 12) {
			System.out.println(" Bom dia ");
		}
		else if (hora < 18) {
			System.out.println(" Bom tarde ");
		}	 		
 		else {
			System.out.println(" Boa noite ");
 		}
		
		
		sc.close();
		}	
	}


 CONSOLE
 Que horas são? 
 10
 Bom dia 
_____________________________________________________________________________________
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	int Hf = sc.nextInt(); 
	int Hi = sc.nextInt();
	int duracao;
		 
	if ( Hf > Hi) {
		duracao = Hf - Hi;	
			System.out.println(" O jogo durou " + duracao + " horas ");		
	}
	
	else if ( Hf < Hi) {
		duracao = ( 24 + Hf - Hi);
			System.out.println(" O jogo durou " + duracao + " horas ");
	}	

	else  		
			System.out.println(" O jogo durou 24 horas ");
	
		
	
	
sc.close();
		}	
	}

CONSOLE:
0
0
O jogo durou 24 horas 
___________________________________________________________________________________________

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


CONSOLE
27
IMPAR 
___________________________________________________________________________________________________

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

6
25
NÃO SÃO MULTIPLOS 
_____________________________________________________________________________________________

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

CONSOLE		
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
_____________________________________________________________________________________

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
	

	
CONSOLE
-25.01
 Fora do Intervalo 
_________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
    
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println(" Q1 ");
		}
		else 
			if (x < 0 && y > 0) {
				System.out.println( " Q2 ");
			}		
			else 
				if ( x < 0 && y < 0) {
					System.out.println( " Q3 ");
				}
				else 
					if ( x > 0 && y < 0) {
					System.out.println(" Q4 ");
					}
					else 
						if (x==0 && y==0) {
							System.out.println(" Origem ");
						}
					
	
	sc.close();
		
		}
	}

CONSOLE
0
0
Origem 
__________________________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
    
		double salario, imposto = 0;
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			imposto = 0.0;
			System.out.println(" ISENTO ");
		}
		else 
			if (salario <= 3000.00) {
				imposto = (salario - 2000.00) * 0.08;
		}
			else 
				if (salario < 4500.00) {
					imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
				}
				else 
					if (salario > 4500.00) {
						imposto = (salario - 4500.00)* 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
							}
		          System.out.printf(" Valor a cobrar R$ %.2f%n  ", imposto);
		          
		          
	sc.close();

	}
}
	

CONSOLE	
4520.00
Valor a cobrar R$ 355.60
___________________________________________________________________________________________________________________

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

CONSOLE
3-10

____________________________________________________________________________________________________________________
*******TESTE DE MESA*****************


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

CONSOLE
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


CONSOLE
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

CONSOLE
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

CONSOLE:
1,1
2,2
3,3
4,4
________________________________________________________________________________________


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

CONSOLE
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


CONSOLE
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

CONSOLE
0
3
6
9
12
Fim 

_____________________________________________________________________________________________________

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

1,1
2,2
3,3
4,4
______________________________________________________________________________________

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
 
 CONSOLE
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
____________________________________________________________________________________________

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int Codigo = sc.nextInt();

		
		while (Codigo != 4) {
			if (Codigo == 1) {
				alcool += 1;
			} 
			else if (Codigo == 2) {
				gasolina += 1;
			}
			else if (Codigo == 3) {
				diesel += 1;
			}
			if (Codigo > 4) {
				System.out.println(" Fora da Faixa Digite Novamente");
		}
		Codigo = sc.nextInt();		
		}
	System.out.println(" Muito Obrigado ");
	System.out.println(" Alcool: " + alcool);
	System.out.println(" Gasolina: " + gasolina);
	System.out.println(" Diesel: " + diesel);

	sc.close();
	}
}


CONSOLE

1
2
3
5
 Fora da Faixa Digite Novamente
2
4
 Muito Obrigado 
 Alcool: 1
 Gasolina: 2
 Diesel: 1






  



