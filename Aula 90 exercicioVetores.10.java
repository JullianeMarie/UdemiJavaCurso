package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantidade dos alunos matriculados: ");
		int alunosMatriculados = sc.nextInt();
		
		String[] nomeAluno = new String[alunosMatriculados];
		double[] nota1Semestre = new double[alunosMatriculados];
		double[] nota2Semestre = new double[alunosMatriculados];
		
		for (int i = 0; i < alunosMatriculados; i++) {
			System.out.println();
			System.out.print("Digite nome do aluno: ");
			nomeAluno[i] = sc.next();
			System.out.print("Digite nota 1º Semestre: ");
			nota1Semestre[i] = sc.nextDouble();
			System.out.print("Digite nota 2º Semestre: ");
			nota2Semestre[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Aprovados");
		for (int i = 0; i < alunosMatriculados; i++) { 
			double mediaAluno = (nota1Semestre[i] + nota2Semestre[i]) / 2;
				if (mediaAluno >= 6.0) {
				System.out.println(nomeAluno[i]);
				
			}
		}

		sc.close();
	}

}

/*
Digite quantidade dos alunos matriculados: 5

Digite nome do aluno: Maria
Digite nota 1º Semestre: 6.5
Digite nota 2º Semestre: 5.5

Digite nome do aluno: Beatriz
Digite nota 1º Semestre: 7.5
Digite nota 2º Semestre: 2.5

Digite nome do aluno: Luiza
Digite nota 1º Semestre: 3.0
Digite nota 2º Semestre: 2.5

Digite nome do aluno: Fatima
Digite nota 1º Semestre: 8.0
Digite nota 2º Semestre: 7.5

Digite nome do aluno: Julia
Digite nota 1º Semestre: 6.5
Digite nota 2º Semestre: 7.5

Aprovados
Maria
Fatima
Julia
 
 */

