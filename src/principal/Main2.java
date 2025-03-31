package principal;

import Entidades.contaBancaria;

public class Main2 {
	
	public static void main(String[] args) {
		contaBancaria vitor = new contaBancaria("Vitor", 200);
		contaBancaria joao = new contaBancaria("João", 100);
		
		vitor.setTitular("VETORR");
		vitor.depositar(1);
		joao.sacar(101);
		
		System.out.println(joao);
		System.out.println(vitor);
	}
}
