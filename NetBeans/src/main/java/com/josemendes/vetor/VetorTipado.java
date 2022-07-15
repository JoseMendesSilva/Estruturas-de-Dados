
package com.josemendes.vetor;
 
import java.util.Arrays;

/**
 *
 * @author José Mendes
 * @param <T>
 */
@SuppressWarnings("EqualsAndHashcode")
public class VetorTipado<T> {

    T[] Vetor;
    int tamanho;
    int novoTamanho;
    int posicao;

    public VetorTipado() {
        this.posicao = -1; // 
        this.tamanho = 0; // almenta o vetor de 5 em 5 celulas 
        this.novoTamanho = 5; // almenta o vetor de 5 em 5 celulas
        
        // cria a instância do vetor do tipo objeto com 5 celulas 
        // e faz um cast para o tipo T
        Vetor = (T[]) new Object[this.novoTamanho]; 
    }

    public VetorTipado(int NumeroCelula) {
        this.posicao = -1;
        this.tamanho = 0;
        this.novoTamanho = NumeroCelula;
        Vetor = (T[]) new Object[NumeroCelula];
    }

    public int getNovoTamanho() {
        return novoTamanho;
    }
    
    public int getTamanho() {
        return this.Vetor.length ;
    }

    public int getPosicao() {
        return posicao + 1;
    }

    public boolean isEmpty() {
        return (this.Vetor.length == -1);
    }

    public boolean isFull() {
        return (this.Vetor.length == this.tamanho);
    }

    public int Compara(T elemento1, T elemento2) {

        Comparable<T> chave = (Comparable<T>) elemento1;
        int retorno;

        if (chave.compareTo(elemento2) > 0) {
            retorno = 1;
        } else if (chave.compareTo(elemento2) < 0) {
            retorno = -1;
        } else {
            retorno = 0;
        }
        return retorno;
    }
    
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public void AlmentarTamanho() {
        this.tamanho += this.novoTamanho + 1;
        @SuppressWarnings("UnusedAssignment")
       T[] novoVetor = (T[]) new Object[this.tamanho];
        
        for (int i = 0; i < this.getTamanho(); i++) {
        novoVetor[i] = this.Vetor[i];            
        }
        this.Vetor = novoVetor;
    }

    public void Add(T Valor) {
        if(this.isFull()){
            this.AlmentarTamanho();
        }
        this.Vetor[++this.posicao] = Valor;
        this.tamanho++;
    }
    
    // busca sequencial por indece. retorna -1 se não encontrar nem uma ocorrência
    public int BuscarPosicao(int Posicao){
        int r = -1;
        for (int i = 0; i < this.getTamanho(); i++) {
            if(i==Posicao){
                r = i;
            }
        }
        return r;
    }
    // busca sequencial por valor. retorna -1 se não encontrar nem uma ocorrência
    public T BuscarValor(T Valor){
        T r = null;
        for (int i = 0; i < this.getTamanho(); i++) {
            if(Vetor[i] == Valor){
               r = Vetor[i];
            }
        }
        return r;
    }
    
    // remover elemento por indece retorna null se não encontrar ocorrência
    public T RemoverPosicao(int Posicao){
        T valor = null;
        if(Vetor[Posicao] != null){
            valor = Vetor[Posicao];
            for (int i = Posicao; i < this.getTamanho()-1; i++) {
                Vetor[i] = Vetor[i + 1];
            }
            this.posicao--;
        }
        return valor;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Arrays.deepHashCode(this.Vetor);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("[ ");
        for (int i = 0; i < this.posicao; i++) {
            sb.append(Vetor[i]);
            sb.append(", ");
        }
            sb.append(Vetor[this.posicao]);
            sb.append(" ]");
        return "VetorTipado{" + "Vetor=" + sb.toString() + ", tamanho=" + this.getTamanho() + ", posicao=" + this.getPosicao() + '}';
    }

}
