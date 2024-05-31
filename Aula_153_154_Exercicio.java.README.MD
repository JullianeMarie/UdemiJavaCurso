# README

## Projeto: Sistema de Pedidos

Este projeto implementa um sistema simples de pedidos utilizando a linguagem Java. 
Ele permite a criação de clientes, produtos, itens de pedido e ordens, além de calcular o total de uma ordem com base nos itens adicionados.

### Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **OrdemItem**: Representa um item em uma ordem, contendo informações sobre a quantidade e o preço do produto.
2. **Products**: Representa um produto com nome e preço.
3. **OrdemStatus**: Enumeração que define os possíveis status de uma ordem (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE).
4. **Cliente**: Representa um cliente com nome, email e data de nascimento.
5. **Ordem**: Representa uma ordem, contendo a data do pedido, status, cliente e uma lista de itens.
6. **Programa**: Classe principal que contém o método `main` para executar a aplicação.

### Descrição das Classes

#### OrdemItem
- **Atributos**:
  - `Integer quantidade`: Quantidade do produto na ordem.
  - `Double preco`: Preço unitário do produto.
  - `Products produto`: Produto associado ao item.
- **Métodos**:
  - `Double subTotal()`: Calcula o subtotal do item multiplicando a quantidade pelo preço.
  - `String toString()`: Retorna uma representação em string do item, incluindo o nome do produto, preço, quantidade e subtotal.

#### Products
- **Atributos**:
  - `String nome`: Nome do produto.
  - `Double preco`: Preço do produto.
- **Métodos**:
  - Métodos getters e setters para os atributos.

#### OrdemStatus
- **Enumeração**:
  - Define os possíveis status de uma ordem, cada um associado a um valor inteiro.

#### Cliente
- **Atributos**:
  - `String nome`: Nome do cliente.
  - `String email`: Email do cliente.
  - `Date dataNascimento`: Data de nascimento do cliente.
- **Métodos**:
  - Métodos getters e setters para os atributos.
  - `String toString()`: Retorna uma representação em string do cliente, formatando a data de nascimento.

#### Ordem
- **Atributos**:
  - `Date moment`: Data e hora do pedido.
  - `OrdemStatus status`: Status da ordem.
  - `Cliente cliente`: Cliente associado à ordem.
  - `List<OrdemItem> itens`: Lista de itens na ordem.
- **Métodos**:
  - `void addItem(OrdemItem item)`: Adiciona um item à lista de itens.
  - `void removeItem(OrdemItem item)`: Remove um item da lista de itens.
  - `double total()`: Calcula o total da ordem somando os subtotais de todos os itens.
  - `String toString()`: Retorna uma representação em string da ordem, incluindo a data, status, cliente, itens e total.

### Classe Principal (Programa)

- **Funcionalidade**:
  - Coleta dados do cliente e do pedido através de entradas do usuário.
  - Cria objetos `Cliente`, `Products`, `OrdemItem` e `Ordem`.
  - Adiciona itens à ordem e exibe o resumo da ordem com todos os detalhes, incluindo o total do pedido.
