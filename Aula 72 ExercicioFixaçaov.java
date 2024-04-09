package calculadora;

public class CurrencyConverter {

public static double dollar;
public static double buydollar;
public static double reais;
public static double porcentagem;

public static double dollar() {
return dollar;
}

public static double buydollar() {
return buydollar;
}

public static double valorreais() {
return reais = dollar * buydollar;

}

public static double porcentagem() {
porcentagem = reais * 0.06;
return reais + porcentagem;
       }

}

__________________________________________________________________

import java.util.Locale;
import java.util.Scanner;
import calculadora.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

// TODO Auto-generated method stub //

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da cota��o do d�lar");
		CurrencyConverter.dollar = sc.nextDouble();

		System.out.println("Quantos d�llares ser� comprado?");
		CurrencyConverter.buydollar = sc.nextDouble();

		System.out.printf("Valor reais sem IOF: %.2f%n", CurrencyConverter.valorreais());

		System.out.printf("Valor reais com IOF: %.2f%n", CurrencyConverter.porcentagem());

		sc.close();

	}
}


/*
Tela:
Digite o valor da cota��o do d�lar
3.10
Quantos d�llares ser� comprado?
200.00
Valor reais sem IOF: 620.00
Valor reais com IOF: 657.20
*/