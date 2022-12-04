package com.estudo.desafio.exemplos;

public class PrototypeExemplo {
    public String nome;
    public int idade;
    public String identificacao;
    
    public PrototypeExemplo(String nome, int idade, String identificacao) {
        this.nome = nome;
        this.idade = idade;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
    public PrototypeExemplo clone(){
        PrototypeExemplo cloneObj = new PrototypeExemplo(
            getNome(), getIdade(), getIdentificacao()
        );
        return cloneObj;
    }

    @Override
    public String toString() {
        return "PrototypeExemplo [nome=" + nome + 
        ", idade=" + idade + 
        ", identificacao=" + identificacao + 
        "]";
    }
}
