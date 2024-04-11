  # Controle de Estoque de Produtos com Encapsulamento

Neste programa Java, implementamos um sistema de controle de estoque de produtos utilizando o conceito de encapsulamento na classe `Products`.

## Classe `Products`

A classe `Products` representa um produto com os seguintes atributos encapsulados:

- `nome`: nome do produto.
- `preco`: preço unitário do produto.
- `quantidade`: quantidade em estoque do produto.

### Construtores

A classe `Products` possui dois construtores:

1. `Products(String nome, double preco, int quantidade)`: construtor que inicializa o nome, preço e quantidade do produto.
2. `Products(String nome, double preco)`: construtor que inicializa o nome e o preço do produto, assumindo a quantidade como zero.

### Métodos

- `setNome(String nome)`: método para definir o nome do produto.
- `getNome()`: método para obter o nome do produto.
- `setPreco(double preco)`: método para definir o preço do produto.
- `getPreco()`: método para obter o preço do produto.
- `getQuantidade()`: método para obter a quantidade em estoque do produto.
- `valorTotalEstoque()`: calcula o valor total do estoque do produto.
- `addProdutos(int quantidade)`: adiciona uma quantidade especificada de produtos ao estoque.
- `removerProdutos(int quantidade)`: remove uma quantidade especificada de produtos do estoque.
- `toString()`: retorna uma representação em string dos dados do produto.

## Classe `Main`

A classe `Main` contém o método `main`, onde o programa é executado. Ele permite inserir os dados do produto, atualizar esses dados usando os métodos `set`, realizar adições e remoções de estoque e exibir os dados atualizados do produto.

### Funcionalidades

- Solicita ao usuário que insira os dados do produto: nome e preço.
- Atualiza o nome e o preço do produto utilizando os métodos `set`.
- Exibe os dados do produto inserido (inicialmente com quantidade zero).
- Permite adicionar uma quantidade especificada de produtos ao estoque.
- Exibe os dados atualizados do produto após a adição.
- Permite remover uma quantidade especificada de produtos do estoque.
- Exibe os dados atualizados do produto após a remoção.

Esse exemplo demonstra como o encapsulamento permite proteger os atributos de uma classe e controlar seu acesso por meio de métodos específicos, mantendo a integridade dos dados.



