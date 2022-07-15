package com.josemendes;

import Vetor.Vetor;

public class Main {
    public static void main(String[] args) {

    Vetor vetor = new Vetor();
    vetor.adiciona(12);
    vetor.adiciona(2);
    vetor.adiciona(5);
    vetor.adiciona(1);
    
    System.out.println(vetor.toString());
    }
}
