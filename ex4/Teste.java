package br.com.fatecfranca.ex4;

public class Teste {
    public static void main(String[] args){
        Rio obj1 = new Rio("Tiête", 2, true);
        obj1.chover(1);
        obj1.limpar();
        obj1.ensolarar(0.5f);
        obj1.mostra();
    }
}
