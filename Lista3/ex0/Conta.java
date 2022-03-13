package br.com.fatecfranca.Lista3.ex0;

// import java.sql.Date;

public class Conta {
    private String numero, agencia, nome;
    private float saldo;

    Conta(){}
    Conta(String numero, String agencia, String nome, float saldo){
        this.setAgencia(agencia);
        this.setNome(nome);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getAgencia() {
        return agencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void mostra(){
        System.out.println("Número "+this.numero+" Agência "+this.agencia+" Nome "+this.nome+" Saldo "+this.saldo);
    }
}
