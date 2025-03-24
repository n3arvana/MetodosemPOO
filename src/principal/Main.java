package principal;

import java.util.Scanner;
import Entidades.Livro;

public class Main {
	
	public static void main(String[] args) {
		Livro senhor = new Livro();
		Scanner sc = new Scanner(System.in);
		
		//Inserindo os dados do livro
		System.out.println("Insira os dados do livro:");
		System.out.println("Livro: ");
		senhor.livro = sc.nextLine();
		System.out.println("Autor: ");
		senhor.autor= sc.nextLine();
		System.out.println("Quantidade: ");
		senhor.quant = sc.nextInt();
		System.out.println("Valor: ");
		senhor.valor = sc.nextDouble();
		
		System.out.println(senhor.toString());
		
		//Fazendo o emprestimo de livros
		System.out.println("Informe a quantidade de livros emprestados: ");
		int emprestimo = sc.nextInt();
		if (emprestimo > senhor.quant) {
			System.out.println("Você não pode fazer esse tanto de empréstimo, informe outro número: ");
			emprestimo = sc.nextInt();
		}else {
			senhor.emprestarLivro(emprestimo);
			System.out.println("Dados Atualizados: " + senhor);
		}
		
		//Fazendo a devolução de livros
		System.out.println("Informe a quantidade de livros para devolução");
		int devolucao = sc.nextInt();
		if (devolucao > emprestimo) {
			System.out.println("Você não pode fazer esse tanto de devolução, informe outro número: ");
			devolucao = sc.nextInt();
		}else {
			senhor.devolverLivro(devolucao);
			System.out.println("Dados Atualizados: " + senhor);
		}
		
		sc.close();
	}

}
