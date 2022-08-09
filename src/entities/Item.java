package entities;

public class Item {

	private int quant;
	private Produto prod;

	public Item(int quant, Produto prod) {
		super();
		this.quant = quant;
		this.prod = prod;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public double subTotal() {
		return prod.getPreco() * quant;
	}

	public void imprimirItem() {
		System.out.println("- " + prod.getNome() + "   preco: R$ " + String.format("%.2f", prod.getPreco()) + "   x"
				+ getQuant() + "   R$ " + String.format("%.2f", subTotal()));
	}

}
