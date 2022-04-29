package codify;

public class MaterialApoio extends Tecnologia {

	private String nomeMaterial;
	private String tipoMaterial;
	private String nivelMaterial;

	public String getNomeMaterial() {
		return nomeMaterial;
	}

	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getNivelMaterial() {
		return nivelMaterial;
	}

	public void setNivelMaterial(String nivelMaterial) {
		this.nivelMaterial = nivelMaterial;
	}

	void redirecionarMaterial() {
		System.out.println("Voce será redirecionado para o material escolhido.");

	}
}