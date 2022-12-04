package com.estudo.desafio.exemplos;

public class SingletonExemplo {
    private static SingletonExemplo instancia;

    private SingletonExemplo(){
        super();
    }

    public static SingletonExemplo getInstancia(){
        if(instancia == null){
            instancia = new SingletonExemplo();
        }
        return instancia;
    }
}
