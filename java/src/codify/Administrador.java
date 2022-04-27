package codify;

public class Administrador extends Usuario{

	private String adminID;

	public final String getAdminID() {
		return adminID;
	}

	public final void setAdminID(String adminID) {
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
	
}
