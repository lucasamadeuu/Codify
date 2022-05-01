package codify;

import javax.swing.JOptionPane;

public class Usuario {

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String genero;
	private String dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	void Cadastrar(String opcao) {

		if (opcao.equals("1")) {
			Usuario novo;
			novo = new Usuario();

			novo.setNome(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu nome"));
			novo.setEmail(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu email"));
			novo.setTelefone(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite o seu telefone"));
			novo.setSenha(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite sua senha"));
			novo.setGenero(JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite seu gênero"));
			novo.setDataNascimento(
					JOptionPane.showInputDialog("Criando objeto - Usuário \nDigite sua data de nascimento"));

			System.out.println("Nome: " + novo.getNome() + "\nEmail: " + novo.getEmail() + "\nTelefone: "
					+ novo.getTelefone() + "\nSenha: " + novo.getSenha() + "\nGênero: " + novo.getGenero()
					+ "\nData de Nascimento: " + novo.getDataNascimento());
			System.out.println(
					"------------------------------------------\nCadastro concluído!\n------------------------------------------");
		}

	}

	void Alterar(String opcao) {
		Usuario altera;
		altera = new Usuario();

		altera.setNome(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o nome"));
		altera.setEmail(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o email"));
		altera.setTelefone(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite o telefone"));
		altera.setSenha(JOptionPane.showInputDialog("Alterando objeto - Usuário \nDigite a senha nova"));

		System.out.println("Nome: " + altera.getNome() + "\nEmail: " + altera.getEmail() + "\nTelefone: "
				+ altera.getTelefone() + "\nSenha: " + altera.getSenha());
		System.out.println(
				"------------------------------------------\nAlteração concluída!\n------------------------------------------");

	}

	void ExcluirConta(String opcao) {
		Usuario exclui;
		exclui = new Usuario();

		exclui.setEmail(JOptionPane.showInputDialog("Excluindo objeto - Usuário \nDigite o email"));
		exclui.setSenha(JOptionPane.showInputDialog("Excluindo objeto - Usuário \nDigite sua senha"));

		System.out.println("Email: " + exclui.getEmail() + "\nSenha: " + exclui.getSenha());
		System.out.println(
				"------------------------------------------\nExclusão de conta concluída!\n------------------------------------------");

	}
	
	void LoginUser(String opcao) {
		Usuario loginUser;
		loginUser = new Usuario();
		
		loginUser.setEmail(JOptionPane.showInputDialog("Login - Usuário \nDigite seu email"));
		loginUser.setSenha(JOptionPane.showInputDialog("Login - Usuário \nDigite sua senha"));
		
		System.out.println("Email: " + loginUser.getEmail() + "\nSenha: " + loginUser.getSenha());
		System.out.println(
				"------------------------------------------\nLogin Usuário concluído!\n------------------------------------------");

		
	}

}
