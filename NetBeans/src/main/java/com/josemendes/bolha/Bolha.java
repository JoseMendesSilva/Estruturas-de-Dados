
package com.josemendes.bolha;

import com.josemendes.utilidades.OqueFazer;

public class Bolha extends OqueFazer {
    int[] Vetor;

    public Bolha(int[] Vetor) {
        this.Vetor = Vetor;
    }
    
    public void ordenar(int[] Vetor){
        for(int i = 0; i < Vetor.length-1; i++){
         for(int j = 0; j < Vetor.length; j++){
            if(Vetor[i] < Vetor[j]){
                troca(i, j, Vetor);
            }
         }   
        }
        
        this.Vetor = Vetor;
        
    }
    
    @Override
    public String toString() {
        return MontarImprimir(Vetor);
    }
    
}
