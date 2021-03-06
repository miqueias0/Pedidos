package entidades;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.OrdemStatus;

public class Ordem extends OrdemItem {
	public static  SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private Cliente cliente;
	private OrdemStatus status;
	private List<OrdemItem> ordemIten = new ArrayList<OrdemItem>();

	public Ordem() {
	}

	public Ordem(String nome, double preco, int quantidade, Date momento, Cliente cliente, OrdemStatus status) {
		super(nome, preco, quantidade);
		this.momento = momento;
		this.cliente = cliente;
		this.status = status;
	}



	public Date getMomento() {
		return momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public List<OrdemItem> getOrdemItem() {
		return ordemIten;
	}

	public void addItem(OrdemItem item) {
		ordemIten.add(item);
	}

	public void removerItem(OrdemItem item) {
		ordemIten.remove(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double total() {
		double soma = 0.0;
		for (OrdemItem p : ordemIten) {
			soma += p.subTotal();
		}
		return soma;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo da Ordem:\n");
		sb.append("Momento da Ordem: ");
		sb.append(sdf1.format(getMomento()) + "\n");
		sb.append("Status da Ordem: ");
		sb.append(getStatus() + "\n");
		sb.append("Cliente: ");
		sb.append(cliente.getNome() + " ");
		sb.append("(" + cliente.getDataDeNascimento() + ")" + " - ");
		sb.append(cliente.getEmail() + "\n");
		sb.append("Itens da Ordem:\n");
		for (OrdemItem p : ordemIten) {
				sb.append(p + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(total());
		return sb.toString();
	}
}
