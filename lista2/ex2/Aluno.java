package br.com.fatecfranca.lista2.ex2;

import javax.swing.JOptionPane;

public class Aluno { 
    //Crie uma classe em Java chamada Aluno contendo as variáveis de instância private numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float), 
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumAluno(numeroAluno);
        this.setIdade(idade);
        this.setnome(nome);
        this.setp1(p1);
        this.setp2(p2);
    } 
    Aluno(){    }
    //e os métodos getters e setters para todas as variáveis privadas. 
    //Para a criação dos métodos setters, assuma que: o número do aluno deve ter tamanho exatamente igual a 6. 
    public void setNumAluno(int numeroAluno){
        if (String.valueOf(numeroAluno).length()==6){//provavelmente converter para string
            this.numeroAluno = numeroAluno;
        }
    }
    public int getNumAluno(){
        return this.numeroAluno;
    }
    //O nome do aluno não pode ultrapassar tamanho 30. 
    public void setnome(String nome){
        if (nome.length()<30){
            this.nome = nome;
        }
        else{
            this.nome = "Inválido";
            System.out.println("Nome");
        }
    }    
    public String getNome(){
        return this.nome;
    }
    //A idade, e as notas p1 e p2 não podem ser negativas. 
    public void setIdade(int idade){
        if (this.idade>=0){
            this.idade = idade;
        }
        else{
            this.idade = 0;
            System.out.println("Valor inválido, váriavel recebe 0");
        }
    }
    public int getIdade(){
        return this.idade;
    }
    public void setp1(float p1){
        if (this.p1>0){
            this.p1 = p1;
        }
        else{
            this.p1 = 0;
            System.out.println("Valor inválido, váriavel recebe 0");
        }
    }
    public float getP1(){
        return this.p1;
    }
    public void setp2(float p2){
        if (this.p2>0){
            this.p2 = p2;
        }
        else{
            this.p2 = 0;
            System.out.println("Valor inválido, váriavel recebe 0");
        }
    }
    public float getP2(){
        return this.p2;
    }
    //Crie os métodos public notaFinal() - que calcula e imprime a média final do aluno - , e 
    float notaFinal(){
        return (this.p1+this.p2)/2 ;
    }
    
    //dadosAluno() - que imprime as variáveis de instância numeroAluno, nome e idade. 
    void dadosAluno(){
        JOptionPane.showMessageDialog(null," Nome: " + this.nome + " NºAluno: "+ this.numeroAluno+" Idade: "+this.idade);
    }    
    //Crie um construtor para inicialização das variáveis quando um objeto da classe for criado. 

}
