package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Item> itens = new ArrayList<>();

	public Carrinho() {

	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public double valorItem() {
		double soma = 0;
		for (Item p : itens) {
			soma = p.subTotal();
		}
		String.format("%.2f", soma);
		return soma;
	}

	public void imprimiLista() {

		for (Item p : itens) {
			p.imprimirItem();
		}
		System.out.println();
		valorItem();
		System.out.println("Valor da compra: R$ " + String.format("%.2f", valorTotal()));
	}

	public double valorTotal() {
		double soma = 0;
		double total = 0;
		for (Item p : itens) {
			soma = p.subTotal();
			total += soma;
		}
		String.format("%.2f", total);
		return total;
	}

}
