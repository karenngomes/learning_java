package com.karenngomes.banco.conta;
public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa * 3;
	}
}
