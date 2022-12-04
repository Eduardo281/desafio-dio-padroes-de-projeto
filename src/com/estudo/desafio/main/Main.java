package com.estudo.desafio.main;

import com.estudo.desafio.auxiliares.Cofre;
import com.estudo.desafio.auxiliares.DefaultCase;
import com.estudo.desafio.auxiliares.LowerCase;
import com.estudo.desafio.auxiliares.UpperCase;
import com.estudo.desafio.exemplos.PrototypeExemplo;
import com.estudo.desafio.exemplos.ProxyExemplo;
import com.estudo.desafio.exemplos.SingletonExemplo;
import com.estudo.desafio.exemplos.StateExemplo_Formatador;

public class Main{
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("Sobre Singleton:");
        SingletonExemplo objeto1 = SingletonExemplo.getInstancia();
        SingletonExemplo objeto2 = SingletonExemplo.getInstancia();
        if(objeto1 == objeto2){
            System.out.println("\tOs dois objetos obtidos via Singleton são o mesmo!");
        }
        else{
            System.out.println("\tOs objetos obtidos via Singleton são diferentes!");
        }
        System.out.println();

        System.out.println("Sobre Prototype:");
        PrototypeExemplo pessoa1 = new PrototypeExemplo("José da Silva", 49, "36548-27");
        PrototypeExemplo pessoa2 = pessoa1.clone();
        System.out.println("\tPessoa 1 é:");
        System.out.println("\t\t"+pessoa1);
        System.out.println("\tPessoa 2 é:");
        System.out.println("\t\t"+pessoa2);
        if(pessoa1 == pessoa2){
            System.out.println("\tOs dois objetos obtidos via Prototype são o mesmo!");
        }
        else{
            System.out.println("\tOs objetos obtidos via Prototype são diferentes!");
        }
        System.out.println();

        System.out.println("Sobre Proxy:");
        ProxyExemplo cofre = new ProxyExemplo(new Cofre());
        System.out.printf("\t");
        cofre.verEstado();
        System.out.printf("\t");
        cofre.verConteudo();
        System.out.printf("\t");
        cofre.abrirCofre(null);
        System.out.printf("\t");
        cofre.abrirCofre("123456");
        System.out.printf("\t");
        cofre.verConteudo();
        System.out.printf("\t");
        cofre.abrirCofre("senhasenha123");
        System.out.printf("\t");
        cofre.verEstado();
        System.out.printf("\t");
        cofre.verConteudo();
        System.out.printf("\t");
        cofre.fecharCofre();
        System.out.println();

        System.out.println("Sobre State:");
        StateExemplo_Formatador formatador = new StateExemplo_Formatador(new DefaultCase());
        formatador.escrever("\tFrase na formatação \"Default\".");
        formatador.setEstado(new UpperCase());
        formatador.escrever("\tFrase formatada para \"UpperCase\".");
        formatador.setEstado(new LowerCase());
        formatador.escrever("\tFrase formatada para \"LowerCase\".");

        System.out.println("*****");
    }
}
