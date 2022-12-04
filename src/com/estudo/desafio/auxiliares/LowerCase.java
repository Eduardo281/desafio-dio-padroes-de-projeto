package com.estudo.desafio.auxiliares;

public class LowerCase implements IEstadoDeFormatador {
    @Override
    public void escrever(String frase) {
        System.out.println(frase.toLowerCase());
    }
}
