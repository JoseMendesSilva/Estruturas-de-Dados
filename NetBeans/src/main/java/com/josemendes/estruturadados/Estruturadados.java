/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.josemendes.estruturadados;

import com.josemendes.vetor.VetorTipado;

/**
 *
 * @author DELL
 */
public class Estruturadados {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Vetor vetor = new Vetor();
//        
//        vetor.Add(2);
//        vetor.Add(1);
//        vetor.Add(5);
//        vetor.Add(3);
//        System.out.println(vetor.toString());
//        System.out.println(vetor.Remove(1));        
//        System.out.println(vetor.toString());

        //OrdenacaoPorSelecao ac = new OrdenacaoPorSelecao();
        //ac.Ordenar();
        VetorTipado<Integer> vt = new VetorTipado();
        vt.Add(4);
        vt.Add(1);
        vt.Add(9);
        vt.Add(6);
        System.out.println(vt.toString());
        vt.Add(2);
        System.out.println(vt.toString());
        vt.Add(5);
        System.out.println(vt.toString());
        // buscar o indece 2 no vetor e imprimir.
        int p = vt.BuscarPosicao(2);
        System.out.println(p);
        
        // buscar o valor 9 no vetor e imprimir
        p = vt.BuscarValor(9);
        System.out.println(p);
        
        System.out.println(vt.BuscarPosicao(vt.BuscarValor(9)));
        System.out.println(vt.RemoverPosicao(2));
        // buscar o indece 2 no vetor e imprimir.
         p = vt.BuscarValor(6);
        System.out.println(p);

    }
}
