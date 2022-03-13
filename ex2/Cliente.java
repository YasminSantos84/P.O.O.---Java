package br.com.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    int nroConta, nroAgencia;
    String nome;
    float saldo;

    Cliente(){

    }
    Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    void sacar(float x){
        this.saldo -= x;
    }
    void depositar(float x){
        this.saldo+=x;
    }
    void mostra(){
        JOptionPane.showMessageDialog(null, "Número Agência: "+this.nroAgencia + "Número Conta: "+this.nroConta+"Nome: "+this.nome+"Saldo: "+this.saldo);
    }
}
