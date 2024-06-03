# Projeto Conta Bancária em Java

Este projeto demonstra o uso de herança em Java por meio da implementação de duas classes: `Conta` (superclasse) e `ContaEmpresarial` (subclasse). 
A herança é um conceito fundamental na programação orientada a objetos (OOP) que permite que uma classe herde atributos e métodos de outra, 
promovendo a reutilização de código e uma melhor organização do sistema.

## Estrutura do Projeto

- **Pacote:** `entidades`
- **Classes:**
  - `Conta`: Representa uma conta bancária genérica.
  - `ContaEmpresarial`: Especializa a conta bancária para contas empresariais, adicionando funcionalidades específicas.

## Classe `Conta`

A classe `Conta` é a superclasse que define atributos e métodos comuns para todas as contas bancárias.

### Atributos

- `numeroConta` (Integer): Número da conta.
- `titular` (String): Nome do titular da conta.
- `saldo` (Double): Saldo disponível na conta (com modificador `protected`).

### Construtores

- `Conta()`: Construtor padrão.
- `Conta(Integer numeroConta, String titular, Double saldo)`: Construtor com parâmetros para inicializar a conta.

### Métodos

- `getNumeroConta()`: Retorna o número da conta.
- `setNumeroConta(Integer numeroConta)`: Define o número da conta.
- `getTitular()`: Retorna o nome do titular.
- `setTitular(String titular)`: Define o nome do titular.
- `getSaldo()`: Retorna o saldo da conta.
- `saqueConta(Double valor)`: Realiza um saque na conta, diminuindo o saldo.
- `depositoConta(Double valor)`: Realiza um depósito na conta, aumentando o saldo.

## Classe `ContaEmpresarial`

A classe `ContaEmpresarial` é uma subclasse de `Conta` que adiciona um atributo específico e métodos adicionais.

### Atributos

- `emprestimoLimite` (Double): Limite de empréstimo disponível para a conta empresarial.

### Construtores

- `ContaEmpresarial()`: Construtor padrão que chama o construtor padrão da superclasse `Conta`.
- `ContaEmpresarial(Integer numeroConta, String titular, Double saldo, Double emprestimoLimite)`: Construtor com parâmetros que chama o construtor da superclasse
    `Conta` para inicializar os atributos herdados.

### Métodos

- `getEmprestimoLimite()`: Retorna o limite de empréstimo.
- `setEmprestimoLimite(Double emprestimoLimite)`: Define o limite de empréstimo.
- `emprestimo(Double valor)`: Realiza um empréstimo na conta, aumentando o saldo desde que o valor esteja dentro do limite permitido. 
    Deduz uma taxa fixa de 10.00 do valor do empréstimo.

## Conceitos de Herança em Java

### Definição

A herança é um mecanismo que permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Isso promove a reutilização de código e permite a criação de hierarquias de classes mais organizadas e compreensíveis.

### Benefícios da Herança

1. **Reutilização de Código**: Permite que uma subclasse reutilize o código da superclasse, evitando duplicação.
2. **Organização**: Facilita a organização do código em uma hierarquia lógica.
3. **Extensibilidade**: Facilita a extensão de funcionalidades sem modificar o código existente da superclasse.

### No Projeto

- **Superclasse (`Conta`)**: Define atributos e métodos comuns para todas as contas bancárias.
- **Subclasse (`ContaEmpresarial`)**: Especializa a `Conta`, adicionando um atributo (`emprestimoLimite`) e um método (`emprestimo`) específico para contas empresariais.

### Modificadores de Acesso

- **private**: Atributos ou métodos não são acessíveis fora da classe onde são definidos.
- **protected**: Atributos ou métodos são acessíveis dentro do mesmo pacote e pelas subclasses.
- **public**: Atributos ou métodos são acessíveis de qualquer lugar.

### Chamadas de Superclasse

- `super()`: Chama o construtor da superclasse.
- `super(param1, param2, ...)`: Chama o construtor da superclasse com parâmetros.
