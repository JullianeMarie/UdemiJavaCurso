package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Luiza");
		list.add("Helena");
		list.add("Luana");
		list.add("Beatriz");
		list.add("Laura");
		list.add("Linda");
		list.add(2, "Mariana");
		list.add("Marie");
		list.add("Monica");
		
		for(String x : list) {
			System.out.println(x);
		}
		 
		System.out.println("____________________________________________");
		System.out.println(list.size());		
		list.remove(3);
		list.remove("Luana");
		
		System.out.println("____________________________________________");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("____________________________________________");
		list.removeIf(x -> x.charAt(0) == 'L');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("____________________________________________");
		System.out.println("Index of Beatriz: " + list.indexOf("Beatriz"));
		System.out.println("Index of Cecilia: " + list.indexOf("Cecilia"));
		
		
		System.out.println("____________________________________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("____________________________________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("____________________________________________");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'O').findFirst().orElse(null);
		System.out.println(name1);
		  
		
		sc.close();
	}

}

/*
Maria
Luiza
Mariana
Helena
Luana
Beatriz
Laura
Linda
Marie
Monica
____________________________________________
10
____________________________________________
Maria
Luiza
Mariana
Beatriz
Laura
Linda
Marie
Monica
____________________________________________
Maria
Mariana
Beatriz
Marie
Monica
____________________________________________
Index of Beatriz: 2
Index of Cecilia: -1
____________________________________________
Maria
Mariana
Marie
Monica
____________________________________________
Maria
____________________________________________
null

*/
