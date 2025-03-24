package Entidades;

public class Livro {
	public String livro;
	public String autor;
	public int quant;
	public double valor;
	
	@Override
	public String toString() {
		return "Livro: " + livro +
				"\nAutor: " + autor +
				"\nQuantidade: " + quant +
				"\nValor: R$" + valor +
				"\nValor Total: R$" + valorTotal();
	}
	
	public void emprestarLivro(int emprestimo) {
		this.quant -= emprestimo;
	}
	
	public void devolverLivro(int devolucao) {
		this.quant += devolucao;
	}
	
	public double valorTotal() {
		double valorTotal = quant * valor;
		return valorTotal;
	}
	
}
