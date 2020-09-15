package br.com.isaac.sistema.vo;

public class VendaVO {

	private int idProduto;
	private String descricao;
	private int quantidade;
	private String formaPagamento;
	private String valor;
	
	public VendaVO() {
		
	}

	public VendaVO(int idProduto, String descricao, int quantidade, String formaPagamento, String valor) {
		
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.formaPagamento = formaPagamento;
		this.valor = valor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
}
