package com.josemendes.vetor;

public class Vetor {

    // variável vetor
    private final int[] v;

    // Tamanho do vetor
   private int tamanho;
    // registra a posição que o ponteiro está.
    private int posicao;

    // construtor
    public Vetor() {
        this.tamanho = -1;
        this.posicao = 0;
        // cria um vetor com 4 celulas
        v = new int[4];
    }

    // verifica se está cheio
    public boolean isFull() {
        return (this.tamanho == 3);
    }

    // verifica se está fazio
    public boolean isEmpty() {
        return (this.tamanho == -1);
    }

    // adiciona valores o vetor
    public void Add(int Valor) {
        // verifica se o vetor esta vazio e não está cheio para adicionar
        v[++tamanho] = Valor;
        this.posicao++;
    }

    // remove um elemento apartir de um indece
    public boolean Remove_at(int indice) {
        if (this.isEmpty()) {
            return false;
        } else {
            // desloca o vetor apartir da posição a remover uma posição
            for (int i = indice; i <= this.tamanho - 1; i++) {
                this.v[i] = v[i + 1];
            }

            this.tamanho--;
            this.posicao--;

        }
        return true;
    }

    // remove um elemento expecifico
    public boolean Remove(int Valor) {
        if (this.tamanho < 0) {
            return false;
        } else {
            for (int i = 0; i < this.tamanho - 1; i++) {
                if (v[i] == Valor) {
                    for (int x = i; x <= this.tamanho - 1; x++) {
                        this.v[x] = v[x + 1];
                    }
                }

            }
            this.tamanho--;
            this.posicao--;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        for (int i = 0; i <= this.tamanho; i++) {
            if (i < this.tamanho) {
                sb.append(v[i]);
                sb.append(", ");
            } else {
                sb.append(v[i]);
            }
        }

        sb.append(" ]");

        return "Vetor{" + " V = " + sb.toString() + ", tamanho=" + tamanho + ", posicao=" + posicao + '}';
    }

}
