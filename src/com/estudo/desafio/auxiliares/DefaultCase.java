package com.estudo.desafio.auxiliares;

public class DefaultCase implements IEstadoDeFormatador {
    @Override
    public void escrever(String frase) {
        System.out.println(frase);
    }
}
