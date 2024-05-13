### Aprendizado Java - Manipulação de Data e Hora

Este código Java demonstra diversas maneiras de trabalhar com datas e horas, utilizando as classes fornecidas pelo pacote `java.time`. 
Abaixo estão listados os métodos de aprendizado relacionados a data e hora presentes no código:

1. **Instanciando Objetos de Data e Hora**:
   - `LocalDate.now()`: Cria um objeto representando a data atual.
   - `LocalDateTime.now()`: Cria um objeto representando a data e hora atuais.
   - `Instant.now()`: Cria um objeto representando o instante atual em tempo global.
   - `LocalDate.parse()`: Converte uma string em um objeto `LocalDate`.
   - `LocalDateTime.parse()`: Converte uma string em um objeto `LocalDateTime`.
   - `Instant.parse()`: Converte uma string em um objeto `Instant`.
   - `LocalDate.of()`: Cria um objeto `LocalDate` com valores específicos para ano, mês e dia.
   - `LocalDateTime.of()`: Cria um objeto `LocalDateTime` com valores específicos para ano, mês, dia, hora e minuto.
   
2. **Formatando Datas e Horas**:
   - `DateTimeFormatter.ofPattern()`: Cria um formato personalizado para formatação de datas e horas.
   - `format()`: Formata um objeto de data ou hora de acordo com um formato específico.
   
3. **Convertendo para Texto**:
   - `toString()`: Converte um objeto de data ou hora em uma string no formato ISO8601.
   
4. **Convertendo entre Fusos Horários**:
   - `ZoneId.getAvailableZoneIds()`: Retorna uma lista de IDs de fusos horários disponíveis no sistema.
   - `ZoneId.of()`: Cria um objeto `ZoneId` com um ID de fuso horário específico.
   - `LocalDate.ofInstant()`: Converte um objeto `Instant` em um objeto `LocalDate` considerando o fuso horário do sistema.
   - `LocalDateTime.ofInstant()`: Converte um objeto `Instant` em um objeto `LocalDateTime` considerando o fuso horário do sistema.
   
5. **Manipulando Datas e Horas**:
   - `minus()`: Subtrai uma quantidade específica de tempo de um objeto de data ou hora.
   - `plus()`: Adiciona uma quantidade específica de tempo a um objeto de data ou hora.
   - `ChronoUnit.DAYS`: Unidade de tempo para representar dias.
   - `Duration.between()`: Calcula a diferença de tempo entre dois objetos de data ou hora.

Por meio desses métodos e classes, é possível realizar uma ampla variedade de operações relacionadas a datas e horas em Java.
