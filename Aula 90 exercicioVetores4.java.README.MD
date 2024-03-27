Exercício de Filtragem de Números Pares
Neste exercício, você será solicitado a digitar uma série de números inteiros e, em seguida, filtrar apenas 
os números pares da sequência.

Método main
O método main é o ponto de entrada do programa. 
Ele começa solicitando ao usuário a quantidade de números que serão digitados 
usando o método nextInt() do objeto Scanner. 
Em seguida, é criado um array numerosInteiros para armazenar os números inteiros digitados pelo usuário.

Um loop for é usado para percorrer o array numerosInteiros e solicitar ao usuário que digite os números inteiros. 
Cada número inteiro digitado é armazenado no array correspondente.
Um array numerosPares é criado para armazenar os números pares filtrados da sequência. 
Um contador contador é inicializado em 0 para acompanhar a quantidade de números pares encontrados.

Um loop for-each é usado para iterar sobre o array numerosInteiros e verificar 
se cada número é par usando a condição numero % 2 == 0. 
Se for par, o número é adicionado ao array numerosPares e o contador é incrementado.

Depois de filtrar os números pares, o programa imprime os números pares encontrados 
usando um loop for e o método println(). 
Em seguida, imprime a quantidade de números pares usando o operador + para concatenar a mensagem com o valor do contador.
