package com.estudo.desafio.auxiliares;

public class Cofre implements ICofre{
    private boolean cofreEstaAberto = false;

    @Override
    public void abrirCofre() {
        System.out.println("O cofre foi aberto!");
        cofreEstaAberto = true;
    }

    @Override
    public void fecharCofre() {
        System.out.println("O cofre foi fechado!");
        cofreEstaAberto = false;
    }

    @Override
    public void verEstado(){
        if(cofreEstaAberto){
            System.out.println("O cofre está aberto!");
        }
        else{
            System.out.println("O cofre está fechado!");
        }
    }

    @Override
    public void verConteudo(){
        if(cofreEstaAberto){
            System.out.println("O cofre contém alguma quantia em dinheiro.");
        }
        else{
            System.out.println("Impossível ver conteúdo! O cofre está fechado!");
        }
    }
}
