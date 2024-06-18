package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cores;
import entidades.Figura;
import entidades.FormaCirculo;
import entidades.FormaRetangulo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Figura> listaFigura = new ArrayList<>();

		System.out.print("Entrar com número de figuras: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Figura #" + (i + 1) + " dados: ");
			System.out.print("Qual forma Retângulo ou Circúlo(r/c): ");
			char tipo = sc.next().charAt(0);

			System.out.print("Cor (PRETO/VERMELHO/AZUL): ");
			Cores cor = Cores.valueOf(sc.next());

			if (tipo == 'r') {
				System.out.print("Digite altura: ");
				double altura = sc.nextDouble();
				System.out.print("Digite largura: ");
				double largura = sc.nextDouble();
				listaFigura.add(new FormaRetangulo(cor, altura, largura));

			} else {
				System.out.print("Digite raio: ");
				double raio = sc.nextDouble();
				listaFigura.add(new FormaCirculo(cor, raio));
			}

		}
		System.out.println();
		System.out.println("AREA FIGURA");
		for (Figura figura : listaFigura) {
			System.out.println(String.format("%.2f", figura.area()));

		}

		sc.close();
	}
}
