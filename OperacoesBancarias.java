/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author mauricio-henrique-de-oliveira
 */
public class OperacoesBancarias {
    private double saldo;

    public void realizarDeposito(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
