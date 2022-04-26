package codify;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String opcao = JOptionPane.showInputDialog(
				"Bem-vindo ao codify! \nQual objeto voc� deseja criar? \n 1-Usu�rio \n 2-Administrador");

		//USU�RIO
		if (opcao.equals("1") == true) {
			Usuario user;
			user = new Usuario();

			String metodos = JOptionPane
					.showInputDialog("Qual m�todo voc� deseja usar? \n1-Cadastrar \n2-Alterar \n3-Excluir");

			if (metodos.equals("1") == true) {
				user.Cadastrar(opcao);
			}

			else if (metodos.equals("2") == true) {
				user.Alterar(opcao);
			}

			else if (metodos.equals("3") == true) {
				user.ExcluirConta(opcao);
			}

			else {
				System.out.println("Op��o Inv�lida!");
			}

		}
		
		//ADMINISTRADOR
		else if (opcao.equals("2") == true) {
			Administrador admin;
			admin = new Administrador();

			String metodos = JOptionPane.showInputDialog(
					"Qual m�todo voc� deseja usar? \n1-Adicionar Conte�do \n2-Alterar Conte�do \n3-Excluir Conte�do");
			
			if (metodos.equals("1") == true) {
				admin.AdicionarConteudo(opcao);
			}
			
			else if (metodos.equals("2") == true) {
				admin.AlterarConteudo(opcao);
			}
			
			else if (metodos.equals("3") == true) {
				admin.ExcluirConteudo(opcao);
			}
			
			else {
				System.out.println("Op��o Inv�lida!");
			}

		}

	}

}
