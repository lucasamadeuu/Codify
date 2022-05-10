package codify;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {

	static void Voltar() {

		Scanner a = new Scanner(System.in);

		System.out.println("O que você deseja? \n1-Finalizar programa \n2-Voltar ao menu");
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

			String opcao = JOptionPane.showInputDialog("Bem-vindo ao codify! \nQual objeto você deseja criar? "
					+ "\n 1-Usuário \n 2-Administrador \n 3-Empresa \n 4-Quiz \n 5-Tecnologia");

			// USUÁRIO
			if (opcao.equals("1")) {
				Usuario user = new Usuario();

				String metodos = JOptionPane.showInputDialog(
						"Qual método você deseja usar? \n1-Cadastrar \n2-Alterar \n3-Excluir \n4-Login");

				if (metodos.equals("1")) {
					user.Cadastrar(opcao);
				}

				else if (metodos.equals("2")) {
					user.Alterar(opcao);
				}

				else if (metodos.equals("3")) {
					user.ExcluirConta(opcao);
				}

				else if (metodos.equals("4")) {
					user.LoginUser(opcao);
				}

				else {
					System.out.println("Opção Inválida!");
				}

				Voltar();

			}

			// ADMINISTRADOR
			else if (opcao.equals("2")) {
				Administrador admin = new Administrador();

				admin.LoginAdmin(opcao);

				String metodos = JOptionPane.showInputDialog("Qual método você deseja usar?"
						+ "\n1-Adicionar Conteúdo \n2-Alterar Conteúdo \n3-Excluir Conteúdo");

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
					System.out.println("Opção Inválida!");
				}

				Voltar();

			}

			// EMPRESA
			else if (opcao.equals("3")) {
				Empresa empresa = new Empresa();

				empresa.loginEmpresa();

				String metodos = JOptionPane.showInputDialog(
						"Qual método você deseja usar?" + "\n1-Filtrar Usuários \n2-Visualizar Usuários");

				if (metodos.equals("1")) {
					empresa.filtrarUsers();
				}

				else if (metodos.equals("2")) {
					empresa.visualizarUsers();
				}

				else {
					System.out.println("Opção Inválida!");
				}

				Voltar();
			}

			// QUIZ
			else if (opcao.equals("4")) {
				Quiz quiz = new Quiz();

				quiz.setNomeQuiz(JOptionPane.showInputDialog("Quiz \nDigite o nome do quiz"));
				String tempo = JOptionPane.showInputDialog("Quiz \nDigite o tempo do quiz");
				quiz.setTempoQuiz((int) Double.parseDouble(tempo));
				quiz.setNomeTecnologia(JOptionPane.showInputDialog("Quiz \nDigite o nome da tecnologia"));
				quiz.setTipoTecnologia(JOptionPane.showInputDialog("Quiz \nDigite o tipo de tecnologia"));

				System.out.println("------------------------------------------\nNome do quiz: " + quiz.getNomeQuiz()
						+ "\nTempo do quiz: " + quiz.getTempoQuiz() + "\nNome da tecnologia: " + quiz.getNomeTecnologia()
						+ "\nTipo Tecnologia: " + quiz.getTipoTecnologia()
						+ "\n------------------------------------------");

				Voltar();

			}

			// TECNOLOGIA
			else if (opcao.equals("5")) {
				Tecnologia tech = new Tecnologia();

				tech.setNomeTecnologia(JOptionPane.showInputDialog("Tecnologia \nDigite o nome da tecnologia"));
				tech.setTipoTecnologia(JOptionPane.showInputDialog("Tecnologia \nDigite o tipo de tecnologia"));

				System.out.println("------------------------------------------\nNome tecnologia: "
						+ tech.getNomeTecnologia() + "\nTipo tecnologia: " + tech.getTipoTecnologia()
						+ "\n------------------------------------------");

				Voltar();
			}
		}

	}
}
