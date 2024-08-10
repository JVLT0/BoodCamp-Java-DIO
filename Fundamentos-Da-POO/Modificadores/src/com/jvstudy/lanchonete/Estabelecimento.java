package com.jvstudy.lanchonete;

import com.jvstudy.lanchonete.atendimento.Atendente;
import com.jvstudy.lanchonete.atendimento.cozinha.Cozinheiro;
import com.jvstudy.lanchonete.cliente.Cliente;

public class Estabelecimento {
    
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        Atendente atendente = new Atendente();
        atendente.pegarPedido(null);
        atendente.servindoMesa();
        atendente.receberPagamento(null);

         Cliente cliente = new Cliente();
         cliente.escolherLanche();
    }

}
