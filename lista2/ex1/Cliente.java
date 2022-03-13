package br.com.fatecfranca.lista2.ex1;

import javax.swing.JOptionPane;

public class Cliente {
//Crie uma classe em Java chamada Cliente contendo as variáveis de instância private numeroConta (String), numeroAgencia (String), nome (String) e saldo (float),
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    Cliente(){
    }
    Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumConta(numeroConta);
        this.setNumAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
// e os métodos getters e setters para todas as variáveis privadas. Para a criação dos métodos setters, o número da conta deve obrigatoriamente ter tamanho 8, contando o traço do dígito verificador. 

    public void setNumConta(String numeroConta){
        if (numeroConta.length()==8){//Conta tamanho
            if (numeroConta.charAt(6)=='-'){
                this.numeroConta=numeroConta;
            }//Caso de aspas simples  
            else{
                this.numeroConta=numeroConta;
                System.out.println("Número Conta inválido");
            }    
        }
        else{
            this.numeroConta = "Inválido";
            System.out.println("Conta deve ter tamanho 8");
        }    
    }
    public String getNumConta(){
        return this.numeroConta;
    }

    // O número da agência deve ter tamanho 6, também contando o traço do dígito verificador. Verificar em ambos os casos a presença do dígito verificador. 
    public void setNumAgencia(String numeroAgencia){
        if (numeroAgencia.length()==6){
            if (numeroAgencia.charAt(4)=='-'){
                this.numeroAgencia = numeroAgencia;
            }
            else{
                this.numeroAgencia = "Inválido";
                System.out.println("Número Agência inválido");
            }
        }
        else{
            this.numeroAgencia = "Inválido";
            System.out.println("Agência deve ter tamanh 6");
        }
    }
    public String getNumAgencia(){
        return this.numeroAgencia;
    }
    //O nome do cliente não pode ultrapassar 30 caracteres. 
    public void setNome(String nome){
        if (nome.length()<=30){
            this.nome = nome;
        }
        else{
            this.nome = "Inválido";
            System.out.println("Nome inválido, tamanho máximo = 30");
        }
    }
    public String getnome(){
        return this.nome;
    }

    public void setSaldo(float saldo){
        if (saldo>=0){
            this.saldo = saldo;
        }
        else{
            this.saldo = 0;
            System.out.println("Saldo inválido");
        }
            
    }
    public float getSaldo(){
        return this.saldo;
    }
    //O saldo da conta não tem restrição;
    //Crie os métodos public  realizarDeposito() 
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo+x);
    }
    //e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente. 
    public void realizarSaque(float x){
        this.setSaldo(this.saldo-x);
    }
    //Crie um outro método public para imprimir o numero da conta, nome da agencia, nome do cliente e saldo atual. 
    void imprimir(){
        JOptionPane.showMessageDialog(null, "Número da conta: "+this.numeroConta+" Número da agência: "+this.numeroAgencia+" Nome cliente: "+this.nome+" Saldo: "+this.saldo);
    }
    //Crie um método construtor para inicialização das variáveis quando um objeto da classe for criado. 

    //Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido;

} 
