package codify;

import javax.swing.JOptionPane;

public class Empresa extends Usuario{
		
		private int CNPJ;
		private String email;
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getCNPJ() {
			return CNPJ;
		}

		public void setCNPJ(int cNPJ) {
			CNPJ = cNPJ;
		}

		void loginEmpresa() {
			
			Empresa logar = new Empresa();
			
			logar.setEmail(JOptionPane.showInputDialog("Login - Empresa \nDigite seu email"));
			logar.setSenha(JOptionPane.showInputDialog("Login - Empresa \nDigite sua senha"));
			
			System.out.println("E-mail Empresa: " + logar.getEmail() + "\nSenha: " + logar.getSenha());
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
