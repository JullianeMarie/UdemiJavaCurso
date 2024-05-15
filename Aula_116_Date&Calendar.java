package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ADICIONAR E REMOVER UNIDADE DE TEMPO
		SimpleDateFormat SimplesFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2024-05-24T20:41:58Z"));

		System.out.println(SimplesFormato.format(data));

		// Objeto Calendar
		Calendar cal = Calendar.getInstance();
		/* Essa instância é inicializada com o fuso horário padrão e a localidade do
		 sistema em que o código está sendo executado. */
		cal.setTime(data);// Data instanciada dentro do calendário.
		cal.add(Calendar.HOUR, 4);// .add o objeto com a unidade e a quantidade.
		data = cal.getTime();// Atribuo nova data

		System.out.println(SimplesFormato.format(data));
		// Imprimir a data no novo formato instanciado com a data atualizada (+4).

		// OBTER UNIDADE DE TEMPO
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // Precisa somar 1, pois Janeiro inicia 0.

		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);

		sc.close();
	}
}

/*
24/05/2024 17:41:58
24/05/2024 21:41:58
Minutos: 41
Mês: 4
*/
 

