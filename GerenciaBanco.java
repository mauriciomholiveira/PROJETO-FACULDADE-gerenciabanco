/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author mauricio-henrique-de-oliveira
 */

public class GerenciaBanco {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DadosPessoais dados = new DadosPessoais();
            OperacoesBancarias operacoes = new OperacoesBancarias();
            
            System.out.println("Bem-vindo ao Gerenciamento Bancário");
            
            // Informações pessoais do usuário
            System.out.print("Informe seu nome: ");
            dados.setNome(sc.nextLine());
            System.out.print("Informe seu sobrenome: ");
            dados.setSobrenome(sc.nextLine());
            System.out.print("Informe seu CPF: ");
            dados.setCpf(sc.nextLine());
            
            int opcao;
            do {
                exibirMenu();
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Informe o valor do depósito: ");
                        double valorDeposito = sc.nextDouble();
                        operacoes.realizarDeposito(valorDeposito);
                    }
                    case 2 -> {
                        System.out.print("Informe o valor do saque: ");
                        double valorSaque = sc.nextDouble();
                        operacoes.realizarSaque(valorSaque);
                    }
                    case 3 -> {
                        double saldo = operacoes.consultarSaldo();
                        System.out.println("Saldo atual: " + saldo);
                    }
                    case 4 -> System.out.println("Encerrando o Gerenciamento Bancário. Obrigado!");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 4);
        }
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Realizar depósito");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");
    }
}
