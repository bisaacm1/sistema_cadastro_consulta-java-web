package br.com.isaac.sistema.dao;

import br.com.isaac.sistema.bean.Produtos;
import br.com.isaac.sistema.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class ProdutosDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public ArrayList<Produtos> buscarTodos() throws Exception {

		ArrayList<Produtos> listaRetorno = new ArrayList<Produtos>();
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = sessao.createCriteria(Produtos.class);
		criteria.addOrder(Order.asc("idProduto"));
		listaRetorno = (ArrayList<Produtos>) criteria.list();

		return listaRetorno;
	}

	public Produtos buscarPorCodigo(int idProdutos) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Produtos produto = (Produtos) sessao.get(Produtos.class, idProdutos);
		sessao.close();
		return produto;
	}

}
