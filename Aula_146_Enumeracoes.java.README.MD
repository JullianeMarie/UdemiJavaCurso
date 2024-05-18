# Projeto de Exemplo - Controle de Pedidos

Este é um projeto de exemplo para demonstrar o uso de enums em Java para representar o status de pedidos.

## Enum OrdemStatus

O enum `OrdemStatus` define os possíveis status de um pedido:
- PAGAMENTO_PENDENTE
- PROCESSANDO
- ENVIADO
- ENTREGUE

## Classe Pedidos

A classe `Pedidos` representa um pedido com os seguintes atributos:
- id: Integer
- momento: Date
- status: OrdemStatus

### Métodos da classe Pedidos

- **Construtores**: Inclui um construtor padrão e um construtor personalizado que recebe id, momento e status.
- **Getters e Setters**: Métodos para acessar e modificar os atributos id, momento e status.
- **toString()**: Método sobrescrito para retornar uma representação textual do objeto.

## Classe Programa

A classe `Programa` contém o método `main()` que demonstra a utilização das classes `Pedidos` e `OrdemStatus`.

### Funcionalidades do Programa

1. Criação de um pedido de exemplo com status de pagamento pendente.
2. Impressão do pedido criado.
3. Atribuição de um status `ENTREGUE` a uma variável do tipo `OrdemStatus`.
4. Utilização do método `valueOf()` para obter um enum a partir de uma string.
5. Impressão dos enums `ENTREGUE` obtidos.

## Execução

Para executar o programa, siga estas etapas:
1. Compile todas as classes Java.
2. Execute a classe `Programa`.


