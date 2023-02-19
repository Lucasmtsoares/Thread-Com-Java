# Thread-Com-Java
## Descrição

Esta atividade avaliativa tem como principal objetivo compreender melhor o conceito de threads
e como elas podem ser usadas para utilizar melhor os recursos de processamento disponíveis
nos computadores e sistemas operacionais modernos. Ela é inspirada em uma atividade do curso
de sistemas operacionais do prof. Carlos Maziero (UFPR).

Construa um programa utilizando a linguagens C, C++, Java, Go para calcular o valor de π
utilizando N threads processando de forma concorrente (não deve existir dependência de
processamento entre elas). O valor de π deve ser aproximado pela série de Leibniz-Grégory.

![Série de Leibniz-Grégory para cálcular PI](https://imgs.search.brave.com/nHd5ET_Ub-XRrWWuvnpFSZlRGjJy95iApEob00hlt6s/rs:fit:710:225:1/g:ce/aHR0cHM6Ly90c2Ux/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5W/UUstRDBFcFpYNzdE/M3B4SGZiVHZRQUFB/QSZwaWQ9QXBp)

Observações:
- Devem ser calculados pelo menos 1 milhão (106) de termos da série
-- Use variáveis reais de dupla precisão (double) nos cálculos;
● O programa deve dividir o espaço de cálculo uniformemente entre as N threads; cada thread efetua uma soma parcial de forma autônoma;
● Lembrando que os resultados parciais de cada thread devem ser somados, pois o objetivo é chegar ao valor mais próximo do número π;
● Devem ser medidos os tempos de execução do programa para execuções com 1, 2, 4, 8, 16 e 32 threads (cenários experimentais). Para determinar o tempo de cada execução, você pode usar comando time do UNIX ou realizar a medição dentro do próprio programa;
● Para que os resultados tenham valor estatístico, devem ser feitas pelo menos 5 execuções de cada cenário (repetições) e calculados o tempo médio de execução e o desvio padrão entre execuções.
● Vocês devem evitar usar uma variável para acumular os valores das somas parciais calculadas por cada thread. Uma forma de evitar isso é criar um array de tamanho N (número de threads) e usar como memória compartilhada. Cada thread deve alterar uma posição única desse array com sua soma parcial.



