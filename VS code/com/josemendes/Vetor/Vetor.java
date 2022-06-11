package Vetor;
public class Vetor{

    int[] elemento;
    int tamanho = 10;

    public Vetor(){
        this.elemento = new int[this.tamanho];
    }

    public boolean isFull(){
        return (this.elemento.length == this.tamanho);
    }

    public boolean isEmpty(){
        return (this.elemento[0] == 0);
    }

    public void adiciona(int posicao, int valor){

        System.out.println(this.elemento.length);
        System.out.println(this.elemento[0]);
        System.out.println(this.elemento[posicao]);

        elemento[posicao] = valor;

        System.out.println(this.elemento[posicao]);

    }

    public int remove(int p){
        int el = this.elemento[p];
        for(int i = p; i< this.tamanho;i++){
            this.elemento[i] = this.elemento[i+1];
        }
        return el;
    }

    // retorna -1 se não encontrar o valor
    public int buscar(int p){
        int item = -1;
        for(int i = 0; i < this.tamanho; i++){
            if(this.elemento[i] == this.elemento[p]){
                item = this.elemento[i];
            }
        }
        return item;
    }
    
    @Override
    public String toString(){
        return "Vetor tamanho: " + this.elemento.length;
    }

}