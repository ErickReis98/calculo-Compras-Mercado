package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	private double desconto;

	public Produto(int codigo, String nome, double preco, double desconto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	List<Produto> cart = new ArrayList<>();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void addCarrinho(Produto produto) {
		cart.add(produto);
	}

	public void removeCarrinho(Produto produto) {
		cart.remove(produto);
	}

}
