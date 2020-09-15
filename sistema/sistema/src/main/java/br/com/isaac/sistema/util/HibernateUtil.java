package br.com.isaac.sistema.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		return new AnnotationConfiguration().configure().buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
