package edu.joao.banco;

public class Cliente{

    double saldo;

    Cliente(double saldo){

        this.saldo = saldo;
    }

    double Depositar(double valor){

        saldo += valor;
        return saldo;
    }

    double Sacar(double valor){
         if(saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }




    double getSaldo() {
        return saldo;
    }

    
}
