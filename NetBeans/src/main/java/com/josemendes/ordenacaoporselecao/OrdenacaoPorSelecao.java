/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josemendes.ordenacaoporselecao;

/**
 *
 * @author DELL
 */
public class OrdenacaoPorSelecao {
    public void Ordenar() {
        
        int numeros[] = {23, 4, 33, 45, 19, 12, 28, 40};
        int menor, x;
        for (int i = 0; i < numeros.length - 1; i++) {
            menor = i;
            x = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < x) {
                    menor = j;
                    x = numeros[j];
                }
            }
            numeros[menor] = numeros[i];
            numeros[i] = x;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%5d", numeros[i]);
        }
    }
}
