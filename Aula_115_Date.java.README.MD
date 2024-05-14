### Aprendizado Java - Manipulação de Data e Hora

Este código Java demonstra como trabalhar com datas e horas utilizando as classes `SimpleDateFormat` e `Date` do pacote `java.util`. 
Abaixo estão listados os métodos de aprendizado relacionados a data e hora presentes no código:

1. **Instanciando Objetos de Data e Hora**:
   - `SimpleDateFormat("dd/MM/yyyy")`: Cria um formato para representar datas no formato "dia/mês/ano".
   - `SimpleDateFormat("dd/MM/yyyy HH:mm:ss")`: Cria um formato para representar datas e horas no formato "dia/mês/ano hora:minuto:segundo".
   - `SimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"))`: Define o fuso horário para UTC (Tempo Universal Coordenado).
   - `new Date()`: Cria um objeto representando o instante atual.
   - `new Date(System.currentTimeMillis())`: Cria um objeto representando o instante atual em milissegundos.
   - `new Date(0L)`: Cria um objeto representando a data de 01/01/1970 00:00:00.
   - `new Date(1000L * 60L * 60L * 5L)`: Cria um objeto representando a data de 01/01/1970 05:00:00.
   - `Date.from(Instant.parse("2024-07-28T15:51:07Z"))`: Cria um objeto `Date` a partir de um `Instant`.

2. **Formatando Datas e Horas**:
   - `SimpleDateFormat.format()`: Formata um objeto `Date` de acordo com um formato específico.

3. **Convertendo para Texto**:
   - `toString()`: Converte um objeto `Date` em uma string no formato padrão Java.

4. **Convertendo para Texto (UTC)**:
   - Utiliza `SimpleDateFormat` com `TimeZone` definido para UTC para formatar datas e horas no formato UTC.

Por meio desses métodos e classes, é possível realizar operações básicas de manipulação de datas e horas em Java utilizando o formato legado `SimpleDateFormat` e a classe `Date`.
