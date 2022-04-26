package codify;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int voltar = 0;
		while(voltar != 1) {

		String opcao = JOptionPane.showInputDialog(
				"Bem-vindo ao codify! \nQual objeto voc� deseja criar? \n 1-Usu�rio \n 2-Administrador");

		//USU�RIO
		if (opcao.equals("1") == true) {
			Usuario user;
			user = new Usuario();
			
			Scanner a = new Scanner(System.in);

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
			
			  System.out.println("O que voc� deseja? \n1-Finalizar programa \n2-Voltar ao menu");
			  	System.out.println("Sua escolha: ");
			    String escolha = a.next();
			    
			    if (escolha.equals("1") == true) {
			    	System.out.println("Programa encerrado");
			    	voltar = 1;
			    }
			    
			    else if (escolha.equals("2") == true) {
			    	System.out.println("---------- Nova Pesquisa ----------");
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
}
