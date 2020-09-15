package br.com.isaac.sistema.teste;

import br.com.isaac.sistema.bean.Produtos;
import br.com.isaac.sistema.dao.ProdutosDAO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class TesteProdutos {

	public void salvar() {

		Produtos produtos = new Produtos();

		produtos.setDescricao("dddd");
		produtos.setValorProduto(22.5);

		ProdutosDAO dao = new ProdutosDAO();
		dao.salvar(produtos);
		System.out.println("Produtos inserido com sucesso!");

	}

	public static void main(String[] args) {
		new TesteProdutos().salvar();
	}

}
