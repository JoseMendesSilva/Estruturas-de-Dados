package com.josemendes.selecao;

import com.josemendes.utilidades.OqueFazer;

public class Selecao extends OqueFazer {

    int[] Vetor;

    public Selecao() {
    }

    public void ordenar(int[] Vetor) {
        this.Vetor = Vetor;
        int menor;
        int aux;
        
        for (int i = 0; i < this.Vetor.length; i++) {
            menor = i;
            aux = this.Vetor[i];
            
            for (int j = i + 1; j < this.Vetor.length; j++) {
                if(this.Vetor[menor] > this.Vetor[j]){
                    menor = j;
                }
            }
            if(this.Vetor[menor] < aux){
               this.Vetor = troca(i, menor, this.Vetor);
            }
        }
        
        MontarImprimir(this.Vetor);
        
    }

    @Override
    public String toString() {
        return MontarImprimir(this.Vetor);
    }

}
