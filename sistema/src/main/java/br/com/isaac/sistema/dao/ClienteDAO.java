package br.com.isaac.sistema.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.isaac.sistema.bean.Cliente;
import br.com.isaac.sistema.util.HibernateUtil;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class ClienteDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public ArrayList<Cliente> buscarTodos() throws Exception {

		ArrayList<Cliente> listaRetorno = new ArrayList<Cliente>();
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = sessao.createCriteria(Cliente.class);
		criteria.addOrder(Order.asc("idCliente"));
		listaRetorno = (ArrayList<Cliente>) criteria.list();

		return listaRetorno;
	}

	public Cliente buscarPorCodigo(int idCliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Cliente cliente = (Cliente) sessao.get(Cliente.class, idCliente);
		sessao.close();
		return cliente;
	}

}
