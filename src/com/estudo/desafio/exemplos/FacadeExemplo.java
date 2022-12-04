package com.estudo.desafio.exemplos;

import com.estudo.desafio.auxiliares.Media;
import com.estudo.desafio.auxiliares.ValoresExtremos;

public class FacadeExemplo {
    ValoresExtremos extremos = new ValoresExtremos();
    Media media = new Media();

    public void analisarVetor(int inputArray[]){
        System.out.printf("\tMáximo: ");
        extremos.imprimirMaiorTermo(inputArray);
        System.out.printf("\tMínimo: ");
        extremos.imprimirMenorTermo(inputArray);
        System.out.println("\tO vetor possui: "+inputArray.length+" elementos!");
        System.out.printf("\tMédia: ");
        media.imprimirMedia(inputArray);
    }
}
