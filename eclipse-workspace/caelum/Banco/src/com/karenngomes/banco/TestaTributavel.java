package com.karenngomes.banco;
import com.karenngomes.banco.conta.ContaCorrente;
import com.karenngomes.banco.conta.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		System.out.println(cc.calculaTributos());
		
		//testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
	}

}
