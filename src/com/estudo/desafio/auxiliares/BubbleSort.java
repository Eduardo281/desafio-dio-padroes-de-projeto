package com.estudo.desafio.auxiliares;

public class BubbleSort implements IEstrategiaOrdenacao{
    @Override
    public void ordenar(int[] inputArray, int posInicial, int posFinal) {
        if(posInicial >= posFinal){
            return;
        }
        int n = posFinal - posInicial;
        for (int i = 0; i < n; i++){
            for (int j = posInicial; j < posFinal - i; j++){
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
    }
}
