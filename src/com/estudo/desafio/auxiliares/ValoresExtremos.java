package com.estudo.desafio.auxiliares;

public class ValoresExtremos {
    public void imprimirMaiorTermo(int inputArray[]){
        if(inputArray.length == 0){
            System.out.println("Vetor vazio!");
            return;
        }
        if(inputArray.length == 1){
            System.out.println("O maior termo é "+inputArray[0]+" na posição 0!");
            return;
        }
        int maiorValor = inputArray[0];
        int posicaoMaior = 0;
        for(int i=1; i<inputArray.length; ++i){
            if(inputArray[i] > maiorValor){
                maiorValor = inputArray[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O maior termo é "+maiorValor+" na posição "+posicaoMaior+"!");
        return;
    }

    public void imprimirMenorTermo(int inputArray[]){
        if(inputArray.length == 0){
            System.out.println("Vetor vazio!");
            return;
        }
        if(inputArray.length == 1){
            System.out.println("O menor termo é "+inputArray[0]+" na posição 0!");
            return;
        }
        int menorValor = inputArray[0];
        int posicaoMenor = 0;
        for(int i=1; i<inputArray.length; ++i){
            if(inputArray[i] < menorValor){
                menorValor = inputArray[i];
                posicaoMenor = i;
            }
        }
        System.out.println("O menor termo é "+menorValor+" na posição "+posicaoMenor+"!");
        return;
    }
}
