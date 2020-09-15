package br.com.isaac.sistema.teste;

import br.com.isaac.sistema.bean.Funcionario;
import br.com.isaac.sistema.dao.FuncionarioDAO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class FuncionarioTeste {

	public void salvar() {

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("A era do gelo");
		funcionario.setRg("A era do gelo");
		funcionario.setCpf("547888888");
		funcionario.setDataNascimento("587/555/58");
		funcionario.setEndereco("Rua");
		funcionario.setNumero(11);
		funcionario.setComplemento("isjisj");
		funcionario.setBairro("Quitauna");
		funcionario.setCidade("Osasco");
		funcionario.setEstado("SP");
		funcionario.setCep("06182140");
		funcionario.setTelefone("11946437993");
		funcionario.setCelular("5555555555555");
		funcionario.setEmail("ssssss");

		FuncionarioDAO dao = new FuncionarioDAO();
		dao.salvar(funcionario);
		System.out.println("Funcionario inserido com sucesso!");

	}

	public static void main(String[] args) {
		new FuncionarioTeste().salvar();
	}

}
