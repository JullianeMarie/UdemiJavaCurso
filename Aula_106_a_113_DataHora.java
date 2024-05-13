package aplicattion;

import java.util.Locale;
import java.util.Scanner;


import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instancia Formatação.
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");/* .ofPattern método estático que cria
		um novo formatador de data e hora com base em um padrão de formatação fornecido como argumento.*/
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());/*Considero o fuso
		horário do sistema local do usuario - conversão*/
		DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME;//Data-hora local, formato ISO
		DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;//Data-hora com fuso, formato ISO
		
		
		//Instancia variavel data-hora.
		
		LocalDate data1 = LocalDate.now(); // .now método estático, instancia com a data de agora(local)
		LocalDateTime data2 = LocalDateTime.now(); //.now com data e hora(local)
		Instant data3 = Instant.now(); //Data hora global GMT Londres (Z)
		LocalDate data4 = LocalDate.parse("2024-05-11");//Texto em formato ISO8601 para objeto. 
		LocalDateTime data5 = LocalDateTime.parse("2024-05-11T17:55");
		Instant data6 = Instant.parse("2024-05-11T18:05:26Z");//Apesar de ser fuso horário, imprimi local
		Instant data7 = Instant.parse("2024-05-11T18:05:26-03:00");// -3:00 garanto o cálculo do fuso.
		LocalDate data8 = LocalDate.parse("12/05/2024", format1);//.parse analisa string,converte para ser formatado
		LocalDateTime  data9 = LocalDateTime.parse("12/05/2024 11:27", format2);
		LocalDate data10 = LocalDate.parse("12/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")); /*Posso chamar o 
		padrão formatação como argumento*/
		LocalDate data11 = LocalDate.of(2024, 05, 13);//.of chama formataçao ano-mes-dia.
		LocalDateTime data12 = LocalDateTime.of(2024, 05, 13, 10, 07);//.of chama formataçao ano-mes-dia-hr-mim
		LocalDate data13 = LocalDate.parse("2024-05-13");
		LocalDateTime data14 = LocalDateTime.parse("2024-05-13T10:17");
		Instant data15 = Instant.parse("2024-05-13T01:30:26Z");
		
		
		//Imprimi
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);
		System.out.println("data4: " + data4);
		System.out.println("data5: " + data5);
		System.out.println("data5: " + data5.toString()); /*De forma implicita quando uso objeto 
		em formato data gero um toString em formato ISO8601*/
		System.out.println("data6: " + data6);
		System.out.println("data7: " + data7.toString());// Retorno com fuso horário 
		System.out.println("data8: " + data8.toString());// String para objeto formato ISO
		System.out.println("data9: " + data9.toString());// String para objeto formato ISO
		System.out.println("data10: " + data10.toString());/* String para objeto formato ISO pelo 
		argumento de formatação aplicado dentro da instanciação do objeto data10*/
		System.out.println("data11: " + data11);//String para objeto formato ISO
		System.out.println("data12: " + data12);//String para objeto formato ISO
		
		//Customizacao objeto para texto formatado.
		System.out.println("data13: " + data13.format(format1));//Chamando format pela variavel data-hora e usando como parametro o variavel de formatacao
		System.out.println("data13: " + format1.format(data13));//Chamando format pela variavel de formatacao usando como parametro o variavel data-hora
		System.out.println("data13: " + data13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//Chamando o padrão formatação como argumento
		System.out.println("data14: " + data14.format(format1));//data14 com formatos diferentes, sem tempo.
		System.out.println("data14: " + data14.format(format2));//data14 com formatos diferentes, com tempo.
		System.out.println("data15: " + format3.format(data15));//objeto para texto 
		System.out.println("data15: " + format4.format(data14));//objeto para texto biblioteca ISO8601
		System.out.println("data15: " + format5.format(data15));//objeto para texto biblioteca ISO8601
		
		//Converter Instant para uma data local.
		
		LocalDate result1 = LocalDate.ofInstant(data15,ZoneId.systemDefault());
		System.out.println("result1: " + result1); 
		//result1: 2024-05-12 (data alterada devido ao fuso "2024-05-13T01:30:26Z")
		
		/*for com método ZoneId.getAvailableZoneIds()) para imprimir coleção de países 
		 * com IDs de fusos horários disponíveis no sistema onde o código está sendo executado. 
		 * Cada ID de fuso horário na lista representa uma região geográfica específica 
		 * do mundo que possui seu próprio conjunto de regras para a hora local
		for (String exemplo : ZoneId.getAvailableZoneIds()) {
			System.out.println(exemplo);
		}*/
		
		LocalDate result2 = LocalDate.ofInstant(data15,ZoneId.of("Portugal"));
		System.out.println("result2: " + result2); 
		//Inclui como no ZoneId o fuso-horário da lista da coleção como 'Potugal'
		//Mesmo objeto em formatos diferentes, resultados diferentes.
		
		
		LocalDateTime result3 = LocalDateTime.ofInstant(data15, ZoneId.systemDefault());
		System.out.println("result3: " + result3);
		LocalDateTime result4 = LocalDateTime.ofInstant(data15,ZoneId.of("Portugal"));
		System.out.println("result4: " + result4);
		
		//LocalDate
		//Selecionando dia do mes de uma data-hora.
		System.out.println("data13: " + data13.getDayOfMonth());
		//Selecionando mês do ano de uma data-hora.
		System.out.println("data13: " + data13.getMonthValue());
		//Selecionando ano de uma data-hora
		System.out.println("data13: " + data13.getYear());
		
		//LocalDateTime
		//Selecionando hora
		System.out.println("data14: " + data14.getHour());
		
		//Calculos com data-hora
		//LocalDate-Menos 
		LocalDate semanaPassadaLD = data13.minusDays(7);		
		System.out.println("Semana passada de 2024-05-13: " + semanaPassadaLD);
		//LocalDate-Mais
		LocalDate semanaQueVemLD = data13.plusDays(7);
		System.out.println("Semana que vem de 2024-05-13: " + semanaQueVemLD);
		
		//LocalTimeDate-Menos
		LocalDateTime semanaPassadaLDT = data14.minusDays(7);
		System.out.println("Semana passada de 2024-05-13T10:17: " + semanaPassadaLDT);
		//LocalTimeDate-Mais
		LocalDateTime semanaQueVemLDT = data14.minusDays(7);
		System.out.println("Semana que vem de 2024-05-13T10:17" + semanaQueVemLDT);
		
		
		/* A Classe Instant representa um ponto especifico na linha do tempo.
		 * Medidos em segundos.
		 * Para adicionar e subtrair de um Instant é necessário especificar
		 * a unidade de tempo para isso o ChronoUnit fornece de maneira precisa 
		 * essas unidades de tempo.
		*/
				
		//Instant - Menos		
		Instant semanaPassadaInst = data15.minus(7, ChronoUnit.DAYS);
		System.out.println("Semana passada de 2024-05-13T01:30:26Z: " + semanaPassadaInst);
		//Instant - Mais
		Instant semanaQueVemInst = data15.plus(7, ChronoUnit.DAYS);
		System.out.println("Semana passada de 2024-05-13T01:30:26Z: " + semanaQueVemInst);
		
		//Duration
		//LocalDateTime entre LocalDateTime
		Duration tempo1 = Duration.between(semanaPassadaLDT, data14);
		System.out.println("Duração Dias: " + tempo1.toDays());
		//LocalDate entre LocalDateTime 
		//.atTime adiciona uma hora especifica para calcular duraçao.
		Duration tempo2 = Duration.between(semanaPassadaLD.atTime(0, 0), data13.atTime(0, 0));
		System.out.println("Duração Dias: " + tempo2.toDays());
		//LocalDate entre LocalDateTime.
		//.atStartOfDay é um método de inicio de dia.
		Duration tempo3 = Duration.between(semanaPassadaLD.atStartOfDay(), data13.atStartOfDay());
		System.out.println("Duração Dias: " + tempo3.toDays());
		//Instant entre Instant
		Duration tempo4 = Duration.between(semanaPassadaInst, data15); //A ordem dos parametros alteram os resultados.
		System.out.println("Duração Dias: " + tempo4.toDays());
		

		sc.close();
	}
}

