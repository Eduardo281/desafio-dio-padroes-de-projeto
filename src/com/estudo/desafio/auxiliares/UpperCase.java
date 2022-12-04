package com.estudo.desafio.auxiliares;

public class UpperCase implements IEstadoDeFormatador {
    @Override
    public void escrever(String frase) {
        System.out.println(frase.toUpperCase());
    }
}
