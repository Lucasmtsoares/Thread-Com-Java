public class MinhaThread extends Thread{
    private int MNumThreads;
    private int cont;
    private int inicio;
    private int fim;
    private double[] soma;
    private double pi=0;


    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public double[] getSoma() {
        return soma;
    }

    public void setSoma(double soma[]) {
        this.soma = soma;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public MinhaThread(int cont, double[] soma, int inicio, int fim){
        this.cont = cont;
        this.soma = soma;
        this.inicio = inicio;
        this.fim = fim;
    }
    @Override
    public void run(){
        for(int i=inicio;i<fim;i++){
            pi = Math.pow(-1,i)/((2*i)+1);
            this.soma[cont] += pi;
        }
    }
}
