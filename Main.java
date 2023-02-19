import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade de Thread: ");
        final int NumThreads = scan.nextInt();

        int repeticoes=0;
        long tempoTotal;
        long tempoMedio;
        long tempo=0;
        double somaTotaldePI=0;
        long[] tempoParcial = new long[5];
        long[] desvioPadrao= new long[5];
        long desvioPadraoParcial=0;
        long totalDesvioPadrao=0;

        while(repeticoes<5) {
            long tempoInicial = System.currentTimeMillis();
            double somaTotal=0;
            final double[] somaParcial = new double[NumThreads];

            Thread[] threads = new MinhaThread[NumThreads];

            for (int i = 0; i < NumThreads; i++) {
                int inicio = 1000000 / NumThreads * i;
                int fim = 1000000 / NumThreads * (i + 1);
                threads[i] = new MinhaThread(i, somaParcial, inicio, fim);
                threads[i].start();
            }
            for (Thread v : threads) {
                v.join();
            }
            for (int j = 0; j < NumThreads; j++) {
                somaTotal += somaParcial[j];
            }

            long tempoFinal = System.currentTimeMillis();
            tempoTotal = tempoFinal - tempoInicial;
            tempoParcial[repeticoes] = tempoTotal;
            tempo += tempoTotal;
            repeticoes++;
            somaTotaldePI = somaTotal*4;
        }

        tempoMedio = tempo/5; //cáculo do tempo médio de cada cenário

         //cáculo do desvio padrão
        for(int k=0;k<5;k++){
            desvioPadrao[k] = tempoMedio-tempoParcial[k];
            desvioPadrao[k] *= desvioPadrao[k];
            desvioPadraoParcial += desvioPadrao[k];
        }
        totalDesvioPadrao = desvioPadraoParcial/5;
        long t1 = totalDesvioPadrao;
        totalDesvioPadrao = (long) Math.sqrt(totalDesvioPadrao);
        System.out.println("Tempo médio de cada Thread: "+tempoMedio+" Milisegundos");
        System.out.println("Valor aproximado de PI: "+somaTotaldePI);
        System.out.println("Desvio padrão: "+totalDesvioPadrao);

    }
}
