# Sistema de Fichas de Trabalhadores

Este projeto é um sistema simples para gerenciar trabalhadores, seus níveis, departamentos e contratos de trabalho. 
Ele permite a entrada de dados sobre trabalhadores e contratos, 
e calcula a renda mensal dos trabalhadores com base nos contratos.

## Estrutura do Projeto

### Enumerações

#### `NivelTrabalhador`
Enumeração que define os níveis dos trabalhadores:
- **JUNIOR**
- **PLENO**
- **SENIOR**

### Classes

#### `Departamento`
Representa o departamento de um trabalhador, com os seguintes atributos e métodos:
- **Atributo:** `nome` (String) - nome do departamento.
- **Métodos:** 
  - `getNome()`
  - `setNome(String nome)`

#### `HoraContrato`
Representa um contrato de trabalho por hora, com os seguintes atributos e métodos:
- **Atributos:** 
  - `date` (Date) - data do contrato.
  - `valorPorHora` (Double) - valor pago por hora de trabalho.
  - `horas` (Integer) - número de horas trabalhadas.
- **Métodos:** 
  - `getDate()`
  - `setDate(Date date)`
  - `getValorPorHora()`
  - `setValorPorHora(Double valorPorHora)`
  - `getHoras()`
  - `setHoras(Integer horas)`
  - `valorTotal()` - calcula o valor total do contrato (valorPorHora * horas).

#### `FichaTrabalhador`
Representa a ficha de um trabalhador, contendo informações pessoais, nível, salário base e contratos, com os seguintes atributos e métodos:
- **Atributos:** 
  - `nome` (String) - nome do trabalhador.
  - `level` (NivelTrabalhador) - nível do trabalhador.
  - `salarioBase` (Double) - salário base do trabalhador.
  - `departamento` (Departamento) - departamento do trabalhador.
  - `contratos` (List<HoraContrato>) - lista de contratos do trabalhador.
- **Métodos:** 
  - `getNome()`
  - `setNome(String nome)`
  - `getLevel()`
  - `setLevel(NivelTrabalhador level)`
  - `getSalarioBase()`
  - `setSalarioBase(Double salarioBase)`
  - `getDepartamento()`
  - `setDepartamento(Departamento departamento)`
  - `getContrato()`
  - `setContrato(List<HoraContrato> contrato)`
  - `addContrato(HoraContrato contrato)` - adiciona um contrato à lista de contratos.
  - `removeContrato(HoraContrato contrato)` - remove um contrato da lista de contratos.
  - `renda(Integer ano, Integer mes)` - calcula a renda do trabalhador para um determinado mês e ano.
