package com.jvstudy.lanchonete.atendimento.cozinha;

public class Almoxarife {
    
    static private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    static private void controlarSainda(){
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    static void entregarIngredientes(){
        System.out.println("ENTREGANDO OS INGREDIENTES");
        controlarSainda();
    }

    static void trocarGas(){
        System.out.println("TROCANDO O GAS");
    }

}
