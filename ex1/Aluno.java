package br.com.fatecfranca.ex1;

import javax.swing.JOptionPane;

//correção do professor
public class Aluno {
    int nroAluno;
    int idade;
    String nome;
    float p1, p2; 
    
    Aluno(){

    }
    Aluno(int nroAluno, int idade, String nome, float p1, float p2){
        this.nroAluno=nroAluno;
        this.idade=idade;
        this.nome=nome;
        this.p1=p1;
        this.p2=p2;
    }

    float notafinal(){
        return(this.p1+this.p2)/2;
    }

    String passou(){
        return(this.notafinal()>=6)?"Aprovado":"Reprovado";
    }

    void dados(){
        JOptionPane.showMessageDialog(null," Nome: " + this.nome + " Situação: "+ this.passou());//null é a caixa pai, nesse caso não tem
    }
}
