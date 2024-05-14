package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException { 
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));
		/* 
		 * Para imprimir a data em formato UTC
		 * O getTimeZone garante que não haverá alteração na data
		 * Devido a interação com o fuso do sistema do usuário
		 * Esse método imprimi no formato UTC não alterando a data 
		 */
		
		Date format1 = data1.parse("29/10/1983");
		Date format2 = data2.parse("29/10/1983 18:10:07");
		Date format3 = new Date(); //Formato com instante atual.
		Date format4 = new Date(System.currentTimeMillis());//Outra forma de imprimir instante atual
		Date format5 = new Date(0L);// 01/01/1970 00:00:00
		Date format6 = new Date(1000L * 60L * 60L * 5L);
		/* 
		*Data 01/01/1970 05:00:00
		*Meia-noite = (0L)
		*Passar equivalente a 5 horas para milessegundos 
		*1 segundo = 1000 milessegundos(L)
		*Multiplico 1000L * 60L = 1 minuto
		*Multiplico 1000L * 60L * 60L = 1 hora 
		*Multiplico 1000L * 60L * 60L * 5L = 5 horas 
		*/
		Date format7 = Date.from(Instant.parse("2024-07-28T15:51:07Z"));
		
 
		//Formato padrão Java
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(format3);
		System.out.println(format4);
		System.out.println(format5);
		System.out.println(format6);
		System.out.println(format7);
		System.out.println("____________________________________");
		
		
		//Formato customizado
		System.out.println("Formato 1: " + data1.format(format1));
		System.out.println("Formato 2: " + data2.format(format2));
		System.out.println("Formato 3: " + data2.format(format3));
		System.out.println("Formato 4: " + data2.format(format4));
		System.out.println("Formato 5: " + data2.format(format5));
		System.out.println("Formato 6: " + data2.format(format6));
		System.out.println("Formato 7: " + data2.format(format7));
		System.out.println("____________________________________");
		
		//Formato customizado UTC
		System.out.println("Formato 1: " + data3.format(format1));
		System.out.println("Formato 2: " + data3.format(format2));
		System.out.println("Formato 3: " + data3.format(format3));
		System.out.println("Formato 4: " + data3.format(format4));
		System.out.println("Formato 5: " + data3.format(format5));
		System.out.println("Formato 6: " + data3.format(format6));
		System.out.println("Formato 7: " + data3.format(format7));
		
		sc.close();
	}
}

/*
 Sat Oct 29 00:00:00 BRT 1983
Sat Oct 29 18:10:07 BRT 1983
Tue May 14 10:59:31 BRT 2024
Tue May 14 10:59:31 BRT 2024
Wed Dec 31 21:00:00 BRT 1969
Thu Jan 01 02:00:00 BRT 1970
Sun Jul 28 12:51:07 BRT 2024
____________________________________
Formato 1: 29/10/1983
Formato 2: 29/10/1983 18:10:07
Formato 3: 14/05/2024 10:59:31
Formato 4: 14/05/2024 10:59:31
Formato 5: 31/12/1969 21:00:00
Formato 6: 01/01/1970 02:00:00
Formato 7: 28/07/2024 12:51:07
____________________________________
Formato 1: 29/10/1983 03:00:00
Formato 2: 29/10/1983 21:10:07
Formato 3: 14/05/2024 13:59:31
Formato 4: 14/05/2024 13:59:31
Formato 5: 01/01/1970 00:00:00
Formato 6: 01/01/1970 05:00:00
Formato 7: 28/07/2024 15:51:07

 */

