/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isaac.sistema.dao;

import br.com.isaac.sistema.bean.Funcionario;
import br.com.isaac.sistema.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class FuncionarioDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public ArrayList<Funcionario> buscarTodos() throws Exception {

		ArrayList<Funcionario> listaRetorno = new ArrayList<Funcionario>();

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Criteria criteria = sessao.createCriteria(Funcionario.class);

		criteria.addOrder(Order.asc("idFuncionario"));

		listaRetorno = (ArrayList<Funcionario>) criteria.list();
		sessao.close();
		return listaRetorno;

	}

	public Funcionario buscarPorCodigo(int idFuncionario) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Funcionario funcionario = (Funcionario) sessao.get(Funcionario.class, idFuncionario);
		sessao.close();
		return funcionario;
	}

}
