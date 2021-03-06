package entidades;

public class OrdemItem extends Produto {
	protected int quantidade;


	public OrdemItem() {
	}

	public OrdemItem(String nome, double preco, int quantidade) {
		super(nome, preco);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double subTotal() {
		return preco * quantidade;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + ", $");
		sb.append(preco + ", Quantidade: ");
		sb.append(quantidade + ", subtotal: $");
		sb.append(subTotal());
		return sb.toString();
	}
}
