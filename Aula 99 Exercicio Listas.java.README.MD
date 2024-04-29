# Java Basics - Aprendizados Principais
Neste repositório, você encontrará um programa simples em Java que gerencia uma lista de funcionários. 
Vamos destacar alguns dos principais aprendizados e tópicos abordados:

## 1. Estrutura do Programa
O programa consiste em duas classes principais: `Funcionarios` e `Programa`.

- `Funcionarios`: Uma classe que representa os funcionários, com atributos como ID, nome e salário. 
Também possui um método para aumento de salário.

- `Programa`: A classe principal que contém o método `main`. 
Este é o ponto de entrada do programa e controla a interação com o usuário e a lógica de negócios.

## 2. Entrada de Dados
O programa solicita ao usuário que insira o número de funcionários a serem registrados e, em seguida, 
solicita informações para cada funcionário, como ID, nome e salário. Utiliza-se um loop para garantir que cada ID seja único.

## 3. Utilização de Streams
No método `hasId`, é utilizado o conceito de streams para verificar se um ID já existe na lista de funcionários. 
Através de operações de filtro e busca (`filter` e `findFirst`), o programa determina se o ID fornecido já está na lista.

## 4. Uso do Modificador `final`
O modificador `final` é utilizado na declaração da variável `idFinal` para garantir que ela não seja modificada após sua inicialização. 
Isso é útil quando precisamos usar a variável dentro de expressões lambda ou loops.

## 5. Utilização de `continue`
Dentro do loop de entrada de dados, quando um ID duplicado é detectado, é utilizado o comando `continue` 
para pular o restante do loop e solicitar um novo ID.

## 6. Método para Aumento de Salário
A classe `Funcionarios` possui um método `aumentoSalario` que recebe uma porcentagem como entrada e aumenta o salário do funcionário de acordo com essa porcentagem.

## 7. Saída de Dados
Ao final do programa, a lista de funcionários é impressa na tela, mostrando os detalhes de cada funcionário, como ID, nome e salário.

## Conclusão
Este programa simples em Java demonstra alguns dos conceitos básicos da linguagem, 
como entrada/saída de dados, uso de estruturas de controle, uso de objetos e métodos
e manipulação de coleções com streams.
O exercicio foi baseado pela aula on line e gitHub proposto pelo professor Nelio Alves. No entando mantive a especificação de erro 
ao analisar a entrada de Id já cadastrado. Declarando um loop até que seja inserido um Id válido e ao filtrar um Id incorreto, 
permitir a entrada do Id válido para seguir com o aumento de salário. 
---

