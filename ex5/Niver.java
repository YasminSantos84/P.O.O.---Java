package br.com.fatecfranca.ex5;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import javax.swing.JOptionPane;

public class Niver {
    private int dia;
    private String mes;
    Niver(){}

    public void setDia(int dia){
        if ((dia>=1)&&(dia<=31)){
            this.dia=dia;
        }            
        else{
            this.dia=0;
            System.out.println("Dia inválido");
        }
    }
    public void setMes(String mes){
        //Vamos criar um vetor
        List<String> vetor=Arrays.asList("Janeiro","Fevereiro","Março","Abril","Maio",
        "Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");

        if (vetor.contains(mes)){
            this.mes=mes;
        }
        else{
            this.mes=mes;
        System.out.println("Mês inválido");
        }        
    }

    public int getDia(){
        return this.dia;
    }
    public String getMes(){
        return this.mes;
    }
    public Niver(int dia, String mes){
        this.setDia(dia);
        this.setMes(mes);
    }

    // private void add(String string) {
    // }
}
