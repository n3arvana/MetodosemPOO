
package Entidades;

public class contaBancaria {
	
	//Atributos
	private String titular;
	private double saldo;
	
	//Construtores
	public contaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Setters
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//Getters
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Métodos de alteração de saldo
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor depositado inválido!");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Valor sacado inválido!");
		}
	}

	@Override
	public String toString() {
		return "Titular: " + titular + 
				"\nsaldo: R$" + saldo;
	}
	
	
}
