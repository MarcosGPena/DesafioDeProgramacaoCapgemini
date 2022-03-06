# DesafioDeProgramacaoCapgemini
Desafio de programação para a Academia Capgemini.

Projeto relativo ao teste de programação para seleção da academia Capgemini, desenvolvido em Java 11, utilizando a IDE IntelliJ.
O teste consiste de 3 questões, sendo:

## Questão 01
Desenvolver um algoritmo que receba uma lista de comprimento impar, e imprima a mediana.
-Primeiro criei método que recebe um arraylist como parâmetro. Dentro desse método, usei o método sort() para ordenar o arraylist, 
 e em seguida encontro a mediana chamando o metodo get(). Uma vez que o array deve ter comprimento impar, apena isso é necessario.
 
 ## Questão 02
 Desenvolver um algoritmo que determine o número de pares do vetor que tem uma diferença igual ao valor de arbitrario  x.
 - Primeiro criei um método que recebe um vetor de inteiros e um número inteiro como parâmetros. Dentro deste método, utilizei um dois loops, um aninhado no outro, para percorrer o vestor e, em seguida encontrar os elementos cuja diferença e x. Cada vez que o loop encontra tal par de elementos, um contador é acionado. ao final, a quantidade de pares é printada.

## Questao 03
Desenvolver um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com algumas regras,a saber:
 - sqrt(T)<=linhas<=colunas<=sqrt(T), onde T é o comprimento do texto (sem espaços);
 - linhas x colunas >= T;
 - de todas as possiveis soluções, usar que caiba no menor grid possivel;

Primeiro criei um método que recebe uma String como parâmetro. Em seguida removi todos os espaços utilizando o método replaceAll(). Em seguida, calculo a raiz quadrada do comprimento e faço um cast para int.Em seguida transformei a String em uma lista extendida de tamanho dependendo da raiz quadrada de T.
 -Obs: Nesse passo,pode haver duas possiveis soluções: ou sqrt(T) ou sqrt(T)+1, dependendo se linha x coluna >=T. Aqui criei um if para decidir qual o algoritmo vai usar.
 De qualquer modo,optei por extender a lista com espaçoes em branco, e usando alguns cálculos sobre os indices, encontro a mensagem encriptada.


