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
		System.out.println("Aqui será para adicionar conteúdo!");
	}
	
	void ExcluirConteudo(String opcao) {
		System.out.println("Aqui será para excluir conteúdo");
	}
	
	void AlterarConteudo(String opcao) {
		System.out.println("Aqui será para alterar conteúdo!");
	}
	
}
