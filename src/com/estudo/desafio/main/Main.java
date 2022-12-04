package com.estudo.desafio.main;

import com.estudo.desafio.auxiliares.BubbleSort;
import com.estudo.desafio.auxiliares.Cofre;
import com.estudo.desafio.auxiliares.DefaultCase;
import com.estudo.desafio.auxiliares.LowerCase;
import com.estudo.desafio.auxiliares.QuickSort;
import com.estudo.desafio.auxiliares.UpperCase;
import com.estudo.desafio.exemplos.FacadeExemplo;
import com.estudo.desafio.exemplos.PrototypeExemplo;
import com.estudo.desafio.exemplos.ProxyExemplo;
import com.estudo.desafio.exemplos.SingletonExemplo;
import com.estudo.desafio.exemplos.StateExemplo_Formatador;
import com.estudo.desafio.exemplos.StrategyExemplo_Sorter;

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
        System.out.println();

        System.out.println("Sobre Strategy");
        int[] vetorBase = {1, 9, 5, 13, 8, 10, 25, 22, 8, 9, 9, 18, 15, 12, 16,
            5, 8, 17, 21, 14, 23, 1, 7, 4, 9, 15, 18, 19
        };
        int[] vetor1 = vetorBase.clone();
        System.out.println("\tVetor original:");
        System.out.printf("\t\t");
        for (int i : vetor1) {
            System.out.printf(i+" ");
        }
        System.out.println();
        StrategyExemplo_Sorter ordenador = new StrategyExemplo_Sorter(new BubbleSort());
        ordenador.ordenar(vetor1, 0, vetor1.length-1);
        System.out.println("\tVetor após o Bubble Sort:");
        System.out.printf("\t\t");
        for (int i : vetor1) {
            System.out.printf(i+" ");
        }
        System.out.println();

        int[] vetor2 = vetorBase.clone();
        System.out.println("\tVetor original:");
        System.out.printf("\t\t");
        for (int i : vetor2) {
            System.out.printf(i+" ");
        }
        System.out.println();
        ordenador = new StrategyExemplo_Sorter(new QuickSort());
        ordenador.ordenar(vetor2, 0, vetor2.length-1);
        System.out.println("\tVetor após o Quick Sort:");
        System.out.printf("\t\t");
        for (int i : vetor2) {
            System.out.printf(i+" ");
        }
        System.out.println();

        System.out.println("Sobre Facade");
        FacadeExemplo facade = new FacadeExemplo();
        facade.analisarVetor(vetorBase);

        System.out.println("*****");
    }
}
