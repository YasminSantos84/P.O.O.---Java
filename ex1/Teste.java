package br.com.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        
        int auxNroAluno=Integer.parseInt(JOptionPane.showInputDialog("Nro"));
        int auxIdade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String auxNome=JOptionPane.showInputDialog("Nome");
        float auxP1=Float.parseFloat(JOptionPane.showInputDialog("p1"));
        float auxP2=Float.parseFloat(JOptionPane.showInputDialog("p2"));

        Aluno Obj1 = new Aluno(auxNroAluno, auxIdade, auxNome, auxP1, auxP2);

        Obj1.dados();
    }
    
}
