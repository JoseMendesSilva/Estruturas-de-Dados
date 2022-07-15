package Vetor;

public class Vetor {

    int[] elemento;
    int tamanho = 10;
    int posicao = -1;
    public Vetor() {
        this.elemento = new int[this.tamanho];
    }

    public boolean isFull() {
        return (this.elemento.length == this.tamanho);
    }

    public boolean isEmpty() {
        return (this.elemento[0] == -1);
    }

    public void adiciona(int valor) {

       // System.out.println(this.elemento.length);
       // System.out.println(this.elemento[0]);
       // System.out.println(this.elemento[posicao]);

        elemento[++posicao] = valor;

        // System.out.println(this.elemento[posicao]);

    }

    public int remove(int p) {
        int el = this.elemento[p];
        for (int i = p; i < this.tamanho; i++) {
            this.elemento[i] = this.elemento[i + 1];
        }
        this.posicao--;
        return el;
    }

    // retorna -1 se não encontrar o valor
    public int buscar(int p) {
        int item = -1;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elemento[i] == this.elemento[p]) {
                item = this.elemento[i];
            }
        }
        return item;
    }

    @Override
    public String toString() {
        return "Vetor tamanho: " + this.elemento.length;
    }

    public void insercao_ordenada(int v, int n, int max, int[] A) {

        if (n < max) {
            int i = n;

            while (i > 0 && A[i - 1] > v) {
                A[i] = A[i - 1];
                i = i - 1;
            }

            A[i] = v;
            n = n + 1;
        } else {
            System.out.println("Overflow");
        }
    }

}