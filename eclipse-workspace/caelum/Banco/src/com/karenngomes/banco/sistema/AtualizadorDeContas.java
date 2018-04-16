package com.karenngomes.banco.sistema;
import com.karenngomes.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		System.out.println("Atualizando a conta...");
		double novoSaldo = (c.getSaldo() * selic) + c.getSaldo();
		c.setSaldo(novoSaldo);
		System.out.println("Saldo atual: " + c.getSaldo());
		this.saldoTotal += novoSaldo;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
