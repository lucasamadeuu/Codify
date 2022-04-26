package codify;

import javax.swing.JOptionPane;

public class Usuario {

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final String getTelefone() {
		return telefone;
	}
	public final void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public final String getSenha() {
		return senha;
	}
	public final void setSenha(String senha) {
		this.senha = senha;
	}
	
	void Cadastrar (String opcao) {
		
		if (opcao.equals("1") == true) {
			Usuario novo;
			novo = new Usuario();

			novo.setNome(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu nome"));
			novo.setEmail(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu email"));
			novo.setTelefone(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu telefone"));
			novo.setSenha(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite sua senha"));

			System.out.println("Nome: " + novo.getNome() + "\nEmail: " + novo.getEmail() + "\nTelefone: "
					+ novo.getTelefone() + "\nSenha: " + novo.getSenha());
			System.out.println("Cadastro concluído!");
		}
		
	}
	
	void Alterar (String opcao) {
		Usuario altera;
		altera = new Usuario();
		
		altera.setNome(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o nome"));
		altera.setEmail(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o email"));
		altera.setTelefone(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o telefone"));
		altera.setSenha(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite a senha nova"));
		
		System.out.println("Nome: " + altera.getNome() + "\nEmail: " + altera.getEmail() + "\nTelefone: "
				+ altera.getTelefone() + "\nSenha: " + altera.getSenha());
		System.out.println("Alteração concluída!");
		
	}
	
	void ExcluirConta (String opcao) {
		Usuario exclui;
		exclui = new Usuario();
		
		exclui.setEmail(JOptionPane.showInputDialog("Excluindo objeto - Usuário \nDigite o email"));
		exclui.setSenha(JOptionPane.showInputDialog("Excluindo objeto - Usuário \nDigite sua senha"));
		
		System.out.println("Email: " + exclui.getEmail() + "\nSenha: " + exclui.getSenha());
		System.out.println("Exclusão de conta concluída!!");
		
	}
	
}
