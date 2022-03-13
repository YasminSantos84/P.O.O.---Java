package br.com.fatecfranca.lista2.ex1;

public class Teste {
    //Criar uma classe Teste para instanciação da classe Cliente como Fulano. 
    
    public static void main(String[] args){
    //Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado. 
        Cliente Obj1 = new Cliente("765432-1","5432-1","CaiqueSilva", 2000);

        Obj1.realizarDeposito(10000);
        Obj1.realizarSaque(33);
        Obj1.realizarSaque(500);
        Obj1.imprimir();
    //Nao se esqueça de importar a classe Cliente na classe Teste.  
        Cliente Obj2 = new Cliente();

        Obj2.setNome("Betina");
        Obj2.setNumAgencia("5678-9");
        Obj2.setNumConta("345678-9");
        Obj2.setSaldo(100000);

        Obj2.getNumAgencia();
        Obj2.getNumConta();
        Obj2.getnome();
        Obj2.getSaldo();

        Obj2.imprimir();
        // System.out.println("Nome: "+Obj2.getnome()+" Número conta: "+Obj2.getNumConta()+" Número agência: "+Obj2.getNumAgencia()+" Saldo: "+Obj2.getSaldo());
    //Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set. O que acontece?
    //R: Sem set e get os valores, número da agência, número da conta e nome retornam null
    }    
} 
