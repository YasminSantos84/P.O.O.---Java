package br.com.fatecfranca.lista2.ex2;

public class Teste {
    //Criar uma classe Teste para instanciação da classe Aluno e chamada dos métodos notaFinal() e dadosAluno()).  

    public static void main(String[] args){
        Aluno Obj1 = new Aluno(654321,"Mike",20,(float)9.7, 5);

        Obj1.notaFinal();
        Obj1.dadosAluno();

        Aluno Obj2 = new Aluno();

        Obj2.setNumAluno(987654);
        Obj2.setnome("Rafaela");
        Obj2.setIdade(23);
        Obj2.setp1(9);
        Obj2.setp2(8);

        Obj2.getNumAluno();
        Obj2.getNome();
        Obj2.getIdade();
        Obj2.getP1();
        Obj2.getP2();

        Obj2.notaFinal();
        Obj2.dadosAluno();

        // System.out.println("Nome: "+Obj2.getNome()+" Número Aluno: "+Obj2.getNumAluno()+" Idade: "+Obj2.getIdade()+" p1: "+Obj2.getP1()+" p2: "+Obj2.getP2()+ " Nota final: "+Obj2.notaFinal());
    //Tente acessar as variáveis de instância da classe Aluno sem os métodos get e set. O que acontece?
    //Se get e set o número aluno e nome do aluno retornam valor nulo
    }
}
