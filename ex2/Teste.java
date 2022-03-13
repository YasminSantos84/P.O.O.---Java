package br.com.fatecfranca.ex2;

public class Teste {
    public static void main(String[] args){
        Cliente Obj1 = new Cliente(123,456,"Fulano",0);

        Obj1.depositar(1000);
        Obj1.depositar(5000);
        Obj1.sacar(2000);
        Obj1.mostra();
    }
}
