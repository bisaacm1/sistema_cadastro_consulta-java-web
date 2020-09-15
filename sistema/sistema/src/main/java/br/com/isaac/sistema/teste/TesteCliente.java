package br.com.isaac.sistema.teste;

import br.com.isaac.sistema.bean.Cliente;
import br.com.isaac.sistema.dao.ClienteDAO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class TesteCliente {

	public void salvar() {

		Cliente cliente = new Cliente();

		cliente.setNome("A era do gelo");
		cliente.setRg("A era do gelo");
		cliente.setCpf("547888888");
		cliente.setDataNascimento("587/555/58");
		cliente.setEndereco("Rua");
		cliente.setNumero(11);
		cliente.setComplemento("isjisj");
		cliente.setBairro("Quitauna");
		cliente.setCidade("Osasco");
		cliente.setEstado("SP");
		cliente.setCep("06182140");
		cliente.setTelefone("11946437993");
		cliente.setCelular("5555555555555");
		cliente.setEmail("ssssss");

		ClienteDAO dao = new ClienteDAO();
		dao.salvar(cliente);
		System.out.println("Cliente inserido com sucesso!");

	}

	public static void main(String[] args) {
		new TesteCliente().salvar();
	}

}
