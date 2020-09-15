package br.com.isaac.sistema.vo;

public class ProdutosVO {

	private int idProduto;
	private String descricao;
	private double valorProduto;
	
	public ProdutosVO() {
		
	}
	
	public ProdutosVO(int idProduto, String descricao, double valorProduto) {

		this.idProduto = idProduto;
		this.descricao = descricao;
		this.valorProduto = valorProduto;
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

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	
	
	
	
}
