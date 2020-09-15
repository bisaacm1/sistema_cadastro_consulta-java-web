package br.com.isaac.sistema.dao;

import br.com.isaac.sistema.bean.ItemVenda;
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
public class ItemVendaDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public ArrayList<ItemVenda> buscarTodos() throws Exception {

		ArrayList<ItemVenda> listaRetorno = new ArrayList<ItemVenda>();

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Criteria criteria = sessao.createCriteria(ItemVenda.class);

		criteria.addOrder(Order.asc("idItemVenda"));

		listaRetorno = (ArrayList<ItemVenda>) criteria.list();
		sessao.close();
		return listaRetorno;

	}

	public ItemVenda buscarPorCodigo(int idItemVenda) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		ItemVenda itemVenda = (ItemVenda) sessao.get(ItemVenda.class, idItemVenda);
		sessao.close();
		return itemVenda;
	}

}
