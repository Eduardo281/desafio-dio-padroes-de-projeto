package com.estudo.desafio.exemplos;

import com.estudo.desafio.auxiliares.IEstrategiaOrdenacao;

public class StrategyExemplo_Sorter {
    private IEstrategiaOrdenacao estrategia;

    public StrategyExemplo_Sorter(IEstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenar(int inputArray[], int posInicial, int posFinal){
        estrategia.ordenar(inputArray, posInicial, posFinal);
    }
}
