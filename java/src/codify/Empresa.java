package codify;

import javax.swing.JOptionPane;

public class Empresa extends Usuario{
		
		private String empresaId;

		public String getEmpresaId() {
			return empresaId;
		}

		public void setEmpresaId(String empresaId) {
			this.empresaId = empresaId;
		}
		
		void loginEmpresa() {
			
			Empresa logar = new Empresa();
			
			logar.setEmpresaId(JOptionPane.showInputDialog("Login - Empresa \nDigite seu ID"));
			logar.setSenha(JOptionPane.showInputDialog("Login - Empresa \nDigite sua senha"));
			
			System.out.println("ID Empresa: " + logar.getEmpresaId() + "\nSenha: " + logar.getSenha());
			System.out.println(
					"------------------------------------------\nLogin Empresa conclu�do!\n------------------------------------------");
			
		}
		
		void filtrarUsers() {
			System.out.println("Aqui ser� para a empresa filtrar os usu�rios!\n------------------------------------------");
		}
		
		void visualizarUsers() {
			System.out.println("Aqui ser� para a empresa visualizar os usu�rios!\n------------------------------------------");
		}
	
	}
