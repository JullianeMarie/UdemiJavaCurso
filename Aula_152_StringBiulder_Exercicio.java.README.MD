# Descrição do Projeto

Este projeto em Java simula um sistema de postagem em um blog, onde os usuários podem criar posts, adicionar comentários e visualizar as informações das postagens.

## Funcionalidades Principais

### Entidades

#### Comentarios
Representa os comentários feitos nos posts. Contém os seguintes atributos:
- `texto`: O texto do comentário.

#### Post
Representa uma postagem no blog. Contém os seguintes atributos:
- `momento`: A data e hora da postagem.
- `titulo`: O título da postagem.
- `content`: O conteúdo da postagem.
- `likes`: O número de curtidas da postagem.
- `comentarios`: Uma lista de comentários associados à postagem.

### Métodos Principais

#### Comentarios
- `Comentarios(String texto)`: Construtor para criar um comentário com o texto especificado.
- `getTexto()`: Retorna o texto do comentário.
- `setTexto(String texto)`: Define o texto do comentário.
- `toString()`: Retorna uma representação em string do comentário.

#### Post
- `Post(Date momento, String titulo, String content, Integer likes)`: Construtor para criar uma postagem com os atributos especificados.
- `getMomento()`: Retorna a data e hora da postagem.
- `setMomento(Date momento)`: Define a data e hora da postagem.
- `getTitulo()`: Retorna o título da postagem.
- `setTitulo(String titulo)`: Define o título da postagem.
- `getContent()`: Retorna o conteúdo da postagem.
- `setContent(String content)`: Define o conteúdo da postagem.
- `getLikes()`: Retorna o número de curtidas da postagem.
- `setLikes(Integer likes)`: Define o número de curtidas da postagem.
- `getComentarios()`: Retorna a lista de comentários da postagem.
- `addComentarios(Comentarios comentario)`: Adiciona um comentário à postagem.
- `removeComentarios(Comentarios comentario)`: Remove um comentário da postagem.
- `toString()`: Retorna uma representação em string da postagem, incluindo todos os seus comentários.

### Aplicação Principal

A classe `Programa` contém o método `main` que demonstra a criação de posts e comentários, além de imprimir as postagens e seus respectivos comentários.

#### Exemplos de Execução

- Criação de comentários e posts.
- Adição de comentários aos posts.
- Impressão das informações dos posts com seus comentários.

### Como Executar

1. Clone o repositório.
2. Compile os arquivos Java.
3. Execute a classe `Programa` para ver o sistema em ação.

```java
// Exemplo de saída esperada
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
