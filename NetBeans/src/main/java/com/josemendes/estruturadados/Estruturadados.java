
package com.josemendes.estruturadados;

import com.josemendes.selecao.Selecao;

public class Estruturadados {

    public static void main(String[] args) {
        int[] v = { 9, 3, 1, 7, 5, 4, 8, 2, 6};
        
        Selecao sl = new Selecao(); 
        sl.ordenar(v);
        System.out.println(sl.toString());
    }
}
