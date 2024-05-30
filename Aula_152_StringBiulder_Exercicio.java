package entidades;

public class Comentarios {

	private String texto;

	public Comentarios() {

	}

	public Comentarios(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Comentarios= " + texto; 
	}
	
	
	
}

______________________________________________________________

package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
	private Date momento;
	private String titulo;
	private String content;
	private Integer likes;

	private List<Comentarios> comentarios = new ArrayList<>();

	public Post(Date momento, String titulo, String content, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void addComentarios(Comentarios comentario) {
		comentarios.add(comentario);
	}

	public void removeComentarios(Comentarios comentario) {
		comentarios.remove(comentario);
	}

	@Override
	public String toString() {
		StringBuilder sb =  new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes: - \n");
		sb.append(sdf.format(momento) + "\n");
		sb.append(content + "\n");
		sb.append("Comentários: " + "\n");
		for (Comentarios c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	
}

___________________________________________________________________

package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Comentarios;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentarios c1 = new Comentarios("Tenha uma ótima viagem!");
		Comentarios c2 = new Comentarios("Uau que show!!");

		Post p1 = new Post(sdf.parse("29/10/2024 13:05:45")
				, "Viajando para Nova Zelandia"
				, "Indo visitar esse país maravilhoso!"
				, 12);

		p1.addComentarios(c1);
		p1.addComentarios(c2);

		Comentarios c3 = new Comentarios("Boa noite");
		Comentarios c4 = new Comentarios("Que a força esteja com vc!");

		Post p2 = new Post(sdf.parse("30/10/2024 23:15:25")
				, "Boa noite galera!!"
				, "Inté amanhã"
				, 5);

		p2.addComentarios(c3);
		p2.addComentarios(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		sc.close();
	}
}


/*
Viajando para Nova Zelandia
12 Likes: - 
29/10/2024 13:05:45
Indo visitar esse país maravilhoso!
Comentários: 
Tenha uma ótima viagem!
Uau que show!!

Boa noite galera!!
5 Likes: - 
30/10/2024 23:15:25
Inté amanhã
Comentários: 
Boa noite
Que a força esteja com vc!
*/
