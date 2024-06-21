package aplicattion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        File file = new File("C:\\Programação\\in.txt");
        /* Cria um objeto File que representa o arquivo localizado no caminho especificado. 
         * As barras invertidas são escapadas com \\in.txt.
         */
      
        Scanner sc = null; 
        /* Declara uma variável sc de tipo Scanner e a inicializa como null.
         */
        
        try {
            sc = new Scanner(file); //Instancio scanner apontando para o arquivo.
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            /* sc = new Scanner(file);: Tenta criar um Scanner para ler o arquivo especificado.
			 * while (sc.hasNextLine()): Enquanto houver uma próxima linha no arquivo, o laço continua.
			 * System.out.println(sc.nextLine());: Lê a próxima linha do arquivo e a imprime no console.
			 */
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            /* Captura a exceção FileNotFoundException se o arquivo especificado não for encontrado.
			 * System.out.println("File not found: " + e.getMessage());: -->> 
			 * Imprime uma mensagem de erro indicando que o arquivo não foi encontrado.
			 */
            
        } finally {
            if (sc != null) {
                sc.close();
                /* Este bloco é sempre executado, independentemente de uma exceção ter sido lançada ou não.
				 * if (sc != null): Verifica se o Scanner foi inicializado.
                 * sc.close();: Fecha o Scanner para liberar os recursos associados a ele.*/
            }
            System.out.println("Fim do bloco executado");
        }
    }
}


/*
Bom dia
Boa tarde
Fim do bloco executado
*/
