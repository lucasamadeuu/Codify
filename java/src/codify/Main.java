package codify;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {

	static void Voltar() {

		Scanner a = new Scanner(System.in);

		System.out.println("O que você deseja? \n1-Finalizar programa \n2-Voltar ao menu");
		System.out.println("Sua escolha: ");
		String escolha = a.next();

		if (escolha.equals("1") == true) {
			System.out.println("Programa encerrado");
			a.close();
			System.exit(0);
		}

		else if (escolha.equals("2") == true) {
			System.out.println("---------- Nova Pesquisa ----------");
		}

	}

	public static void main(String[] args) {

		int voltar = 0;
		while (voltar != 1) {

			String opcao = JOptionPane.showInputDialog(
					"Bem-vindo ao codify! \nQual objeto você deseja criar? \n 1-Usuário \n 2-Administrador \n 3-Empresa \n 4-Processo Seletivo");

			// USUÁRIO
			if (opcao.equals("1") == true) {
				Usuario user;
				user = new Usuario();

				String metodos = JOptionPane
						.showInputDialog("Qual método você deseja usar? \n1-Cadastrar \n2-Alterar \n3-Excluir");

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
					System.out.println("Opção Inválida!");
				}

				Voltar();

			}

			// ADMINISTRADOR
			else if (opcao.equals("2") == true) {
				Administrador admin;
				admin = new Administrador();

				admin.setNome(JOptionPane.showInputDialog("Administrador \nDigite o seu nome"));
				admin.setEmail(JOptionPane.showInputDialog("Administrador \nDigite o seu email"));
				admin.setSenha(JOptionPane.showInputDialog("Administrador \nDigite a sua senha"));
				admin.setAdminID(JOptionPane.showInputDialog("Administrador \nDigite o id do administrador"));

				System.out.println("Nome admin: " + admin.getNome() + "\nEmail admin: " + admin.getEmail()
						+ "\nSenha admin: " + admin.getSenha() + "\nId admin: " + admin.getAdminID());

				String metodos = JOptionPane.showInputDialog(
						"Qual método você deseja usar? \n1-Adicionar Conteúdo \n2-Alterar Conteúdo \n3-Excluir Conteúdo");

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
					System.out.println("Opção Inválida!");
				}

				Voltar();

			}

			// EMPRESA
			else if (opcao.equals("3") == true) {
				Empresa empresa;
				empresa = new Empresa();

				empresa.setNomeEmpresa(JOptionPane.showInputDialog("Empresa \nDigite o nome da empresa"));
				empresa.setDescricaoEmpresa(
						JOptionPane.showInputDialog("Empresa \nFaça uma breve descrição da empresa"));

				System.out.println("------------------------------------------\nNome empresa: "
						+ empresa.getNomeEmpresa() + "\nDescrição empresa: " + empresa.getDescricaoEmpresa()
						+ "\n------------------------------------------");

				Voltar();
			}

			// PROCESSO SELETIVO
			else if (opcao.equals("4") == true) {
				ProcessoSeletivo processo;
				processo = new ProcessoSeletivo();

				processo.setNomeEmpresa(JOptionPane.showInputDialog("Processo Seletivo \nDigite o nome da empresa"));
				processo.setDescricaoEmpresa(
						JOptionPane.showInputDialog("Processo Seletivo \nFaça uma breve descrição da empresa"));
				processo.setCargo(JOptionPane.showInputDialog("Processo Seletivo \nDigite o cargo"));
				String quantidade = JOptionPane.showInputDialog("Processo Seletivo \nDigite a quantidade de vagas");
				processo.setQuantidadeVagas((int) Double.parseDouble(quantidade));
				processo.setEnderecoSite(JOptionPane.showInputDialog("Processo seletivo \nDigite a URL do site"));
				processo.redirecionarSite();

				System.out.println("------------------------------------------\nNome empresa: "
						+ processo.getNomeEmpresa() + "\nDescrição empresa: " + processo.getDescricaoEmpresa() + "Cargo: "
						+ processo.getCargo() + "\nQuantidade vagas: " + processo.getQuantidadeVagas()
						+ "\nURL do site: " + processo.getEnderecoSite()
						+ "\n------------------------------------------");

				Voltar();
				
			}
		}

	}
}
