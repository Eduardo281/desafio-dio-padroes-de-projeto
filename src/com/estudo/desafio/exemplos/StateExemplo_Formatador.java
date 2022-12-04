package com.estudo.desafio.exemplos;

import com.estudo.desafio.auxiliares.IEstadoDeFormatador;

public class StateExemplo_Formatador {
    private IEstadoDeFormatador estado;

    public StateExemplo_Formatador(IEstadoDeFormatador estado) {
        this.estado = estado;
    }

    public IEstadoDeFormatador getEstado() {
        return estado;
    }

    public void setEstado(IEstadoDeFormatador estado) {
        this.estado = estado;
    }

    public void escrever(String frase){
        estado.escrever(frase);
    }
}
