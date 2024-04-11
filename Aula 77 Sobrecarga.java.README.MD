# Controle de Estoque de Produtos com Sobrecarga

Neste programa Java, implementamos um sistema simples de controle de estoque de produtos, 
demonstrando o conceito de sobrecarga de métodos na classe `Products`.

## Classe `Products`

A classe `Products` representa um produto com os seguintes atributos:

- `nome`: nome do produto.
- `preco`: preço unitário do produto.
- `quantidade`: quantidade em estoque do produto.

### Construtores

A classe `Products` possui dois construtores sobrecarregados:

1. `Products(String nome, double preco, int quantidade)`: construtor que inicializa o nome, preço e quantidade do produto.
2. `Products(String nome, double preco)`: construtor que inicializa o nome e o preço do produto, assumindo a quantidade como zero.

### Métodos

- `valorTotalEstoque()`: calcula o valor total do estoque do produto.
- `addProdutos(int quantidade)`: adiciona uma quantidade especificada de produtos ao estoque.
- `removerProdutos(int quantidade)`: remove uma quantidade especificada de produtos do estoque.
- `toString()`: retorna uma representação em string dos dados do produto.

## Classe `Main`

A classe `Main` contém o método `main`, onde o programa é executado. Ele permite inserir os dados do produto, 
realizar adições e remoções de estoque e exibir os dados atualizados do produto.

### Funcionalidades

- Solicita ao usuário que insira os dados do produto: nome e preço.
- Exibe os dados do produto inserido (inicialmente com quantidade zero).
- Permite adicionar uma quantidade especificada de produtos ao estoque.
- Exibe os dados atualizados do produto após a adição.
- Permite remover uma quantidade especificada de produtos do estoque.
- Exibe os dados atualizados do produto após a remoção.


