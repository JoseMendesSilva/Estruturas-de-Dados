package com.josemendes.insercao;

import com.josemendes.utilidades.OqueFazer;

public class Insercao extends OqueFazer {

    /*
        O algoritmo de insertion-sort faz a ordenção dos elementos dois a dois.
        Os valores são comparados de 0 com 1, de 1 com 2 e assim sucessivamente.
     */
    private int[] Vetor;
    
    public Insercao() {
    }

    public void ordenar(int[] Vetor) {
        this.Vetor = Vetor;
        System.out.println(MontarImprimir(Vetor));
        int i = 1;
        while((i) <= Vetor.length-1) {
            for (int j = Vetor.length-2; j > (i-2); j--) {
                if (Vetor[j] > Vetor[j + 1]) {
                    troca(j, j+1, Vetor);
                }
               
            }
            i++;
        }

        System.out.println(MontarImprimir(Vetor));

    }

    @Override
    public String toString() {
        return MontarImprimir(Vetor);
    }

}
