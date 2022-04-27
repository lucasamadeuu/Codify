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
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui será para adicionar conteúdo!\n------------------------------------------");
	}
	
	void ExcluirConteudo(String opcao) {
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui será para excluir conteúdo!\n------------------------------------------");
	}
	
	void AlterarConteudo(String opcao) {
		System.out.println("------------------------------------------\nBem-vindo " + adminID + " aqui será para alterar conteúdo!\n------------------------------------------");
	}
	
}
