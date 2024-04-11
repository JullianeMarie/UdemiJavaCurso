# Sistema de Controle de Estoque de Produtos

Este programa em Java permite o controle de estoque de produtos, permitindo adicionar e remover unidades, 
além de exibir os dados atualizados do produto.

## Classe `Products`

A classe `Products` representa um produto com os seguintes atributos:

- `nome`: nome do produto.
- `preco`: preço unitário do produto.
- `quantidade`: quantidade em estoque do produto.

### Construtor

- `Products(String nome, double preco, int quantidade)`: construtor que recebe o nome, preço e quantidade inicial do produto.

### Métodos

- `valorTotalEstoque()`: calcula o valor total do estoque do produto.
- `addProdutos(int quantidade)`: adiciona uma quantidade especificada de produtos ao estoque.
- `removerProdutos(int quantidade)`: remove uma quantidade especificada de produtos do estoque.
- `toString()`: retorna uma representação em string dos dados do produto.

## Classe `Main`

A classe `Main` contém o método `main`, onde o programa é executado. Ele permite inserir os dados do produto, 
realizar adições e remoções de estoque e exibir os dados atualizados do produto.

### Funcionalidades

- Solicita ao usuário que insira os dados do produto: nome, preço e quantidade em estoque.
- Exibe os dados do produto inserido.
- Permite adicionar uma quantidade especificada de produtos ao estoque.
- Exibe os dados atualizados do produto após a adição.
- Permite remover uma quantidade especificada de produtos do estoque.
- Exibe os dados atualizados do produto após a remoção.


