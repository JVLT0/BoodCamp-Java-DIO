package edu.joao.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente(2000);

        int escolha;

        do{

            System.out.println("=========================");
            System.out.println("           MENU");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SACAR");
            System.out.println("3 - EXTRATO");
            System.out.println("4 - SAIR");
            System.out.println("=========================");
            escolha = input.nextInt();

            if(escolha == 1){
                double deposito;
                System.out.println("Quanto deseja depositar?");
                deposito = input.nextDouble();
                cliente.Depositar(deposito);

            }else if(escolha == 2){
                double sacar;
                System.out.println("Quanto deseja sacar? ");
                sacar = input.nextDouble();
                cliente.Sacar(sacar);

            }else if(escolha == 3){
                System.out.println("Saldo Atual: " + cliente.getSaldo());

            }else if(escolha == 4){
                System.out.println("SAINDO...");
            }


        }while(escolha != 4);
    }
}
