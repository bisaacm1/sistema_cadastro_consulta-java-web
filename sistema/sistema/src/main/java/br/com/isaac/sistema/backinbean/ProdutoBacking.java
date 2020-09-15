package br.com.isaac.sistema.backinbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.isaac.sistema.bean.Produtos;
import br.com.isaac.sistema.controller.ProdutoController;
import br.com.isaac.sistema.util.JSFUtil;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */

@ManagedBean(name = "produtosBacking")
@ViewScoped
public class ProdutoBacking {

	private int idProduto;
	private String descricao;
	private double valorProduto;

	private Produtos produtos = new Produtos();
	private Produtos produtosSelecionado = new Produtos();
	private List<SelectItem> itensProdutos;
	private List<Produtos> listarProdutos = new ArrayList<Produtos>();

	private int scrollerPage;

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

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public Produtos getProdutosSelecionado() {
		return produtosSelecionado;
	}

	public void setProdutosSelecionado(Produtos produtosSelecionado) {
		this.produtosSelecionado = produtosSelecionado;
	}

	public List<SelectItem> getItensProdutos() {
		return itensProdutos;
	}

	public void setItensProdutos(List<SelectItem> itensProdutos) {
		this.itensProdutos = itensProdutos;
	}

	public List<Produtos> getListarProdutos() {
		return listarProdutos;
	}

	public void setListarProdutos(List<Produtos> listarProdutos) {
		this.listarProdutos = listarProdutos;
	}

	public int getScrollerPage() {
		return scrollerPage;
	}

	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}

	public String salvar() {

		if (validarDados()) {
			Produtos produtos = new Produtos();

			produtos.setDescricao(descricao);

			produtos.setValorProduto(valorProduto);

			ProdutoController controller = new ProdutoController();

			try {
				controller.salvar(produtos);
				limparDados();
				JSFUtil.addInfoMessage("Produtos salvo com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao inserir o produtos!");

			}

		}

		return "";
	}

	public void limparDados() {
		descricao = null;
		valorProduto = 0;
	}

	public boolean validarDados() {

		return true;
	}

	public String excluir() {
		ProdutoController controller = new ProdutoController();

		try {
			controller.excluir(produtosSelecionado);

			JSFUtil.addInfoMessage("Produtos excluido com sucesso!");
		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao excluir Produtos!");

		}

		return "";
	}

	public String alterarProdutos() {

		idProduto = produtosSelecionado.getIdProduto();
		descricao = produtosSelecionado.getDescricao();
		valorProduto = produtosSelecionado.getValorProduto();

		return "alterarProdutos.xhtml";
	}

	public String alterar() {

		if (validarDados()) {

			produtosSelecionado.setIdProduto(idProduto);
			produtosSelecionado.setDescricao(descricao);
			produtosSelecionado.setValorProduto(valorProduto);

			ProdutoController controller = new ProdutoController();

			try {
				controller.salvar(produtosSelecionado);
				limparDados();
				JSFUtil.addInfoMessage("Produtos alterado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao alterado o produtos!");

			}

		}

		return "";
	}

	public String listarProdutos() {
		this.scrollerPage = 1;

		try {
			this.listarProdutos = new ProdutoController().buscarTodos();

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os produtoss");
		}
		return "";
	}

	@PostConstruct
	public void init() {
		listarProdutos();
	}
}