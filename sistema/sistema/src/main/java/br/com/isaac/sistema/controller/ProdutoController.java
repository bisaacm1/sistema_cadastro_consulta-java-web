package br.com.isaac.sistema.controller;

import java.util.ArrayList;

import br.com.isaac.sistema.bean.Produtos;
import br.com.isaac.sistema.dao.ProdutosDAO;
import br.com.isaac.sistema.vo.ProdutosVO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class ProdutoController {

	public void salvar(Produtos produtos) {
		ProdutosDAO dao = new ProdutosDAO();

		try {
			dao.salvar(produtos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Produtos> buscarTodos() {
		ArrayList<Produtos> listaRetorno = new ArrayList<Produtos>();
		ProdutosDAO dao = new ProdutosDAO();

		try {
			listaRetorno = dao.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}

	public void excluir(Produtos produtos) {
		ProdutosDAO dao = new ProdutosDAO();

		try {
			dao.excluir(produtos);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public ArrayList<ProdutosVO> retornaProdutos() {
		ArrayList<ProdutosVO> listaVO = new ArrayList<ProdutosVO>();

		try {
			ArrayList<Produtos> listaProdutos = new ProdutosDAO().buscarTodos();
			for (Produtos produtos : listaProdutos) {
				ProdutosVO vo = new ProdutosVO();

				vo.setDescricao(produtos.getDescricao());
				vo.setValorProduto(produtos.getValorProduto());
				listaVO.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaVO;
	}

}
