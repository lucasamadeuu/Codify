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
		System.out.println("Aqui ser� para adicionar conte�do!");
	}
	
	void ExcluirConteudo(String opcao) {
		System.out.println("Aqui ser� para excluir conte�do");
	}
	
	void AlterarConteudo(String opcao) {
		System.out.println("Aqui ser� para alterar conte�do!");
	}
	
}
