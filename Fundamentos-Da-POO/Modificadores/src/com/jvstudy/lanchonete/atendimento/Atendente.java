package com.jvstudy.lanchonete.atendimento;

import com.jvstudy.lanchonete.cliente.Cliente;

public class Atendente {
    
    public void pegarPedido(Cliente fazerPedido){
        System.out.println("ANOTANDO PEDIDO");
        Cliente.fazerPedido();
    }

    private void pegarLancheCozinha(){
        System.out.println("PEGAR LANCHE NO BALCAO");
    }

    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }

    public void receberPagamento(Cliente pagarPedido){
        Cliente.pagarPedido();
        System.out.println("RECEBENDO PAGAMENTO");
    }

}
