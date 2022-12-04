package com.estudo.desafio.auxiliares;

public class Media {
    public void imprimirMedia(int inputArray[]){
        if(inputArray.length == 0){
            System.out.println("Vetor vazio!");
            return;
        }
        if(inputArray.length == 1){
            System.out.println("A media é "+inputArray[0]);
            return;
        }

        double media = 0;
        int n = inputArray.length;

        for (int valor : inputArray) {
            media += valor;
        }
        media = media/n;

        System.out.println("A media dos valores do vetor é "+media+"!");
    }
}
