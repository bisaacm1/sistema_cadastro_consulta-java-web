
package br.com.isaac.sistema.util;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class GeraTabelas {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().openSession();
		System.out.println("Tabela criada com sucesso!");
		System.exit(0);

	}

}
