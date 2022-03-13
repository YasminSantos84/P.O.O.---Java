package br.com.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Produto {
    int id, qtde;
    String descricao;
    float preco;

    Produto(){

    }
    Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    void comprar(float x){
        this.qtde+=x;
    }
    void vender(float x){
        this.qtde-=x;
    }
    void subir(float x){
        this.preco+=x;
    }
    void descer(float x){
        this.preco-=x;

    }
    void mostra(){
        JOptionPane.showMessageDialog(null,
        " Descrição: "+this.descricao+
        " Quantidade: "+this.qtde+
        " Preço: "+this.preco);
    }
}
