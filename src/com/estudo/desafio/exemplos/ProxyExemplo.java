package com.estudo.desafio.exemplos;

import com.estudo.desafio.auxiliares.ICofre;

public class ProxyExemplo {
    protected ICofre cofre;

    public ProxyExemplo(ICofre cofre) {
        this.cofre = cofre;
    }

    public void abrirCofre(String senha){
        if(autenticarSenha(senha)){
            cofre.abrirCofre();
        }
        else{
            System.out.println("Senha inválida! Não foi possível abrir o cofre!");
        }
    }

    public boolean autenticarSenha(String senha){
        return senha == "senhasenha123";
    }

    public void fecharCofre(){
        cofre.fecharCofre();
    }

    public void verConteudo(){
        cofre.verConteudo();
    }

    public void verEstado(){
        cofre.verEstado();
    }
}
