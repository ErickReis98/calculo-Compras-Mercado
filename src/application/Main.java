package application;

import java.util.Scanner;

import entities.Carrinho;
import entities.Item;
import entities.Produto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Carrinho cart = new Carrinho();
		System.out.println("Quantos itens deseja adicionar?");
		int it = sc.nextInt();

		for (int i = 0; i < it; i++) {
			System.out.print("Digite a quantidade do item: ");
			int quant = sc.nextInt();

			System.out.print("Digite o codigo do produto: ");
			int cod = sc.nextInt();

			System.out.print("Digite o nome do produto: ");
			String nome = sc.next();
			System.out.print("Digite o preço: ");
			double preco = sc.nextDouble();
			System.out.print("Digite o desconto: ");
			double desc = sc.nextDouble();

			Produto prod = new Produto(cod, nome, preco, desc);
			Item item = new Item(quant, prod);
			cart.addItem(item);
			System.out.println("--------------------");
		}

		cart.imprimiLista();

		sc.close();
	}

}
