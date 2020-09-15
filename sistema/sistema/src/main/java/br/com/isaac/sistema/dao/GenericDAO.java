package br.com.isaac.sistema.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.isaac.sistema.util.HibernateUtil;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public abstract class GenericDAO {

	@SuppressWarnings("finally")
	public void salvar(Object object) {
		Session sessao = null;
		Transaction transacao = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();

			sessao.saveOrUpdate(object);
			transacao.commit();
		} catch (Exception e) {
			transacao.rollback();

		} finally {
			sessao.close();

		}
	}

	public void excluir(Object object) {
		Session sessao = null;
		Transaction transacao = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();

			sessao.delete(object);
			transacao.commit();
		} catch (Exception e) {
			transacao.rollback();
			sessao.close();

		} finally {
			sessao.close();

		}

	}

}