/*
data1: 2024-05-13
data2: 2024-05-13T16:45:36.272290600
data3: 2024-05-13T19:45:36.272290600Z
data4: 2024-05-11
data5: 2024-05-11T17:55
data5: 2024-05-11T17:55
data6: 2024-05-11T18:05:26Z
data7: 2024-05-11T21:05:26Z
data8: 2024-05-12
data9: 2024-05-12T11:27
data10: 2024-05-12
data11: 2024-05-13
data12: 2024-05-13T10:07
data13: 13/05/2024
data13: 13/05/2024
data13: 13/05/2024
data14: 13/05/2024
data14: 13/05/2024 10:17
data15: 12/05/2024 22:30
data15: 2024-05-13T10:17:00
data15: 2024-05-13T01:30:26Z
result1: 2024-05-12
result2: 2024-05-13
result3: 2024-05-12T22:30:26
result4: 2024-05-13T02:30:26
data13: 13
data13: 5
data13: 2024
data14: 10
Semana passada de 2024-05-13: 2024-05-06
Semana que vem de 2024-05-13: 2024-05-20
Semana passada de 2024-05-13T10:17: 2024-05-06T10:17
Semana que vem de 2024-05-13T10:172024-05-06T10:17
Semana passada de 2024-05-13T01:30:26Z: 2024-05-06T01:30:26Z
Semana passada de 2024-05-13T01:30:26Z: 2024-05-20T01:30:26Z
Duração Dias: 7
Duração Dias: 7
Duração Dias: 7
Duração Dias: 7
*/
		
		
		
		
		
		
		
