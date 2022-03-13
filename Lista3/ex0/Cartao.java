package br.com.fatecfranca.Lista3.ex0;

import java.sql.Date;
// import java.util.Set;

public class Cartao {
    private int numero, cvv;
    private Date validade;
    private String bandeira;
    private Conta conta; //Associação

    public Cartao(){

    }
    public Cartao(int numero, int cvv, Date validade, String bandeira, Conta conta){
        this.setBandeira(bandeira);
        this.setNumero(numero);
        this.setCvv(cvv);
        this.setValidade(validade);
        this.setConta(conta);
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public int getCvv() {
        return cvv;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public Date getValidade() {
        return validade;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Conta getConta() {
        return conta;
    }

    public void mostra(){
        System.out.println("Número"+this.numero+"CVV"+this.cvv+"Validade"+this.validade+"Bandeira"+this.bandeira);
        this.conta.mostra();
    }
    public void sacar (float x, String senha){
        //verificar questão 
    }
}
