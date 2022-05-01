package codify;

public class Curso {

	private String nomeCurso;
	private String urlCurso;
	private String nivelCurso;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getUrlCurso() {
		return urlCurso;
	}

	public void setUrlCurso(String urlCurso) {
		this.urlCurso = urlCurso;
	}

	public String getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}

	void redirecionarCurso(){
		System.out.println("Voce será redirecionado para o curso escolhido.");
	}
	
}
