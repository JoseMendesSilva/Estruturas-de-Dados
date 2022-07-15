package Bolha;

final class Bolha {
    public void ordenar(int[] Vetor) {
        for (int i = 0; i < Vetor.length - 1; i++) {

            for (int j = 0; j < Vetor.length - 1; j++) {
                if(Vetor[j] < Vetor[i]){
                    troca(i, j, Vetor);
                }
            }

        }

        if(Vetor.length>0){Imprimir(Vetor);}
    }

    private void troca(int i, int j, int[] Vetor) {
        int aux = Vetor[i];
        Vetor[i] = Vetor[j];
        Vetor[j] = aux;
    }

    private void Imprimir(int[] Vetor){
        for(int i = 0; i < Vetor.length-1; i++){
            System.out.println("Posição: " + i + Vetor[i]);
        }
    }

}
