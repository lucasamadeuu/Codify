package codify;

public class ProcessoSeletivo extends Empresa{

	private String cargo;
	private int quantidadeVagas;
	private String enderecoSite;
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public String getEnderecoSite() {
		return enderecoSite;
	}

	public void setEnderecoSite(String enderecoSite) {
		this.enderecoSite = enderecoSite;
	}

	void redirecionarSite () {
		System.out.println("Você será redirecionado para o site do processo seletivo...");
	}
	
}
