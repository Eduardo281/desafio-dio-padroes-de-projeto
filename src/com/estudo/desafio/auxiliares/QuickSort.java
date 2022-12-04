package com.estudo.desafio.auxiliares;

public class QuickSort implements IEstrategiaOrdenacao{
    int particionar(int inputArray[], int posInicial, int posFinal)
    {
        int pivo = inputArray[posFinal];
        int i = (posInicial-1); 
        for (int j=posInicial; j<posFinal; j++)
        {
            if (inputArray[j] <= pivo)
            {
                i++;
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        int temp = inputArray[i+1];
        inputArray[i+1] = inputArray[posFinal];
        inputArray[posFinal] = temp;
 
        return i+1;
    }

    @Override
    public void ordenar(int[] inputArray, int posInicial, int posFinal) {
        {
            if (posInicial < posFinal)
            {
                int idx = particionar(inputArray, posInicial, posFinal);
     
                ordenar(inputArray, posInicial, idx-1);
                ordenar(inputArray, idx+1, posFinal);
            }
        }
    }
}
