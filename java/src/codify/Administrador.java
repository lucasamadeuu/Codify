package codify;

import javax.swing.JOptionPane;

public class Administrador extends Usuario{

	private String adminID;
	
	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	void LoginAdmin(String opcao) {
		Administrador loginAdm;
		loginAdm = new Administrador();
		
		loginAdm.setAdminID(JOptionPane.showInputDialog("Login - Admin \nDigite seu ID"));
		loginAdm.setSenha(JOptionPane.showInputDialog("Login - Admin \nDigite sua senha"));
		

		System.out.println("ID Admin: " + loginAdm.getAdminID() + "\nSenha: " + loginAdm.getSenha());
		System.out.println(
				"------------------------------------------\nLogin Administrador conclu�do!\n------------------------------------------");

	}
	
	void AdicionarConteudo(String opcao) {
		System.out.println("Bem-vindo, aqui ser� para adicionar conte�do!\n------------------------------------------");
	}
	
	void ExcluirConteudo(String opcao) {
		System.out.println("Bem-vindo, aqui ser� para excluir conte�do!\n------------------------------------------");
	}
	
	void AlterarConteudo(String opcao) {
		System.out.println("Bem-vindo, aqui ser� para alterar conte�do!\n------------------------------------------");
	}
	
}
