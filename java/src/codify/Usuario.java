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

			novo.setNome(JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite o seu nome"));
			novo.setEmail(JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite o seu email"));
			novo.setTelefone(JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite o seu telefone"));
			novo.setSenha(JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite sua senha"));
			novo.setGenero(JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite seu g�nero"));
			novo.setDataNascimento(
					JOptionPane.showInputDialog("Criando objeto - Usu�rio \nDigite sua data de nascimento"));

			System.out.println("Nome: " + novo.getNome() + "\nEmail: " + novo.getEmail() + "\nTelefone: "
					+ novo.getTelefone() + "\nSenha: " + novo.getSenha() + "\nG�nero: " + novo.getGenero()
					+ "\nData de Nascimento: " + novo.getDataNascimento());
			System.out.println(
					"------------------------------------------\nCadastro conclu�do!\n------------------------------------------");
		}

	}

	void Alterar(String opcao) {
		Usuario altera;
		altera = new Usuario();

		altera.setNome(JOptionPane.showInputDialog("Alterando objeto - Usu�rio \nDigite o nome"));
		altera.setEmail(JOptionPane.showInputDialog("Alterando objeto - Usu�rio \nDigite o email"));
		altera.setTelefone(JOptionPane.showInputDialog("Alterando objeto - Usu�rio \nDigite o telefone"));
		altera.setSenha(JOptionPane.showInputDialog("Alterando objeto - Usu�rio \nDigite a senha nova"));

		System.out.println("Nome: " + altera.getNome() + "\nEmail: " + altera.getEmail() + "\nTelefone: "
				+ altera.getTelefone() + "\nSenha: " + altera.getSenha());
		System.out.println(
				"------------------------------------------\nAltera��o conclu�da!\n------------------------------------------");

	}

	void ExcluirConta(String opcao) {
		Usuario exclui;
		exclui = new Usuario();

		exclui.setEmail(JOptionPane.showInputDialog("Excluindo objeto - Usu�rio \nDigite o email"));
		exclui.setSenha(JOptionPane.showInputDialog("Excluindo objeto - Usu�rio \nDigite sua senha"));

		System.out.println("Email: " + exclui.getEmail() + "\nSenha: " + exclui.getSenha());
		System.out.println(
				"------------------------------------------\nExclus�o de conta conclu�da!\n------------------------------------------");

	}
	
	void LoginUser(String opcao) {
		Usuario loginUser;
		loginUser = new Usuario();
		
		loginUser.setEmail(JOptionPane.showInputDialog("Login - Usu�rio \nDigite seu email"));
		loginUser.setSenha(JOptionPane.showInputDialog("Login - Usu�rio \nDigite sua senha"));
		
		System.out.println("Email: " + loginUser.getEmail() + "\nSenha: " + loginUser.getSenha());
		System.out.println(
				"------------------------------------------\nLogin Usu�rio conclu�do!\n------------------------------------------");

		
	}

}
