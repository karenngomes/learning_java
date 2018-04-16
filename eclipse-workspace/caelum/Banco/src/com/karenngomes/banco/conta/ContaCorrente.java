package com.karenngomes.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
