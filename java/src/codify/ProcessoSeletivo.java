package codify;

public class ProcessoSeletivo extends Empresa{

	private String cargo;
	private int quantidadeVagas;
	private String enderecoSite;
	
	public final String getCargo() {
		return cargo;
	}
	public final void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public final int getQuantidadeVagas() {
		return quantidadeVagas;
	}
	public final void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}
	public final String getEnderecoSite() {
		return enderecoSite;
	}
	public final void setEnderecoSite(String enderecoSite) {
		this.enderecoSite = enderecoSite;
	} 
	
	void redirecionarSite () {
		System.out.println("Você será redirecionado para o site do processo seletivo...");
	}
	
	
}
