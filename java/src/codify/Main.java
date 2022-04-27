package codify;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {

	static void Voltar() {

		Scanner a = new Scanner(System.in);

		System.out.println("O que voc� deseja? \n1-Finalizar programa \n2-Voltar ao menu");
		System.out.println("Sua escolha: ");
		String escolha = a.next();

		if (escolha.equals("1")) {
			System.out.println("Programa encerrado");
			a.close();
			System.exit(0);
		}

		else if (escolha.equals("2")) {
			System.out.println("---------- Nova Pesquisa ----------");
		}

	}

	public static void main(String[] args) {

		int voltar = 0;
		while (voltar != 1) {

			String opcao = JOptionPane.showInputDialog(
					"Bem-vindo ao codify! \nQual objeto voc� deseja criar? \n 1-Usu�rio \n 2-Administrador \n 3-Empresa \n 4-Processo Seletivo");

			// USU�RIO
			if (opcao.equals("1")) {
				Usuario user;
				user = new Usuario();

				String metodos = JOptionPane
						.showInputDialog("Qual m�todo voc� deseja usar? \n1-Cadastrar \n2-Alterar \n3-Excluir");

				if (metodos.equals("1")) {
					user.Cadastrar(opcao);
				}

				else if (metodos.equals("2")) {
					user.Alterar(opcao);
				}

				else if (metodos.equals("3")) {
					user.ExcluirConta(opcao);
				}

				else {
					System.out.println("Op��o Inv�lida!");
				}

				Voltar();

			}

			// ADMINISTRADOR
			else if (opcao.equals("2")) {
				Administrador admin;
				admin = new Administrador();

				admin.setNome(JOptionPane.showInputDialog("Administrador \nDigite o seu nome"));
				admin.setEmail(JOptionPane.showInputDialog("Administrador \nDigite o seu email"));
				admin.setSenha(JOptionPane.showInputDialog("Administrador \nDigite a sua senha"));
				admin.setAdminID(JOptionPane.showInputDialog("Administrador \nDigite o id do administrador"));

				System.out.println("Nome admin: " + admin.getNome() + "\nEmail admin: " + admin.getEmail()
						+ "\nSenha admin: " + admin.getSenha() + "\nId admin: " + admin.getAdminID());

				String metodos = JOptionPane.showInputDialog(
						"Qual m�todo voc� deseja usar? \n1-Adicionar Conte�do \n2-Alterar Conte�do \n3-Excluir Conte�do");

				if (metodos.equals("1")) {
					admin.AdicionarConteudo(opcao);
				}

				else if (metodos.equals("2")) {
					admin.AlterarConteudo(opcao);
				}

				else if (metodos.equals("3")) {
					admin.ExcluirConteudo(opcao);
				}

				else {
					System.out.println("Op��o Inv�lida!");
				}

				Voltar();

			}

			// EMPRESA
			else if (opcao.equals("3")) {
				Empresa empresa;
				empresa = new Empresa();

				empresa.setNomeEmpresa(JOptionPane.showInputDialog("Empresa \nDigite o nome da empresa"));
				empresa.setDescricaoEmpresa(
						JOptionPane.showInputDialog("Empresa \nFa�a uma breve descri��o da empresa"));

				System.out.println("------------------------------------------\nNome empresa: "
						+ empresa.getNomeEmpresa() + "\nDescri��o empresa: " + empresa.getDescricaoEmpresa()
						+ "\n------------------------------------------");

				Voltar();
			}

			// PROCESSO SELETIVO
			else if (opcao.equals("4")) {
				ProcessoSeletivo processo;
				processo = new ProcessoSeletivo();

				processo.setNomeEmpresa(JOptionPane.showInputDialog("Processo Seletivo \nDigite o nome da empresa"));
				processo.setDescricaoEmpresa(
						JOptionPane.showInputDialog("Processo Seletivo \nFa�a uma breve descri��o da empresa"));
				processo.setCargo(JOptionPane.showInputDialog("Processo Seletivo \nDigite o cargo"));
				String quantidade = JOptionPane.showInputDialog("Processo Seletivo \nDigite a quantidade de vagas");
				processo.setQuantidadeVagas((int) Double.parseDouble(quantidade));
				processo.setEnderecoSite(JOptionPane.showInputDialog("Processo seletivo \nDigite a URL do site"));
				processo.redirecionarSite();

				System.out.println("------------------------------------------\nNome empresa: "
						+ processo.getNomeEmpresa() + "\nDescri��o empresa: " + processo.getDescricaoEmpresa() + "Cargo: "
						+ processo.getCargo() + "\nQuantidade vagas: " + processo.getQuantidadeVagas()
						+ "\nURL do site: " + processo.getEnderecoSite()
						+ "\n------------------------------------------");

				Voltar();
				
			}
		}

	}
}
