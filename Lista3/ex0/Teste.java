package br.com.fatecfranca.Lista3.ex0;

import java.sql.Date;
// import java.util.Set;

public class Teste {
    public static void main(String[] args){
        Conta c1 = new Conta("01020341-1","3259","Fulano",1000) ;

        Cartao ca1 = new Cartao(1234, 456, new Date(0), "Visa",c1);

        ca1.mostra();
    }    
}
