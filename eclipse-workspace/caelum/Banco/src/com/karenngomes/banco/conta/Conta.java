package com.karenngomes.banco.conta;
/**
 *  Classe responsavel por moldar as Contas de Banco
 *  @author Karen Gomes 
 */

public abstract class Conta {
	protected double saldo;
	protected double limite;
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return this.limite;
	}

	public void saca(double quantidade) {
		if (quantidade > this.saldo + this.limite)
			throw new SaldoInsuficienteException("Saldo insuficiente, tente um valor menor");
		 else 
			this.saldo = this.saldo - quantidade;
	}
	
	public abstract void atualiza(double taxaSelic);
	
	/**
	 * Metodo que incrementa o saldo
	 * @param valor
	 */
	
	public void deposita(double valor) {
		if (valor < 0)
			throw new ValorInvalidoException(valor);
		else
			this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
