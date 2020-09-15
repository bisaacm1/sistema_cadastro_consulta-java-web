package br.com.isaac.sistema.vo;

public class ItemVendaVO {
	private int idItemVenda;
	private int quantidade;
	private double valor;

	public ItemVendaVO() {

	}

	public ItemVendaVO(int idItemVenda, int quantidade, double valor) {
		this.idItemVenda = idItemVenda;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getIdItemVenda() {
		return idItemVenda;
	}

	public void setIdItemVenda(int idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
