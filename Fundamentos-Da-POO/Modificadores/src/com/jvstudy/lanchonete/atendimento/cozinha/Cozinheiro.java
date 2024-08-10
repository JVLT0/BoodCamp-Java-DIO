package com.jvstudy.lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCAO");
    }

    public void adicionarBebidaNoBalcao(){
        System.out.println("ADICIONANDO BEBIDA NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarBebidaNoBalcao();
    }

    private void prepararCombo(){
        prepararLanche();
        prepararBebida();
        fritarIngredientes();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
    }

    private void prepararBebida(){

    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void fritarIngredientes(){
        System.out.println("FRITANDO INGREDIENTES");
    }

    private void pedirParaTrocarGas(Almoxarife trocarGas){
        Almoxarife.trocarGas();
    }
    
    private void separarIngredientes(Almoxarife entregarIngredientes){
        Almoxarife.entregarIngredientes();
    }
}
