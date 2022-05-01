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

	void AdicionarConteudo(String opcao) {
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui ser� para adicionar conte�do!\n------------------------------------------");
	}
	
	void ExcluirConteudo(String opcao) {
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui ser� para excluir conte�do!\n------------------------------------------");
	}
	
	void AlterarConteudo(String opcao) {
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui ser� para alterar conte�do!\n------------------------------------------");
	}
	
	void LoginAdmin(String opcao) {
		Administrador loginAdm;
		loginAdm = new Administrador();
		
		loginAdm.setAdminID(JOptionPane.showInputDialog("Login - Admin \nDigite seu ID"));
		loginAdm.setSenha(JOptionPane.showInputDialog("Login - Admin \nDigite sua senha"));
		

		System.out.println("Email: " + loginAdm.getEmail() + "\nSenha: " + loginAdm.getSenha());
		System.out.println(
				"------------------------------------------\nLogin Administrador conclu�do!\n------------------------------------------");

	}
	
}
