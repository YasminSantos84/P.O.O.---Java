package br.com.fatecfranca.ex5;

// import javax.swing.JOptionPane;

public class TestaNiver {
    public static void main(String[] args){
    	Niver Obj =  new Niver();
		Obj.setDia(3);
		Obj.setDia(80);
		Obj.setDia(-3);
		Obj.setMes("Janeiro");
		Obj.setMes("Outono");
		Obj.setMes("Fevereiro");

		Obj.getMes();
		Obj.getDia();

		System.out.println("Dia: "+Obj.getDia()+", Mês:"+Obj.getMes());

		Niver Obj1 = new Niver();
		Obj1.setMes("Janeiro");
		Obj1.setDia(7);
		System.out.println("Dia: "+Obj1.getDia()+", Mês:"+Obj1.getMes());

		Niver Obj2 = new Niver(7,"Janeiro");
		System.out.println("Dia: "+Obj2.getDia()+", Mês:"+Obj2.getMes());

		Niver Obj3=new Niver(28,"Verão");
		System.out.println("Dia: "+Obj3.getDia()+", Mês:"+Obj3.getMes());
    }
	
}
