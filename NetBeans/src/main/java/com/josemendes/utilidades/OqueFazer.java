
package com.josemendes.utilidades;

public class OqueFazer {
    
    protected int[] troca(int i, int j, int[] Vetor){
        int aux = Vetor[i];
        Vetor[i] = Vetor[j];
        Vetor[j] = aux;
        return Vetor;
    }
    
    protected String MontarImprimir(int[] Vetor){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < Vetor.length-2; i++){
           sb.append(Vetor[i]);
           sb.append(", ");
         }  
        sb.append(Vetor[Vetor.length-1]);
        return "Vetor [" + sb.toString() + ']';
    }

}
